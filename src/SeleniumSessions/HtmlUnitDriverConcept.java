package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe"); --> No need to mention it for htmlunit driver
		//WebDriver driver = new ChromeDriver();
		
		//html unit driver is not available in selenium 3.x version
		//html unit driver - to use this concept we have to use HtmlUnitDriver JAR file
		// what are the new changes in selenium 3.x -- HtmlUnitDriver is a separate entity
		
		//advantages
		//1. Testing is happening behind the scene -- no browser is launched
		//2. Very fast -- execeution of test cases -- very fast -- performance of the script
		//3. Not suitable for actions class --- user actions -- mousemovent , doubleClick , drag and drop
		//4. Ghost Driver -- HeadLess Browser : 
		     //1. HtmlUnitDriver --java
		     //2. phanton JS -- Javascript
		
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://freecrm.com");

		System.out.println("Before Login , Title is : ===  "+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("RamyaGG");
		driver.findElement(By.name("password")).sendKeys("Framya28!");
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys("\n");
		System.out.println("After Login , Title is : ===  "+driver.getTitle());
		
	}

}
