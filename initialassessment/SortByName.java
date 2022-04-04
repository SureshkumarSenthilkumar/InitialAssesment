package com.tyss.initialassessment;

import java.util.Comparator;

public class SortByName implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
