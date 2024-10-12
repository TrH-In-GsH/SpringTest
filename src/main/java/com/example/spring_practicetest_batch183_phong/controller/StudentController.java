/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring_practicetest_batch183_phong.controller;

import com.example.spring_practicetest_batch183_phong.model.Student;
import com.example.spring_practicetest_batch183_phong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String viewHomePage(Model model) {
        model.addAttribute("listStudents", studentService.getAllStudents());
        return "index";
    }
    
    @GetMapping("/students")
    public String getStudents(Model model) {
        // Thêm dữ liệu cần thiết vào model
        model.addAttribute("students", studentService.findAll());
        return "students"; // Trả về tên template
    }

    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "new_student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "update_student";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") String id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
