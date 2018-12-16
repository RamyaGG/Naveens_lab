package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeTakenToOpenWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
		long open = System.currentTimeMillis();
		driver.get("https://www.amazon.in");
		long finish = System.currentTimeMillis();
		long totalTime = finish-open;
		System.out.println("Total Time for Page load in miliseconds is "+totalTime);
		System.out.println("Total Time for Page load in seconds is "+totalTime/1000);
		
	}

}
