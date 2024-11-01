/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // For user input

		// ToDo 5: Fix the error
		// The error fix would typically relate to constructors or class definitions.

		// Creating Freshman and Senior classes
		Freshman std1 = new Freshman("James", 20, 12); // name, age, credits
		Senior std2 = new Senior("John", 30, 90); // name, age, credits

		// ToDo 12: Set the GPA of the student using the scanner and user input
		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double gpa = scanner.nextDouble();
		std1.setGpa(gpa); // Set the GPA
		System.out.println(std1); // Print Freshman details

		System.out.print("Enter GPA for " + std2.getName() + ": ");
		gpa = scanner.nextDouble();
		std2.setGpa(gpa); // Set the GPA
		System.out.println(std2); // Print Senior details

		// Closing the scanner
		scanner.close();
	}
}
