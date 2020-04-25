package org.cts;

public class Overload {
	private void emp(int empid, String name,String email,float sal) {
		// TODO Auto-generated method stub
System.out.println("the information is"+empid+name);
	}
	
	public static void main(String[] args) {
		Overload l=new Overload();
		l.emp(123,"sangeetha","Sangeetha@gmail.com", 3.4f);
	}
 {
	

}
}
