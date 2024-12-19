package com.student.springdemo.student;

import java.util.List;


public interface StudentService {
        List<Student> findAllStudents();
        Student save(Student s);
        Student findByEmail(String email);
        Student update(Student s);
        void delete(String email);

}
