package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Displaying extends Students {

	public Displaying(int id, String name, String standard, int marks) {
		super(id, name, standard, marks); 
	}
	
	static void options() {
		System.out.println("Enter the number you want to perform opertaion");
		System.out.println("enter 1 for add student");
		System.out.println("enter 2 for edit student");
		System.out.println("enter 3 for delete student");
		System.out.println("enter 4 for print list of students");
		System.out.println("enter 5 for get student details");
		System.out.println("enter 6 for Sorting the list of student");
		System.out.println("enter 7 for exit"); 
	}
	
	
	public static void main(String[] args) { 
		
		ArrayList<Students>listOfStudents = new ArrayList<Students>();
		
		Displaying.options();
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean exit = true;
		while(exit == true) {
			
			
			int options = scan.nextInt(); 
			
			switch(options) {
			
			case 1: 
				System.out.println("Enter the id");
				int id = scan.nextInt();
				System.out.println("Enter the name");
				String name = scan.next();
				System.out.println("Enter the standard");
				String standard = scan.next();
				System.out.println("Enter the mark");
				int mark = scan.nextInt();
				Students student = new Students(id, name, standard, mark);
				listOfStudents.add(student); 
				System.out.println("Adding Student");
				System.out.println("enter the number to perform next operation");
				break;
			case 2:
				System.out.println("Enter the id of the student you want to modify");
				int id4 = scan.nextInt(); 

				ListIterator<Students> iterator5 =  listOfStudents.listIterator(); 
				while(iterator5.hasNext()) {
					if (iterator5.next().getId() == id4) {
						System.out.println("Enter the id ");
						int id6 = scan.nextInt();
						System.out.println("Enter the name ");
						String name1 = scan.next();
						System.out.println("Enter the standard ");
						String name2 = scan.next(); 
						System.out.println("Enter the mark ");
						int marks = scan.nextInt(); 
						iterator5.set(new Students(id6, name1, name2, marks));
					}
				}
				System.out.println("Edit Student");
				break;
			case 3:
				System.out.println("Delete Stduent");
				System.out.println("Enter the id the of the student");
				int id1 = scan.nextInt(); 
				Iterator<Students> iterator =  listOfStudents.iterator();
				while(iterator.hasNext()) {
					if (iterator.next().id == id1)
						iterator.remove();
					System.out.println("Removed Succesfully");
				}
				break;
			case 4:
				Iterator<Students> iterator1 =  listOfStudents.iterator();
				while(iterator1.hasNext()) {
					System.out.println(iterator1.next()); 
				}
				System.out.println("enter the number to perform next operation");
				break;
			case 5:
				System.out.println("Enter the id of the student to view");
				int id3 = scan.nextInt();
				Iterator<Students> iterator3 =  listOfStudents.iterator();
				while(iterator3.hasNext()) {
					if (iterator3.next().id == id3)
						System.out.println(iterator3.next()); 
				}
				System.out.println("Get Stduent");
				break;
			case 6:
				System.out.println("Enter the method you want to sort the students list");
				System.out.println("Enter the 1 for sort by id");
				System.out.println("Enter the 2 for sort by name");
				System.out.println("Enter the 3 for sort by marks");
				
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
				Iterator<Students> iterator4 =  listOfStudents.iterator();
				while(iterator4.hasNext()) {
					System.out.println(iterator4.next()); 
				}
		
				System.out.println("Sorting the list");
				break;
			case 7:
				System.out.println("exit");
				exit = false;
				scan.close();
				break;
			default:
				System.out.println("Check what you have entered");
			}
		}

	}

}
