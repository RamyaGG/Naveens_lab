package com.test;

import org.testng.annotations.*;

public class TestNgFeatures {
	
	@Test(priority=0)
	public void loginTest() {
		//int i= 9/0;
		
	}
	
	@Test(dependsOnMethods="regPageTest", priority=2)
	public void homePageTest() {
		
		System.out.println("Home Page Test");
		
	}
	
	@Test(dependsOnMethods= {"loginTest", "homePageTest"}, priority=1)
	public void searchPageTest() {
		System.out.println("Seach Page Test");
		
	}
	
	@Test(dependsOnMethods="loginTest", priority=3)
	public void regPageTest() {
		System.out.println("Reg Page Test");
		
	}
	
	@Test( groups="A")
	public void aissing() {
		System.out.println("It should run");
	}
	

	
//	@Test
//	public void loginTest() {
//		
//	}


}
