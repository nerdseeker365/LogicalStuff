package com.corejava.collection;

public class Employee {

	private int empid;
	private String employeeName;

	public Employee(int empid, String employeeName) {
		super();
		this.empid = empid;
		this.employeeName = employeeName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/*
	 * @Override public boolean equals(Object obj) {
	 * System.out.println("equals() method called..");
	 * System.out.println("Generated equals() method result::"+super.equals(obj));
	 * //return super.equals(obj);
	 * 
	 * //downcasting Employee employee=(Employee)obj;
	 * if(this.getEmpid()==employee.getEmpid() &&
	 * this.getEmployeeName().equals(employee.getEmployeeName())){ return true;
	 * //duplicate object } return false; //unique object }
	 */
	@Override
	public int hashCode() {
		System.out.println("hashCode() method called..");
		System.out.println("Generated HashCode::"+super.hashCode());
		System.out.println("Overridden HashCode::"+empid);
		return empid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", employeeName=" + employeeName + "]";
	}

}
