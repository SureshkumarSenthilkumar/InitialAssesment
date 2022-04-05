package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Deleting {

	public Deleting(ArrayList<Students> listOfStudents) throws InputMismatchException{ 
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the id of the student to delete");
		int id = scan.nextInt(); 
		Iterator<Students> iterator =  listOfStudents.iterator();
		while(iterator.hasNext()) {
			Students student = iterator.next();
			if (student.id == id) {
				iterator.remove();
				System.out.println("Student " + student.name + " deleted");
				break;
			}else {
				System.out.println(" not present");
			}
		}   
	}

}
