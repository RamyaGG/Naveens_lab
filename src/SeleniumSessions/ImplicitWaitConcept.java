package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Dynamic wai. if it is loaded within 2 sec then rest of the secs will b ignored

		/* We are telling Sele atleast wait for 40 sec for the page to be fully loaded . Once the page is fully loaded within 40 sec then perform some actions*/
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		/* it is applicable for all the ele present on the page. Once the page is fully loaded then wait for next 30 sec to perform the action on a specific element */
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//These two waits are global wait. ll write it once. this only one time activity
	

		driver.get("http://jqueryui.com/droppable");

	}

}
