package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class GettingStudent {

	public GettingStudent(ArrayList<Students> listOfStudents) throws InputMismatchException {
		System.out.println("Enter the id of the student to view");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		Iterator<Students> iterator =  listOfStudents.iterator();
		while(iterator.hasNext()) {
			Students student = iterator.next();
			if (student.id == id)
				System.out.println(student); 
		}  
	}

}
