package com.example.JpaLibrary.service;

import com.example.JpaLibrary.models.Student;
import com.example.JpaLibrary.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Student get(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student deleteById(int id) {
        Student student = this.get(id);
        studentRepository.deleteById(id);
        return student;
    }

    public Student updateStudent(int id, Student student) {
        return null;
    }
}
