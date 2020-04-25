package org.accenture;

import org.cts.Inheritance;

public class Motor extends Inheritance{
	@Override
	public void bike() {
		System.out.println("My bike is pulsar");
	}
public static void main(String[] args) {
	Motor m= new Motor();
	m.bike();
}
}
