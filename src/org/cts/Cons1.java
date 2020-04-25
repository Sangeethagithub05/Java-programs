package org.cts;

public class Cons1 extends Cons{
	public Cons1() {
		super(100,"Sangeetha");
		System.out.println("Defaulf cons");
	}
	public Cons1(int empid,String name) {
		super(200,"viji");
		System.out.println("para"+empid+name);
}
	public static void main(String[] args) {
		Cons1 constructor= new Cons1();
		Cons1 construct = new Cons1();
	}

}
