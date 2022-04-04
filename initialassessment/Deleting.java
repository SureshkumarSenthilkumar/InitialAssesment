package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Deleting {

	public Deleting(ArrayList<Students> listOfStudents) throws InputMismatchException{ 
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the id of the student to delete");
		int id1 = scan.nextInt(); 
		Iterator<Students> iterator =  listOfStudents.iterator();
		while(iterator.hasNext()) {
			if (iterator.next().id == id1)
				iterator.remove();
			else {
				System.out.println("Id not present");
			}
		}   
	}

}
