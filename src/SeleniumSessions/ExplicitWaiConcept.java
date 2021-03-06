package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaiConcept {
	
	
	//Implicit wait(if any) will be applied first . Bcoz it is global wait. It will be runing all the time
	//Lets say i have given implicit wait of 20 secs and explicit wait of 20 secs for login button
	//First it will wait for 20 secs for implicit wait and 20 secs for explicit wait for login. So it will become 20+20 secs
	//So for a specific element (login button) it will wait for 40 sec
	//So it is not recommended to use both implicit and explicit wait together
	//Implicit wait can be changed anyware and at any time in your program

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		clickOn(driver, driver.findElement(By.id("loginbutton")), 20); // max 20 sec im giving to login to come up. if its comes up in 2 sec then remaing sec ll b ignored		

		//clickOn(driver, driver.findElement(By.linkText("Create a Page")), 20); // for create page
	}
	
	// This is called Synchronization point in selenium in the form of Explicitly Wai
	//Explicit wait . Not for all element. Only for Specific element
	//it will work for all the elements which are clickable
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
}
