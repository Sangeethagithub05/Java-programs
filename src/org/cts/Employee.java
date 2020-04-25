package org.cts;


public class Employee extends EmployeeDetails1{
	public Employee() {
	super(456);
	System.out.println("Default");
	
	}
	
	public Employee(int studid) {
		
		// TODO Auto-generated constructor stub
		System.out.println(studid);
		
	}
	

	public static void main(String[] args) {
	Employee t=new Employee();
	
	

	}
}

