package com.in.staticfinal.keywords;

public class StaticVariableObjectLevelDemo {
	int a=10;
	public void add() {
		a=a+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableObjectLevelDemo obj1 =new StaticVariableObjectLevelDemo();
		obj1.add();
		System.out.println("obj1");
		System.out.println(obj1.a);
		StaticVariableObjectLevelDemo obj2 =new StaticVariableObjectLevelDemo();
		obj2.add();
		System.out.println("obj2");
		System.out.println(obj2.a);
		StaticVariableObjectLevelDemo obj3 =new StaticVariableObjectLevelDemo();
		obj3.add();
		System.out.println("obj3");
		System.out.println(obj3.a);
		StaticVariableObjectLevelDemo obj4 =new StaticVariableObjectLevelDemo();
		obj4.add();
		System.out.println("obj4");
		System.out.println(obj4.a);
	}

}
