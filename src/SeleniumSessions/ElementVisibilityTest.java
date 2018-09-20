package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com/register");
		//1. isDisplayed() method : applicable for all the elements
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); //for submit button
		System.out.println(b1);//true. If it is displayed then it ll return true
		
		//2. isEnabled Method
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled(); // isEnabled() is primarily used with buttons
		System.out.println(b2); // false
		
		//Select I Agree Checkbox
		driver.findElement(By.name("agreeTerms")).click(); // submit button is enabled now
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled(); 
		System.out.println(b3);  // true
		
		//3. isSelected() method is only applicable for checkbox , dropdown and radio button
	    boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();	
	    System.out.println(b4); // true
	    
	    //de-select the checkbox
	    driver.findElement(By.name("agreeTerms")).click(); // submit button is enabled now
		boolean b5 = driver.findElement(By.id("submitButton")).isSelected();
		System.out.println(b5);
	    

	}

}
