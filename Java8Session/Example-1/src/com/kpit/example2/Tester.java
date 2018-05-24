package com.kpit.example2;

public class Tester {

	public static void main(String[] args) {
		
		Sample addition = (n1,n2)-> {return n1+n2;};
		
		Sample substraction = (n1,n2)-> (n1-n2);
		Sample multiplication = (n1,n2)-> (n1*n2);
		Sample division = (n1,n2)-> (n1/n2);
		
		System.out.println(addition.operation(23, 12));
		System.out.println(substraction.operation(56, 23));
		System.out.println(multiplication.operation(34, 2));
		System.out.println(division.operation(56, 12));		
	}
	
}
