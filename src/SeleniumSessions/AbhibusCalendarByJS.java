 package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to validate Colors
//Assert.assertEquals(Color.fromString(hoverElement.get(i).getCssValue("background-color")).asHex(), color, "Color mismatch");

public class AbhibusCalendarByJS {

	public static void main(String[] args) { 
		//id="a_2018_4_10"

		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.abhibus.in");
	
		WebElement date = driver.findElement(By.id("datepicker1"));
        String dateVal = "28-06-2018";
        
        selectDateByJS(driver, date, dateVal);
    	
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	} 
		
		

}
