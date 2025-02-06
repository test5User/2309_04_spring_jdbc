package by.iyclass._02_spring_jpa;

import by.iyclass._02_spring_jpa.configs.AppConfig;
import by.iyclass._02_spring_jpa.entities.Airplane;
import by.iyclass._02_spring_jpa.entities.Passenger;
import by.iyclass._02_spring_jpa.repositories.AirplaneRepository;
import by.iyclass._02_spring_jpa.repositories.PassengerRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var repository = ctx.getBean(AirplaneRepository.class);
        var passRepository = ctx.getBean(PassengerRepository.class);
//        var airplane = ctx.getBean("boeing736", Airplane.class);
//        System.out.println("We just created airplane: " + airplane);
//
//        airplane = repository.save(airplane);
//        System.out.println("Airplane after save: " + airplane);
//
//        airplane.setPlaces(104);
//        airplane = repository.save(airplane);
//        System.out.println("Airplane after change: " + airplane);

//        System.out.println(repository.findByModel("VanSun"));
//        System.out.println("___________________________________");
//        printList(repository.findByModelLike("%ein%"));
//        System.out.println("___________________________________");
//        printList(repository.findByPlacesBetween(100, 250));
//        System.out.println("___________________________________");
//        printList(repository.findByPlacesBetweenAndModelNotLike(100, 250, "%ein%"));
//        System.out.println("___________________________________");
//        printList(repository.allPlanes());
//        System.out.println("___________________________________");
//        printList(repository.concretePlanesSql("%Su%", 100));
        var passengers = (List<Passenger>)ctx.getBean("passengers");
        passRepository.saveAll(passengers);
        var plane = ctx.getBean("boeing736", Airplane.class);

        repository.save(plane);
        System.out.println(repository.findByModel("Boeing-736"));

    }

    private static void printList(List<Airplane> list) {
        list.forEach(System.out::println);
    }
}
