package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =	new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
//	driver.get("https://www.flipkart.com");
//	
//driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).sendKeys("ramyagg33@gmail.com");
	
//		String title = driver.getTitle();
//		System.out.println(title);
	
	driver.get("https://www.amazon.in");
	System.out.println(driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value"));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
	System.out.println(driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value"));
	
	
	}

}
