package com.in.supermethods.calling;

import javafx.scene.Parent;

public class Child extends parent {
	public void childMethod() {	
		
		System.out.println("child method");	
		super.dummyMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 =new Child();
		c1.childMethod();

	}

}
