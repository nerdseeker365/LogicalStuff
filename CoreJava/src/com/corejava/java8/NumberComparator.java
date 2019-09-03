package com.corejava.java8;

import java.util.Comparator;

public class NumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		//return s1.getStudentNumber()-s2.getStudentNumber(); //numberwise sorting
		return s2.getStudentNumber()-s1.getStudentNumber();
	}

}
