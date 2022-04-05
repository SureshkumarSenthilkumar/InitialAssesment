package com.tyss.initialassessment;

public class Students implements Comparable<Students>{
	int id;
	String name;
	String standard;
	int marks;
	public Students(int id, String name, String standard, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.marks = marks;
	}
	 
	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "The student id is " + id + ", name is " + name + ", standard is " + standard + ", marks is " + marks ;
	}



	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return 0;
	}

	 
	
	
	
	
 
		
	
}
