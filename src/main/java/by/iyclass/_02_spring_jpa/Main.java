package by.iyclass._02_spring_jpa;

import by.iyclass._02_spring_jpa.configs.AppConfig;
import by.iyclass._02_spring_jpa.entities.Airplane;
import by.iyclass._02_spring_jpa.repositories.AirplaneRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var repository = ctx.getBean(AirplaneRepository.class);
//        var airplane = ctx.getBean("boeing736", Airplane.class);
//        System.out.println("We just created airplane: " + airplane);
//
//        airplane = repository.save(airplane);
//        System.out.println("Airplane after save: " + airplane);
//
//        airplane.setPlaces(104);
//        airplane = repository.save(airplane);
//        System.out.println("Airplane after change: " + airplane);
    }
}
