package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sorting {
	Sorting(ArrayList<Students> listOfStudents) throws InputMismatchException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the method you want to sort the students list \nEnter the 1 for sort by id "
				+ "\nEnter the 2 for sort by name \nEnter the 3 for sort by marks");
		 
		SortById sortById = new SortById();
		SortByName sortByName = new SortByName(); 
		SortByMarks sortByMarks = new SortByMarks();
		
		int order = scan.nextInt();
		switch(order) {
		case 1:
			System.out.println("Sorted by id");
			Collections.sort(listOfStudents, sortById);
			break;
		case 2:
			System.out.println("Sorted by name");
			Collections.sort(listOfStudents, sortByName);
			break;
		case 3:
			System.out.println("Sorted by marks");
			Collections.sort(listOfStudents, sortByMarks);
			break;
		default:
			System.out.println("you entered wrong option By default sorted by id");
			Collections.sort(listOfStudents, sortById);
			break;	
		} 
		new Listing(listOfStudents); 
	}

	 
}
