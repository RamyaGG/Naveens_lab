package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExceptionTimeOutTest {

//	@Test(invocationTimeOut=1) // timeOut=2000 it shd be executed within 2 sec. otherwise it will be terminateds
//	public void infiniteLoopTest() {
//		int i =1;
//		while (i==1) {
//			System.out.println(i);
//		}
//	}
	
	//INT: Witout try catch block how will you handle exceptions in testNG
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x="100A";
		Integer.parseInt(x);
		
	}
	
}

//expectedExceptions=NumberFormatException.class 
// using this we can handle exception in TestNG
