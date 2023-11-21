//package net.javaguides.springboot.Controller;
//
//import lombok.AllArgsConstructor;
//import net.javaguides.springboot.Entity.Student;
//import net.javaguides.springboot.Service.StudentService;
//import net.javaguides.springboot.Service.impl.StudentServiceImpl;
//import net.javaguides.springboot.dto.StudentDto;
//import net.javaguides.springboot.exception.ErrorDetails;
//import net.javaguides.springboot.exception.ResponseNotFoundException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.context.request.WebRequest;
//
//import java.net.http.HttpResponse;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//@RestController // --combination of @Controller and @ResponseBody
//@RequestMapping("/student")
//@AllArgsConstructor
//public class StudentController {
//        private StudentService studentService;
//        @PostMapping("/createstudent")
//        public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto student){
//            StudentDto savedStudentDto = studentService.createUser(student);
//            return new ResponseEntity<>(savedStudentDto, HttpStatus.CREATED);
//        }
//        @GetMapping("/get/{id}")
//        public ResponseEntity<StudentDto> getStudentById(@PathVariable int id){
//
//            StudentDto studentDto = studentService.getStudentById(id);
//
//            if(studentDto != null)
//                return ResponseEntity.ok(studentDto);
//
//            else
//                return ResponseEntity.ofNullable(studentDto);
//        }
//
//        //get all users API
//        @GetMapping("/allstudents")
//        public ResponseEntity<List<StudentDto>> getAllStudents(){
//
//            List<StudentDto> allStudentsDto = studentService.getAllStudent();
//
//            return new ResponseEntity(allStudentsDto, HttpStatus.OK);
//        }
//        //update student
//        @PutMapping("/update/{id}")
//        public ResponseEntity<StudentDto> updateUser(@RequestBody StudentDto student, @PathVariable("id") int studentId){
//            StudentDto updatedStudentDto = studentService.updateStudent(student, studentId);
//            return ResponseEntity.ok(updatedStudentDto);
//        }
//
//        @DeleteMapping("/delete/{id}")
//        public ResponseEntity<String> deleteStudent(@PathVariable("id") int rollNo){
//            studentService.deleteStudent(rollNo);
//            return new ResponseEntity<>("Student deleted successfully!", HttpStatus.OK);
//        }
//
////        @ExceptionHandler(ResponseNotFoundException.class)
////        public ResponseEntity<ErrorDetails> HandleResourceNotFoundException(ResponseNotFoundException ex, WebRequest webReq){
////            ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), webReq.getDescription(true),"user not found");
////            return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
////        }
//}
