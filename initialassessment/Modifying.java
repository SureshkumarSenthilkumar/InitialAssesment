package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;
public class Modifying {

	public Modifying(ArrayList<Students> listOfStudents) throws InputMismatchException{ 
		System.out.println("Enter the id of the student to modify");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt(); 
		ListIterator<Students> iterator =  listOfStudents.listIterator(); 
		while(iterator.hasNext()) {
			if (iterator.next().getId() == id) {
				System.out.println("Enter the id ");
				int rollno = scan.nextInt();
				System.out.println("Enter the name ");
				String name = scan.next();
				System.out.println("Enter the standard ");
				String standard = scan.next(); 
				System.out.println("Enter the mark ");
				int mark = scan.nextInt(); 
				iterator.set(new Students(rollno, name ,standard, mark));
				System.out.println("Student " + name +  " edited"); 
			}
			else {
				System.out.println("Id not present");
			}
		}
	}

}
