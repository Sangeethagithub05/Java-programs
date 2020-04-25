package org.cts;

public class CollegeDetails implements ClientDetails, CourseDetails{
	private void stella() {
		// TODO Auto-generated method stub

	}

	@Override
	public void java() {
	String name="java";
	System.out.println(name);
		
	}

	@Override
	public void clienID() {
		int a=1;
		int b=2;
		System.out.println("My Client ID is"+"\t"+(a+b));
		
	}
	public static void main(String[] args) {
		CollegeDetails c=new CollegeDetails();
		c.java();
		c.clienID();
		
	}

}
