package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");

		//https://username:password@test.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
