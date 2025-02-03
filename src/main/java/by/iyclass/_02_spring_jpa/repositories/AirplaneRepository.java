package by.iyclass._02_spring_jpa.repositories;

import by.iyclass._02_spring_jpa.entities.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
}
