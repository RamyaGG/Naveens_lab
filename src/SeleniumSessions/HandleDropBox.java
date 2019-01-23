package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("u_0_j")).sendKeys("55553656");
		driver.findElement(By.id("u_0_l")).sendKeys("lastname");
		driver.findElement(By.id("u_0_o")).sendKeys("mobile");
		driver.findElement(By.id("u_0_v")).sendKeys("Password");

		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("19");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Oct");

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1990"); //Value of the value attribute
		
		//driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Oct"); Even this will work
		//driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2010");

		driver.findElement(By.id("u_0_11")).click();
		
		System.out.println(day.isMultiple());
		
		List<WebElement> allDayOptions = day.getOptions();
		for (WebElement w : allDayOptions) {
		System.out.println(w.getText());
		}
		
	//	day.deselectAll(); we cannot write this bcoz day field does not support multi selection
		
//		isMultiple()  	
//		Returns TRUE if the drop-down element allows multiple selections at a time; FALSE if otherwise.
//		No parameters needed
		
//		deselectAll()	
//		Clears all selected entries. This is only valid when the drop-down element supports multiple selections.
//		No parameters needed
		
		
/*
Element					Command													Description
Drop-Down Box			selectByVisibleText()/ deselectByVisibleText()			selects/deselects an option by its displayed text
						selectByValue()/ deselectByValue()						selects/deselects an option by the value of its "value" attribute
						selectByIndex()/ deselectByIndex()						selects/deselects an option by its index
						isMultiple()											returns TRUE if the drop-down element allows multiple selection at a time; FALSE if otherwise
						deselectAll()											deselects all previously selected options
		*/
		
	}

}
