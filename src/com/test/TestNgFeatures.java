package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNgFeatures {
	
	@Test(priority=-1)
	public void loginTest() {
		//int i= 9/0;
		//	throw new SkipException("RAMYA");
		Assert.assertEquals(true, false);	
	}
	
	@Test(dependsOnMethods="regPageTest", priority=2)
	public void homePageTest() {
		
		System.out.println("Home Page Test");
		Assert.assertEquals(true, true);
	}
	
	@Test(dependsOnMethods= {"loginTest", "homePageTest"}, priority=1)
	public void searchPageTest() {
		System.out.println("Seach Page Test");
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods="loginTest", priority=3)
	public void regPageTest() {
		System.out.println("Reg Page Test");
		Assert.assertEquals(true, true);
	}
	
	@Test(groups="A")
	public void aissing() {
		System.out.println("It should run");
	}
	
//test case with -1 or 0 priority will execute first and then TC with no priority will be executed (with no priority it will follow alphabetic order)
	//and after that TC with priority will be executed
	
	@Test(priority=0)
	public void loginTest1() {
		
	}


}
