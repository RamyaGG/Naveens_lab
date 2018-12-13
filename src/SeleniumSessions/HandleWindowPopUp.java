package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	//1. alerts -- JavaScript pop Up -- Alert API (accept, dismiss)
	//2. File Upload Pop UP -- Browse Button -- (type - file, sendkeys(path))
	//3. Browser Window Pop Up -- Advertisement Pop Up (WindowHandler API -- getWindowHandles() )
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,500)");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Modeless Window")).click();
		
		Set<String> handler =  driver.getWindowHandles(); // to get window IDs
		
		Iterator<String> it = handler.iterator();  // iterator will  point to the set just above the set object
		String parentWindowId = it.next(); // pointing to the first loc where parent windoe id is available
		System.out.println("Parent Window Id is "+parentWindowId);
		
		String childWindowID = it.next();
		System.out.println("Child Window ID is "+childWindowID);
		
		driver.switchTo().window(childWindowID); // now the focus is on child window
		System.out.println("Child Window Pop UP Title ---->"+driver.getTitle());
		
		driver.close(); // this will close the browser where the control is available. used to close specific window browser
		//Driver control is lost we have take control to parent window
		driver.switchTo().window(parentWindowId); // control is available on parent window
		System.out.println("Parent Window Title ---->"+driver.getTitle());
		driver.quit(); // used to close all the browser window

	}

}
