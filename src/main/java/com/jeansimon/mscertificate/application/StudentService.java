package com.jeansimon.mscertificate.application;

import com.jeansimon.mscertificate.domain.Student;
import com.jeansimon.mscertificate.domain.StudentRepository;

public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
