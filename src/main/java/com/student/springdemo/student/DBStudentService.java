package com.student.springdemo.student;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DBStudentService implements StudentService {
    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();

    }

    @Override
    public Student save(Student s) {
        return this.repository.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return this.repository.save(s);
    }

    @Override
    public void delete(String email) {
        this.repository.deleteByEmail(email);
    }

}
