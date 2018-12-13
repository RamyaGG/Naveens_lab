package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModelPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.softvision.com/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='hubspot-messages-iframe-container']//iframe")));
		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='hubspot-messages-iframe-container']//iframe"))).build().perform();
		driver.findElement(By.className("private-icon private-icon__low")).click();

		
	}

}
