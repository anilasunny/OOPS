package com.in.inheritence;

public class SeleniumAutomation extends ApiAutomation {
	public void seleniummethod()
	{
		System.out.println("mutilevel inheritence");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumAutomation s1 =new SeleniumAutomation();
		s1.automationclass();
		s1.seleniummethod();
		s1.apimethod();
	}

}
