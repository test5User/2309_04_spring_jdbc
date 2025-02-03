package by.iyclass._02_spring_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull private String model;
    @NonNull private int places;
}
