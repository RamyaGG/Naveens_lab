package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//jquey dropdown or bootstrap dropdown

public class HandleBootStrapDropBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
		//driver.findElements(By.xpath("//div[@class='dropdown-menu show' and @aria-labelledby='dropdownMenuButton']//a")); --> to make it more specific
	
        list.size();
        
        for (int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().contains("Another action")) {
        		list.get(i).click();
        		break;
        	}
        }
		
	}

}
