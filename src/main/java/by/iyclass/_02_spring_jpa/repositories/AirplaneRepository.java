package by.iyclass._02_spring_jpa.repositories;

import by.iyclass._02_spring_jpa.entities.Airplane;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
    //find or get, delete, update, query
    //By
    //Model, Places (причем AND OR LIKE BETWEEN)
    Airplane findByModel(String model);
    List<Airplane> findByModelLike(String modelRegex);
    List<Airplane> findByPlacesBetween(int from, int to);
    List<Airplane> findByPlacesBetweenAndModelNotLike(int from, int to, String modelRegex);

    @Query("FROM Airplane")
    List<Airplane> allPlanes();

    @Query(value = "SELECT * FROM airplane WHERE id > 2", nativeQuery = true)
    List<Airplane> allPlanesSql();

    @Query(value = "SELECT * FROM airplane WHERE model LIKE ?1 AND places > ?2", nativeQuery = true)
    List<Airplane> concretePlanesSql(String regex, int places);
}
