package com.student.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    Student findByEmail(String email);
    Student deleteByEmail(String email);
}
