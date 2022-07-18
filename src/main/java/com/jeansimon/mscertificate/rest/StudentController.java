package com.jeansimon.mscertificate.rest;

import com.jeansimon.mscertificate.application.StudentService;
import com.jeansimon.mscertificate.domain.Student;
import com.jeansimon.mscertificate.domain.StudentRepository;
import com.jeansimon.mscertificate.infraestructure.StudentOracle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentRepository studentRepository = new StudentOracle();

    StudentService studentService = new StudentService(studentRepository);

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        //Student student = new Student();
        return studentService.saveStudent(student);
    }
}
