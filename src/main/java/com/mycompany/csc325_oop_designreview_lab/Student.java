/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {  // ToDo 1: Make this class a child of Human
    private double gpa;  // Field for GPA

    // Constructor for Student class
    public Student(String name, int age) {
        super(name, age);  // ToDo 6: Call the constructor of the Human class
    }

    // Overloaded constructor for Freshman and Senior
    public Student(String name, int age, int credits) {
        super(name, age);
        // Set credits if needed, e.g., this.credits = credits;
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // ToDo 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Student Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
    }
}
