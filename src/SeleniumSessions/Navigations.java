package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//using aria-label Attribute we can get the default text of the textbox. use getAttribute("aria-label")
		driver.get("http://www.google.com"); // this will refresh the browser
		
		driver.navigate().to("http://www.amazon.in");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
	//	driver.switchTo().activeElement().sendKeys("Ramya"); to get current focused elememnt where the cursor is
		
		driver.navigate().to(driver.getCurrentUrl()); // this will refresh the browser
		
	}

}
