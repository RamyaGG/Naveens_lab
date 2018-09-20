package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
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

	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assertions is a kind of Validations
		//Title is not Matched will be printed if it fails
		//How will test expected result with actual one
		Assert.assertEquals(title, "Google123", "Title is not Matched");
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']/a/img")).isDisplayed();
	
		Assert.assertTrue(b);
	//	Assert.assertEquals(b, true); --> this will work
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
