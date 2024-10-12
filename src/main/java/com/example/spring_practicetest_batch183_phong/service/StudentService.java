/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring_practicetest_batch183_phong.service;

import com.example.spring_practicetest_batch183_phong.model.Student;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(String studentID);
    void saveStudent(Student student);
    void deleteStudent(String studentID);

    public Object findAll();
}
