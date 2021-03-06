package com.kpit.example1;

public class Tester1 {

	public static void main(String[] args) {
		
		Sample s = new SampleImpl();
		s.display();	
		
		s = new Sample()
				{
					@Override
					public void display() {
						System.out.println("This is using annonymous inner class.");
					}
				};
		s.display();
		
		
		s = () -> System.out.println("Hello this is using lambda expression");
		s.display();		
		
	}	
}
