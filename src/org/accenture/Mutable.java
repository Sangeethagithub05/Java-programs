package org.accenture;

public class Mutable {
	public static void main(String[] args) {
		System.out.println("Mutable string");
		String s1="Greens";
		String s2="Tech";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String ans=s1.concat(s2);
		System.out.println(ans);
		System.out.println(System.identityHashCode(ans));
		System.out.println("Immutable string");
		StringBuffer a1=new StringBuffer("Greens");
		String a2="Tech";
		StringBuffer Z=new StringBuffer(a2);
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(Z));
		a1.append(Z);
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1));
	}

}
