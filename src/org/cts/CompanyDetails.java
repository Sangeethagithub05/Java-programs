package org.cts;

public class CompanyDetails extends EmployeeDetails1{

	@Override
	public void empid() {
		// TODO Auto-generated method stub
		int empID=123;
	
		System.out.println("Employee ID is"+empID);
		
	}
	
public static void main(String[] args) {
	CompanyDetails c=new CompanyDetails();
	c.emppid();
	c.empname();
}
}
