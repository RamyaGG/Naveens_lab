package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class AlertPopUpHandle {
	
/*	Different Locator classes avaibla in sele
	1. By
	2. ByAll
	3. ByIDOrName
	4. ByChained   
	
	driver.findElement(new ByAll(By.name(""),By.id(""),By.className(""))).sendKeys(""); // it will identify the ele with name first , 
	if it is not working then it will give chance to id . if id is not working then it will chance to classname
	
	driver.findElement(new ByIdOrName("")); // it will identify the ele with id or name 
	
	driver.findElement(new ByChained(By.id("parent1 tag id"),By.xpath("parent2 tag xpath"),
			By.name("Child tag name"))).sendKeys(""); parent to child relation/chaining  */
	


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		//alert.sendKeys(""); //we can send test to alert also if it having any text box
		//if it is not having any text box then we will get error
		// org.openqa.selenium.ElementNotSelectableException: element not interactable
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert message");
		}	
		else {
			System.out.println("Incorrect Alert Message");
		}
		alert.accept();
		// alert.dismiss(); // to click on cancel button

		// driver.close();
	}
}
