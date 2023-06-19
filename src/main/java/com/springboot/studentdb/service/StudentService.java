package com.springboot.studentdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentdb.entity.Student;
import com.springboot.studentdb.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setEmail(updatedStudent.getEmail());
            return studentRepository.save(student);
        }
        return null; // Or throw an exception indicating the student was not found
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

//package com.springboot.studentdb.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.springboot.studentdb.entity.Student;
//import com.springboot.studentdb.repository.StudentRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    public Optional<Student> getStudentById(Long id) {
//        return studentRepository.findById(id);
//    }
//
//    public Student createStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    public Student updateStudent(Long id, Student updatedStudent) {
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
//    public void deleteStudent(Long id) {
//        studentRepository.deleteById(id);
//    }
//}
