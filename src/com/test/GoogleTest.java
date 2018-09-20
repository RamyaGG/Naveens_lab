package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/*
 * TestNG will start the execution on the basis of given annotations which internally calls the JVM 
 * so we dont need main() method in testng class  */


public class GoogleTest {
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  
		  driver.get("http://www.google.com");
		  
	}

	@Test(priority=1, groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']/a/img")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test1");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test1");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
