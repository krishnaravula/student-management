package com.sai.sm.dao;

import com.sai.sm.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudents() {
        String sql= "SELECT * FROM STUDENTS";

        List<Student> query = jdbcTemplate.query(sql, new StudentRowMapper());
        return query;
    }

    @Override
    public void addStudent(Student student) {

        String sql = "INSERT INTO STUDENTS(name,mobile,country) values(?,?,?)";

        Object[] sqlArgs={student.getName(),student.getMobile(),student.getCountry()};

        jdbcTemplate.update(sql,sqlArgs);
        System.out.println(" 1 Record updated ");

    }

    @Override
    public Student getStudent(int id) {
        String sql= "SELECT * FROM STUDENTS WHERE id=?";
        Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "UPDATE STUDENTS SET name=?,mobile=?,country=? where id=?";
        Object[] args={student.getName(),student.getMobile(),student.getCountry(),student.getId()};
        jdbcTemplate.update(sql,args);
    }

    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM STUDENTS WHERE ID=?";
        jdbcTemplate.update(sql,id);
    }
}
