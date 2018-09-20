package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*How to handle Bootstrap DropDown in Selenium :

• How to handle different styles of bootstrap down
• Click on the given dropdown
• Get all the tags while are available under "li" tag
• Get the text of each "li//a" OR "div//a"
• Match the text and click on it
*/

public class BootStrapDropBoxHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]//li//a//label//input"));
		System.out.println(list.size());
		
		
		//Selecting all the checkbox/optins except
		for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).getAttribute("value")); 
		if(!(list.get(i).isSelected())) {
			list.get(i).click();
		}
		}	
		
		//Selecting Angular option 
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getAttribute("value"));
//			if(list.get(i).getAttribute("value").contains("Angular")) {
//				list.get(i).click();
//				break;
//			}
//		}
	}

}
