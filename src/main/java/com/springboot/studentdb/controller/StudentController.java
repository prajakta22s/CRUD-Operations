package com.springboot.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springboot.studentdb.entity.Student;
import com.springboot.studentdb.repository.StudentRepository;
import com.springboot.studentdb.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping("/")
    public List<Student> getAllStudents() {
    	
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public Student createStudent(@RequestBody Student student) {
    	
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
    	studentService.deleteStudent(id);
    }
}
//
//package com.springboot.studentdb.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.springboot.studentdb.entity.Student;
//import com.springboot.studentdb.repository.StudentRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping("/")
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Student> getStudentById(@PathVariable Long id) {
//        return studentRepository.findById(id);
//    }
//
//    @PostMapping("/")
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @PutMapping("/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
//        Optional<Student> optionalStudent = studentRepository.findById(id);
//        if (optionalStudent.isPresent()) {
//            Student student = optionalStudent.get();
//            student.setName(updatedStudent.getName());
//            student.setAge(updatedStudent.getAge());
//            student.setEmail(updatedStudent.getEmail());
//            return studentRepository.save(student);
//        }
//        return null; // Or throw an exception indicating the student was not found
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable Long id) {
//        studentRepository.deleteById(id);
//    }
//}
