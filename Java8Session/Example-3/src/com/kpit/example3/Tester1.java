package com.kpit.example3;

public class Tester1 {
	
	public static void main(String[] args) {
		
		//Sample s = new Tester1() :: demo;
		
		/*Sample s = Tester1 :: demo;
		s.display();*/
		
		Sample s = Tester1 :: new;
		s.display();		
	}
	
	public Tester1()
	{
		System.out.println("I am inside a constructor...");
	}
			
	static public void demo()
	{
		System.out.println("I am inside a method....");		
	}
}
