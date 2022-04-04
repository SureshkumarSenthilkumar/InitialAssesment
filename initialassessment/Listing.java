package com.tyss.initialassessment;

import java.util.ArrayList;
import java.util.Iterator;

public class Listing {

	public Listing(ArrayList<Students> listOfStudents) { 
		Iterator<Students> iterator =  listOfStudents.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		} 
	}

}
