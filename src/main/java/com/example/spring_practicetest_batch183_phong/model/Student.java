/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring_practicetest_batch183_phong.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.springframework.data.annotation.Id;


/**
 *
 * @author DELL
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "StudentID", length = 10)
    private String studentID;
    
    @Column(name = "Batch", length = 30)
    private String batch;
    
    @Column(name = "Name", length = 30)
    private String name;
    
    @Column(name = "Gender")
    private boolean gender; // 1: Male, 0: Female
    
    // Getters and Setters
}
