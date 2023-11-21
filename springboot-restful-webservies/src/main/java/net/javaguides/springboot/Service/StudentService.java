package net.javaguides.springboot.Service;

import net.javaguides.springboot.Entity.Student;
import net.javaguides.springboot.Repository.StudentRepository;
import net.javaguides.springboot.dto.StudentDto;

import java.util.List;


public interface StudentService {
    StudentDto createUser(StudentDto student);
    StudentDto getStudentById(int id);

   List<StudentDto> getAllStudent();

    StudentDto updateStudent(StudentDto student, int rollNo);

   void deleteStudent(int rollNo);

}
