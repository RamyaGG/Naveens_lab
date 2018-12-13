package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		SearchContext driver1 = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://freecrm.com");

		driver.findElement(By.name("username")).sendKeys("RamyaGG");
		driver.findElement(By.name("password")).sendKeys("Framya28!");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();

		Thread.sleep(3000);
		/*
		 * use this for login: if you get Element is not clickable at point (1182, 117)
		 * WebElement loginBtn =
		 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
		 * js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();",loginBtn);﻿
		 */

		driver.switchTo().frame("mainpanel");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[@title='Messages']")).click();

		/*
		 * defaultContent() is used to come back to the default page after switching to
		 * frame. WebElement fr = driver.findElementById("theIframe");
		 * driver.switchTo().frame(fr); Then to move out of frame use:-
		 * driver.switchTo().defaultContent();﻿
		 */

		//driver.switchTo().defaultContent();
		//driver.switchTo().frame("leftpanel");
		//Thread.sleep(2000);	
	}
}