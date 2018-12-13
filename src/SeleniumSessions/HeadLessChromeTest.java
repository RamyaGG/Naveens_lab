package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Headless Browser Testing Using Chrome in Selenium:

**So if you hadn’t heard, Google has implemented a headless option for Chrome. This will be included from version 59.

===========================================
Following chrome options are required for Chrome HeadLess Browser:
ChromeOptions options = new ChromeOptions();
options.addArguments("window-size=1400,800");
options.addArguments("headless");
===========================================
*/

public class HeadLessChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Mandatory Options
		//chrome version sholud be > 59 and > 60 on mac
		//window-size-1400,800
		//it will interact directly with chrome DOM str . so its very fast
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size-1400,800");
		// if the application is compatible with mob then no need to write the above window-size
		//so it is good practice to define window size
		options.addArguments("headless");
		//options.addArguments("--incognito"); //to run in private mode
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		driver.get("http://freecrm.com");
		
		System.out.println("Login page Title :   "+driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("RamyaGG");
		driver.findElement(By.name("password")).sendKeys("Framya28!");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();

		System.out.println("Home Page Title :    "+driver.getTitle());
		
	}

}
