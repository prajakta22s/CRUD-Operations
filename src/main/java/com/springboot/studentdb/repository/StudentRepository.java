package com.springboot.studentdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.studentdb.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}


//package com.springboot.studentdb.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.springboot.studentdb.entity.Student;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student, Long> {
//
//}
