package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Handle Calendar/DatePicker using JavaScriptExecutor - Session -17:

+Use JavaScriptExecutor to inject JavaScript into DatePicker/Calendar field. 
+Very Fast approach
+Direct injection of date into DOM - HTML*/

public class SelectCalendarByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.spicejet.com");
	
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
        String dateVal = "19-10-2018";
        
        selectDateByJS(driver, date, dateVal);
	
      
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
		//js.executeScript("arguments[0].click();", element);
		
	} 
		
		
		

}
