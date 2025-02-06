package by.iyclass._02_spring_jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "airplane_id")
    private List<Passenger> passengers;

    @Autowired
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
