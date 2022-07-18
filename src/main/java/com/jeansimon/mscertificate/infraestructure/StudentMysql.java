package com.jeansimon.mscertificate.infraestructure;

import com.jeansimon.mscertificate.domain.Student;
import com.jeansimon.mscertificate.domain.StudentRepository;

public class StudentMysql implements StudentRepository {
    @Override
    public Student save(Student student) {
        Student studentResult = new Student();
        studentResult.setId("1");
        studentResult.setName("MySql: " + student.getName());
        return studentResult;
    }
}
