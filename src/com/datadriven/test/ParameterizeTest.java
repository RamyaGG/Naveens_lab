package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

/*
 * 
 * Different Excel Utilities used in Data-Driven Approach:
+How to write test results (Pass/Fail) in Excel Sheet
+How to add a Sheet
+How to add a Column in a Sheet
+GetRowCount and GetColCount Features
 *
 */
public class ParameterizeTest {

	WebDriver driver;

	public static void main(String[] args) {

		// Data driven(also called paramertization) approach used to create data driven
		// framework:
		// data driven means driving the test data from Excel files

		

		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");

		// get test data from excel
		Xls_Reader reader = new Xls_Reader(
				"H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\com\\testdata\\FacebookReg.xlsx");
		int rowCount = reader.getRowCount("RegTestData");
		
		reader.addColumn("RegTestData", "status");// to add any thing . close excel and do
		
		// This is called parameterization. is is always done by for loop alsways
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) { // actual data is present at row num 2
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println(firstName);

			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			System.out.println(lastName);

			String mobileNo = reader.getCellData("RegTestData", "mobileno", rowNum);
			System.out.println(mobileNo);

			String email = reader.getCellData("RegTestData", "email", rowNum);
			System.out.println(email);

			String password = reader.getCellData("RegTestData", "password", rowNum);
			System.out.println(password);

			driver.manage().deleteAllCookies();
			
			driver.findElement(By.xpath("//*[@id='u_0_m']")).clear();
			driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys(firstName);

			driver.findElement(By.id("u_0_o")).clear();
			driver.findElement(By.id("u_0_o")).sendKeys(lastName);

			driver.findElement(By.id("u_0_r")).clear();
			driver.findElement(By.id("u_0_r")).sendKeys(email);

			driver.findElement(By.id("u_0_u")).clear();
			driver.findElement(By.id("u_0_u")).sendKeys(email);

			driver.findElement(By.id("u_0_y")).clear();
			driver.findElement(By.id("u_0_y")).sendKeys(password);
			
			reader.setCellData("RegTestData", "status", rowNum, "pass");
			//write the data into cell

		}

	}

}
