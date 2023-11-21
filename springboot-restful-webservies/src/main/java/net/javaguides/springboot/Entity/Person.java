package net.javaguides.springboot.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pID;
    private String firstName;
    private String lastName;

}
