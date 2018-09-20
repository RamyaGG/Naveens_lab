package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		//Take ScreenShot and Store as File format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Copy the ScreenShot to desired location using copyFile Method
		FileUtils.copyFile(src, new File("H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\SeleniumSessions\\google.png"));
		
	}

}
