package com.corejava.java8;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		//return s1.getAge()-s2.getAge();//Ascending Order
		return s2.getAge()-s1.getAge(); //Descending Order
	}

}
