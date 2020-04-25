package org.accenture;

public class Literal {
public static void main(String[] args) {
	System.out.println("Literal string");
	String s1="Greens";
	String s2="greens";
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println("Non-literal string");
	String x1=new String("Greens");
	String x2=new String("Greens");
	System.out.println(System.identityHashCode(x1));
	System.out.println(System.identityHashCode(x2));
	
}
}
