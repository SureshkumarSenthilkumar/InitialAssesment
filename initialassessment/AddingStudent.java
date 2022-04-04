package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddingStudent {

	public AddingStudent(ArrayList<Students> listOfStudents) throws InputMismatchException{ 
		Scanner scan = new Scanner(System.in);
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
		System.out.println("Student " + student.name + " added");
	}

}
