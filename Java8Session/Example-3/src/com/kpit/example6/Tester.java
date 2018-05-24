package com.kpit.example6;

import java.util.Arrays;
import java.util.List;

public class Tester {
	
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Sachin","Ramesh","Suresh","Karan","Anil","Naman","Rajesh");
		
		/*for(String name : list)
		{
			if(name.startsWith("R"))
				System.out.println(name);
		}*/
		
		//list.stream().forEach(item->System.out.println(item));
		
		list.stream().filter(name->name.startsWith("R")).forEach(item->System.out.println(item));
		System.out.println(list.stream().map(name->name.toUpperCase()).count());
		System.out.println(list.stream().map(name->name.toUpperCase()).filter(name->name.contains("A")).count());		
	}
}
