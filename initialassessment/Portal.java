package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Portal extends Students {

	public Portal(int id, String name, String standard, int marks) {
		super(id, name, standard, marks);
		// TODO Auto-generated constructor stub
	}
 

	static void options() {
		System.out.println("Enter the number to perform opertaion \nEnter 1 for add student \nEnter 2 for edit student \nEnter 3 for delete student "
				+ "\nEnter 4 for print list of students \nEnter 5 for getting individual student details \nEnter 6 for Sorting the list of student \nEnter 7 for exit");
	}

	static void nextOperation() {
		System.out.println("enter the number to perform operation");
	}

	public static void main(String[] args) { 
		
		ArrayList<Students>listOfStudents = new ArrayList<Students>();
		
		Portal.options();
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
		boolean exit = true;
		while(exit == true) {
			
			int options = scan.nextInt();
				
			switch(options) {
			
			case 1:  
				new AddingStudent(listOfStudents);
				Portal.nextOperation();
				break;
			case 2:  
				new Modifying(listOfStudents); 
				Portal.nextOperation();
				break;
			case 3:  
				new Deleting(listOfStudents); 
				Portal.nextOperation();
				break;
			case 4: 
				new Listing(listOfStudents);
				Portal.nextOperation();
				break;
			case 5:  
				new ListingIndividualStudent(listOfStudents);
				Portal.nextOperation();
				break;
			case 6: 
				new Sorting(listOfStudents);
				Portal.nextOperation();
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

