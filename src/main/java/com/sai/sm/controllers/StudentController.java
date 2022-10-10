package com.sai.sm.controllers;

import com.sai.sm.api.Student;
import com.sai.sm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {


    @Autowired
    private StudentService studentService;


    @GetMapping("/showStudent")
    public String showStudentList(Model model) {
        List<Student> studentList = studentService.loadStudents();
        for (Student temp : studentList) {
            System.out.println(temp);
        }
        model.addAttribute("students", studentList);
        return "student-list";
    }


    @GetMapping("/addStudent")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }


    @PostMapping("/save-student")
    public String saveStudent(Student student) {
        if(student.getId()==0){
            studentService.addStudent(student);
        } else {
            studentService.updateStudent(student);
        }


        return "redirect:/showStudent";

    }

    @ResponseBody
    @GetMapping("thankYou")
    public String thankYou() {
        return "Thank you. Record is updated";
    }



    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("userId") int id,Model model) {

        Student student = studentService.getStudent(id);
        model.addAttribute("student",student);
        return "add-student";
    }




    @GetMapping("/deleteStudent")
    public String updateStudent(@RequestParam("userId") int id) {

    studentService.deleteStudent(id);

        return "redirect:/showStudent";
    }
}
