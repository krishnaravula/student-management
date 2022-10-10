package com.sai.sm.service;

import com.sai.sm.api.Student;

import java.util.List;

public interface StudentService {
    List<Student> loadStudents();
    void addStudent(Student student);

    Student getStudent(int id);

    void  updateStudent(Student student);


    void deleteStudent(int id);
}
