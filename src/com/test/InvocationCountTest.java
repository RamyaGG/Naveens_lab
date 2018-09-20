package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	//How many times you want to execute the same test case
	//if want to  dump the data into the system. in such case we can use

	@Test(invocationCount=10)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is "+c);
	}
	
	
}
