package com.in.staticfinal.keywords;

public class StaticVariableClassLevelDataStore {
	
	static int a= 123;
	public void add() {
		a= a+1;
								
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableClassLevelDataStore obj1 =new StaticVariableClassLevelDataStore();
		obj1.add();
		System.out.println("obj1");
		System.out.println(obj1.a);
		StaticVariableClassLevelDataStore obj2 =new StaticVariableClassLevelDataStore();
		obj2.add();
		System.out.println("obj2");
		System.out.println(obj2.a);
		StaticVariableClassLevelDataStore obj3 =new StaticVariableClassLevelDataStore();
		obj3.add();
		System.out.println("obj3");
		System.out.println(obj3.a);
		StaticVariableClassLevelDataStore obj4 =new StaticVariableClassLevelDataStore();
		obj4.add();
		System.out.println("obj4");
		System.out.println(obj4.a);



	}

}
