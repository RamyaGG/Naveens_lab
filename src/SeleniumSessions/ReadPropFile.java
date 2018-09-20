package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\SeleniumSessions\\config.properties");

		prop.load(ip);
		
		System.out.println(prop.getProperty("name")); // exact prop name we have to give as it is in config.properties
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Name"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new FirefoxDriver();
			
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.gecko.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new InternetExplorerDriver();
			
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("surname_xpath"))).sendKeys(prop.getProperty("surname"));
		driver.findElement(By.xpath(prop.getProperty("mobile_xpath"))).sendKeys(prop.getProperty("mobile"));
		
		// Login
		
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login_id"))).click();
		
	}
		
		

}
