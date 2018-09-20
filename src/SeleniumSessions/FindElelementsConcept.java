package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElelementsConcept {

	/* Total no of links on a page and text of each links*/
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.ebay.com");
		
	List<WebElement> linkList = driver.findElements(By.tagName("a"));
	System.out.println(linkList.size()); //size of link text
	
	for(int i=0; i<linkList.size(); i++) {
		String linkText = linkList.get(i).getText();
		 System.out.println(linkText); //displaying test of each link
	}

	}

}
