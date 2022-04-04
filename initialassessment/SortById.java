package com.tyss.initialassessment;

import java.util.Comparator;

public class SortById implements Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

	
}
