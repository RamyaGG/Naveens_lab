package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*How to handle dynamic WebTable In Selenium

There are two ways of handling WebTable:

Method � 1:
� Iterate row and column and get the cell value. 
� Using for loop
� Get total rows and iterate table
� Put if(string matches) then select the respective checkbox
� Lengthy method

Method � 2:
� Using custom XPath 
� Using parent and preceding-sibling tags
� No need to write for loop
� No full iteration of table
� Single line statement
� More dynamic
� Efficient and fast*/

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");

		driver.findElement(By.name("username")).sendKeys("RamyaGG");
		driver.findElement(By.name("password")).sendKeys("Framya28!"+Keys.ENTER);
	//	driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		
		//Method -1 :
		
	//	String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
	//	String after_xpath = "]/td[2]/a";
		
	//	for(int i=4; i<=7; i++) {
	//		String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
	//	    System.out.println(name);
	//	    if(name.contains("test2 test2")) { //i=6
		    	//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input --> CheckBox Xpath
	//	    	driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
	//	    }
		    
	//	    if(name.contains("ui uiii")) { //i=7
		    	//*[@id='vContactsForm']/table/tbody/tr[7]/td[1]/input --> CheckBox Xpath
	//	    	driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
	//	    }
	//	}
		
		//Method - 2 : Ctr+F --> Chrome
		
		//INT : Print table values one by one
		List<WebElement> list = driver.findElements(By.xpath("//form[@id='vContactsForm']//tr//td[@class='datalistrow']"));
		for(WebElement w : list) {
			System.out.println(w.getText());
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ui uii')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ui uiii')]//parent::td//following-sibling::td//a[contains(text(),'xyz')]")).click();
	}

}
