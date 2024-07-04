package com.in.hierarchical.inheritence;

public class Son extends Father{
	public void sonMethod()
	{
		System.out.println("This the method of class son");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 =new Son();
		s1.sonMethod();
		s1.methodFather();
	}

}
