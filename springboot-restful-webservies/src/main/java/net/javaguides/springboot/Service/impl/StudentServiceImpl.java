//package net.javaguides.springboot.Service.impl;
//
//import lombok.AllArgsConstructor;
//import net.javaguides.springboot.Entity.Student;
//import net.javaguides.springboot.Repository.StudentRepository;
//import net.javaguides.springboot.Service.StudentService;
//import net.javaguides.springboot.dto.StudentDto;
//import net.javaguides.springboot.exception.ResponseNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service // --represents the service class that implements Service interface
//@AllArgsConstructor
//public class StudentServiceImpl implements StudentService {
//    @Autowired
//    StudentRepository studentRepo;
//    @Override
//    public StudentDto createUser(StudentDto student) {
//        Student saveStudent = new Student(student.g,student.getFirstName(),student.getLastName(),student.getParent());
//        Student savedStudent = studentRepo.save(saveStudent);
//        StudentDto savedStudentDto = new StudentDto(savedStudent.getSRollNo(),savedStudent.getFirstName(),savedStudent.getLastName(),savedStudent.getParent());
//        return savedStudentDto;
//    }
//
//    @Override
//    public StudentDto getStudentById(int id) {
//        Student student = studentRepo.findById(id).orElseThrow(() -> new ResponseNotFoundException("user", "id", id));
//        StudentDto studentDto = new StudentDto(student.getSRollNo(),student.getFirstName(),student.getLastName(),student.getParent());
//
//        return studentDto;
//    }
//
//    @Override
//    public List<StudentDto> getAllStudent() {
//        List<StudentDto> getAllStudentsDto = new ArrayList<>();
//        for (Student student :studentRepo.findAll()) {
//            getAllStudentsDto.add(new StudentDto(student.getSRollNo(),student.getFirstName(),student.getLastName(),student.getParent()));
//        }
//        return getAllStudentsDto;
//    }
//
//    @Override
//    public StudentDto updateStudent(StudentDto student, int rollNo) {
//        Student updatestudent = studentRepo.findById(rollNo).get();
//        updatestudent.setFirstName(student.getFirstName());
//        updatestudent.setLastName(student.getLastName());
//        updatestudent.setParent(student.getParent());
//        Student updatedStudent = studentRepo.save(updatestudent);
//
//        StudentDto updatedStudentDto = new StudentDto(updatedStudent.getSRollNo(),updatedStudent.getFirstName(),updatedStudent.getLastName(), updatedStudent.getParent());
//
//        return updatedStudentDto;
//    }
//
//    @Override
//    public void deleteStudent(int rollNo) {
//        studentRepo.deleteById(rollNo);
//    }
//
//
//}
