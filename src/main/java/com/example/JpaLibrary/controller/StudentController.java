package com.example.JpaLibrary.controller;

import com.example.JpaLibrary.dtos.CreateStudentRequest;
import com.example.JpaLibrary.dtos.UpdateStudentRequest;
import com.example.JpaLibrary.models.Student;
import com.example.JpaLibrary.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("")
    public Student createStudent(@RequestBody @Valid CreateStudentRequest createStudentRequest){
        return studentService.create(createStudentRequest.to());
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.get(id);
    }
    @GetMapping("/all")
    public List<Student> getStudentByAll(){
        return studentService.getAll();
    }
    @DeleteMapping("{id}")
    public Student deleteById(@PathVariable int id){
        return studentService.deleteById(id);
    }
    @PutMapping("")
    public Student updateStudent(@RequestParam int id,
                                 @RequestBody @Valid UpdateStudentRequest updateStudentRequest){
        return studentService.updateStudent(id , updateStudentRequest.to());
    }
}