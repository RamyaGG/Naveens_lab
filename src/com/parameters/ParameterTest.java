package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * Passing Parameters from testNg.xml (using @Parameters Annotation for Environment Variables):
• How to pass parameter from testing.xml to Test Cases
• What is @Parameters annotation in TestNG
• How to configure testing.xml file with Parameters tag
• How to define Environment Variables in testng.xml
• Run your test cases with testing.xml file
 * 
 * 
 */

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "env", "browser", "url", "emailId" })
	public void yahooLoginTest(String env, String browser, String url, String emailId) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

		driver.get(url);

		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailId); // enter username
																						 
		driver.findElement(By.xpath("//*[@id='login-signin']")).click(); // click on next button
																			

	}

}