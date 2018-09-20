package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		//get test data from excel
		Xls_Reader reader = new Xls_Reader("H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\com\\testdata\\FacebookReg.xlsx");

		String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);
		
		String lastName = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastName);
		
		String mobileNo = reader.getCellData("RegTestData", "mobileno", 2);
		System.out.println(mobileNo);
		
		String email = reader.getCellData("RegTestData", "email", 2);
		System.out.println(email);
		
		String password = reader.getCellData("RegTestData", "password", 2);
		System.out.println(password);
		
		String eday = reader.getCellData("RegTestData", "day", 2);
		System.out.println(eday);
		
		String emonth = reader.getCellData("RegTestData", "month", 2);
		System.out.println(emonth);
		
		String eyear = reader.getCellData("RegTestData", "year", 2);
		System.out.println(eyear);
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys(firstName);
		driver.findElement(By.id("u_0_o")).sendKeys(lastName);
		driver.findElement(By.id("u_0_r")).sendKeys(email);
		driver.findElement(By.id("u_0_u")).sendKeys(email);
		driver.findElement(By.id("u_0_y")).sendKeys(password);

//		Select day = new Select(driver.findElement(By.id("day")));
//		day.selectByVisibleText(eday);
//
//		Select month = new Select(driver.findElement(By.id("month")));
//		month.selectByVisibleText(emonth);
//
//		Select year = new Select(driver.findElement(By.id("year")));
//		year.selectByValue(eyear); 
		
		
	
	
	
	
	}

}
