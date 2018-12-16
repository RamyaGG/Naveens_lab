package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

public class Guru99DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.guru99.com/handling-date-time-picker-using-selenium.html");
		driver.findElement(By.xpath("//a[contains(@href, 'demo.guru99.com')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open();"); // it will open new tab
		
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		driver.get("http://demo.guru99.com/test/");
		driver.close();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("01041990");
		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys(Keys.TAB); //Keys.chord(Keys.SHIFT+"f")
		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("0203PM");
		
//		Above three line is equivalent ot below one line
//		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("01042018"+Keys.TAB+"0203PM");
	}

}
