package com.in.thissuper.keywords;

public class First {
	public First() {
		this(10,12);
		System.out.println("Default constructor of Parent");
	}
	public First( int a) {
		this(10,12,13);
		System.out.println("one parameterised constructor of Parent");
	}
	public First(int a ,int b) {
		System.out.println("Two parameterised constructor of Parent");
		
	}
	public First(int a ,int b,int c) {
		this();
		System.out.println("Three parameterised constructor of Parent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f1 =new First();

	}

}
