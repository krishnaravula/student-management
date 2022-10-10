package com.sai.sm.dao;

import com.sai.sm.api.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Student student = new Student();

        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setCountry(resultSet.getString("country"));
        student.setMobile(resultSet.getLong("mobile"));

        return student;
    }
}
