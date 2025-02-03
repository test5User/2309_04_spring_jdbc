package by.iyclass._01_spring_jdbc.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private int age;
}
