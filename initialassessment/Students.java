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

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
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
