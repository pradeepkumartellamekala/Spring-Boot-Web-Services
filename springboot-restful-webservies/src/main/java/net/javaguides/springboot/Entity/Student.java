package net.javaguides.springboot.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity // --represents this class is a Jpa Entity
@Table(name = "Students") // -- to configure table details(will be saved in db as mentioned)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // -- primary key generation strategy
    private int sRollNo;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = true)
    private String lastName;
    @Column(nullable = false)
    private String parent;
}
