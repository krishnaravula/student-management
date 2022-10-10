package com.sai.sm.dao;

import com.sai.sm.api.Student;


import java.util.List;

public interface StudentDAO {

    List<Student> loadStudents();

   void addStudent(Student student);

   Student getStudent(int id);

   public void updateStudent(Student student);

    void deleteStudent(int id);
}
