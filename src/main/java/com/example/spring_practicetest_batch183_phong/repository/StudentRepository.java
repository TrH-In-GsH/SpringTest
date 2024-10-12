/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring_practicetest_batch183_phong.repository;

import com.example.spring_practicetest_batch183_phong.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}

