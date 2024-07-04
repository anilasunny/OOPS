package com.in.inheritence;

public class ApiAutomation extends Automation{
	public void apimethod()
	{
		System.out.println("api automation class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiAutomation a1 =new ApiAutomation();
		
		a1.apimethod();
		a1.automationclass();
		
	}

}
