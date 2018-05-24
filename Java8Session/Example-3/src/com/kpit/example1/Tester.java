package com.kpit.example1;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Tester {

	public static void main(String[] args) {
	
		Class c = Demo.class;
		
		Method methods[] = c.getMethods();
		
		for(Method m : methods)
		{
			System.out.println(m.getName());
			Parameter p[] = m.getParameters();
			
			for(Parameter temp : p)
			{
				System.out.println(temp.getName() + " "+ temp.getType().getName());
			}
		}
		
		
		//IAccount account = new AccountImpl();
		//account.addAccount(null);		
	}	
}

class Demo
{
	public void add(int x, int y)
	{
		
	}
	
}

