package com.corejava.java8;

public class Student implements Comparable<Student>{

	private int studentNumber;
	private String studentName;
	private int age;
	private String gender;

	public Student(int studentNumber, String studentName, int age, String gender) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", age=" + age + ", gender="
				+ gender + "]";
	}

	@Override
	public int compareTo(Student student) {
		//Ascending Order
		return this.getStudentNumber()-student.getStudentNumber(); //102,103=-1
		//Descending Order
		//return student.getStudentNumber()-this.getStudentNumber(); //103-102=1
	}

}
