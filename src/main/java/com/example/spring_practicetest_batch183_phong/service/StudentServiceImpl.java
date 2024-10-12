/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring_practicetest_batch183_phong.service;

import com.example.spring_practicetest_batch183_phong.model.Student;
import com.example.spring_practicetest_batch183_phong.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    /**
     *
     * @return
     */
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(String studentID) {
        return studentRepository.findById(studentID).orElse(null);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String studentID) {
        studentRepository.deleteById(studentID);
    }

    @Override
    public Object findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

