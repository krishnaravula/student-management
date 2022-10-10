package com.sai.sm.service;

import com.sai.sm.api.Student;
import com.sai.sm.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;


    @Override
    public List<Student> loadStudents() {
        List<Student> studentList = studentDAO.loadStudents();
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);

    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
