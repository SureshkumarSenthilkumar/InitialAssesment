package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Displaying extends Students {

	public Displaying(int id, String name, String standard, int marks) {
		super(id, name, standard, marks);
	}

	static void options() {
		System.out.println("Enter the number to perform opertaion");
		System.out.println("enter 1 for add student");
		System.out.println("enter 2 for edit student");
		System.out.println("enter 3 for delete student");
		System.out.println("enter 4 for print list of students");
		System.out.println("enter 5 for get student details");
		System.out.println("enter 6 for Sorting the list of student");
		System.out.println("enter 7 for exit");
	}

	static void nextOperation() {
		System.out.println("enter the number to perform operation");
	}

	public static void main(String[] args) { 
		
		ArrayList<Students>listOfStudents = new ArrayList<Students>();
		
		Displaying.options();
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
		boolean exit = true;
		while(exit == true) {
			
			int options = scan.nextInt();
				
			switch(options) {
			
			case 1:  
				new AddingStudent(listOfStudents);
				Displaying.nextOperation();
				break;
			case 2:  
				new Modifying(listOfStudents); 
				Displaying.nextOperation();
				break;
			case 3:  
				new Deleting(listOfStudents); 
				Displaying.nextOperation();
				break;
			case 4: 
				new Listing(listOfStudents);
				Displaying.nextOperation();
				break;
			case 5: 
				new GettingStudent(listOfStudents);
				Displaying.nextOperation();
				break;
			case 6: 
				new Sorting(listOfStudents);
				Displaying.nextOperation();
				break;
			case 7:
				System.out.println("exit");
				exit = false; 
				break;
			default:
				System.out.println("enter the number within listed options");
				break;
			}
		}
		}
		catch (InputMismatchException e) {
				System.out.println("Check what you have entered"); 
			}
		scan.close();
		}
	}

