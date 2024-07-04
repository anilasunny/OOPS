package com.in.hierarchical.inheritence;

public class Daughter extends Father {
	public void daughtermethod() {
		System.out.println("This is daughter method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		d.daughtermethod();
		d.methodFather();
	}

}
