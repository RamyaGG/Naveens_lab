package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.ebay.com");
		
		//Absolute Xpath : Not recommended
		//*[@id='s2-carouselContainer']/div/div[2]/div/div/div[1]/div[1]/div
		//1. performance issue
		//2. not reliable
		//3. can be changed any time in future
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
		
		driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete')]")).sendKeys("Java");
		
		// ./* -- > represents how many html tags are there
		// .//* --> gives all the tags avaliable in the webpage
		
		//dynamic id : input
		//id = test_123
		//by.id("test_123")
		
		//starts-with
		//id = test_456
		//id = test_789
		//test_test_7890_test
		
		//ends-with
		//id = 1234_test_t
		//id = 6758_test_t
		//id = 9869_test_t
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Tset");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
		
		//for links : custom Xpath
		//all the links are represented by <a> tag
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		
		
	}

}
