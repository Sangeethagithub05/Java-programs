package org.accenture;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		System.out.println("Plese enter your emp id");
	Scanner s= new Scanner(System.in);	
	int empid=s.nextInt();
	System.out.println("My emp id is"+"\t"+empid);
	System.out.println("Plesae enter your salary");
	Scanner sc=new Scanner(System.in);
	float sal=sc.nextFloat();
	System.out.println("My sal is"+"\t"+sal);
	System.out.println("Enter your institute name");
	Scanner n= new Scanner(System.in);
	String name=n.nextLine();
	System.out.println("My institue name is"+name);
	
	
	

	
	}
}
