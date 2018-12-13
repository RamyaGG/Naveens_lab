package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.get("http://jqueryui.com/droppable");
		
		driver.switchTo().frame(0); // switch to frame if it is present
		
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(WebElement)
//		driver.switchTo().frame(name)

		Actions action = new Actions(driver);
		
//		action.doubleClick(WebElement target)
//		action.contextClick(WebElement target) //for right click
		
		action.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']")), driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();

		//Method 2
//		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
//				.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();

	}

}
