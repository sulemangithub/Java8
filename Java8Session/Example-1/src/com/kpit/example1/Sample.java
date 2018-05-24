package com.kpit.example1;

@FunctionalInterface
public interface Sample {
	
	void display();
	
	default void show()
	{
		System.out.println("Hello");
	}
}
