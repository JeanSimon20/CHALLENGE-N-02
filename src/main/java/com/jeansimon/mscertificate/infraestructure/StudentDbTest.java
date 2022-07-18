package com.jeansimon.mscertificate.infraestructure;

import com.jeansimon.mscertificate.domain.Student;
import com.jeansimon.mscertificate.domain.StudentRepository;

public class StudentDbTest implements StudentRepository {
    @Override
    public Student save(Student student) {
        Student studentResult = new Student();
        studentResult.setId("1");
        studentResult.setName("name Test");
        return studentResult;
    }


}
