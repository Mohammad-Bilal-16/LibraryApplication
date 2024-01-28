package com.example.JpaLibrary.repository;

import com.example.JpaLibrary.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {
}
