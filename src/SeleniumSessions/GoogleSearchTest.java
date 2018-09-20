package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Handle Dynamic Search Using Dynamic XPath - Google Search:

Steps:
1. Google Search – pick a value from suggestions
2. Search using Xpath
3. Get the total count of suggestions
4. Use if condition to match the value
5. Click on matched value
*/

public class GoogleSearchTest {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	  
	  driver.get("http://www.google.com");
	  driver.findElement(By.id("lst-ib")).sendKeys("Java");
	  
	  List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']")); // dobleslash //li total no of child elements
	  
	  System.out.println("Total no. of suggestions is : "+list.size());
	  
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i).getText());
		  if(list.get(i).getText().contains("java tutorial")) {
			  list.get(i).click();
			  break;
		  }
	  }
	  
	  //li/descendant::div --> we are putting desscendant on li it means 
	  //under this li how many descendant divs are available. it does not matter
	  //its child divs are there under child child is there . 
	  //it ll give u the complete list of divs from the child parent
	  //from the grand parent child also from the child to child also
	  // then we have to decide which child we have to pick. i have to pick div where class = sbqs_c

	}

}
