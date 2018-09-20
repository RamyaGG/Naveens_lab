package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.test.utility.TestUtil;

/*
Data Driven Framework in Selenium WebDriver with TestNG DataProvider - Part 3: DataProvider In TestNG

+How to use @dataProvider annotation
+How to fetch test data from excel using data provider utility
+How to define @dataProvider with @Test annotation in TestNG
+How to parameterize @Test - Test Case using TesNG- data providers

 */

public class AmazonRegTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_newcust");
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();

	}
	
	//if there are five col in excel then it means there are five
	//parameters in your @test annotaions
	
	@Test(dataProvider="getTestData", priority=1)
	public void amazonRegPageTest(String yourname, String mobileno, String email, String password) {
		
		driver.findElement(By.id("ap_customer_name")).clear();
		driver.findElement(By.id("ap_customer_name")).sendKeys(yourname);
		
		driver.findElement(By.id("ap_phone_number")).clear();
		driver.findElement(By.id("ap_phone_number")).sendKeys(mobileno);
		
	
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys(email);
		
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	

}
