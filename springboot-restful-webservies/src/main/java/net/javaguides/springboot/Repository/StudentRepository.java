package net.javaguides.springboot.Repository;

import net.javaguides.springboot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
