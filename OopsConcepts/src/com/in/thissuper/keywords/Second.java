package com.in.thissuper.keywords;

public class Second extends First{
	public Second()
	{	
		this(10);
		System.out.println("Default constructor of Child");
	}
	public Second(int a)
	{  
		this(10,12);
		System.out.println("One parameterised constructor of Child");
	}
	public Second(int a, int b)
			
	{  
		super(10);
		System.out.println("Two parameterised constructor of Child");
	}
	public Second(int a, int b,int c)
	{   this();
		System.out.println("Three parameterised constructor of Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s1 =new Second(10,12,11);

	}

}
