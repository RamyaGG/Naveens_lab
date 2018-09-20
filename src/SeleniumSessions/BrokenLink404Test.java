package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink404Test {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://makemysushi.com/404?");

		
		//links are associated with "a" tag.
		//Developer have written a href< www.google123.com> by mistake. The moment we click 
		//on it . it will navigate to google123. That means the link is broken
		//it may be internal link or external link
		
		//images are associated with img tag. img href<http://www.test.com>
		
		//1.  Get the list of all the links and img
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of full links and images -->"+linksList.size());
		
		//if href is not available the we will not consider that one
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. Iterate linkList
		for (int i=0; i<linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if (linksList.get(i).getAttribute("href")!=null &&(! linksList.get(i).getAttribute("href").contains("javascript"))) { // Exclude all the links and img which does not have href attribute
				//and condition is for javascript:void(openWin('https://help.crmpro.com/
				activeLinks.add(linksList.get(i));
				
				
			}
			
			
		}
		
		//get the size of active links list
		System.out.println("Size of active likns and images ---->"+activeLinks.size());
		
		//3.check the href url with httpConnection API
		//200 -- ok
		//404 -- not found
		//500 -- internal eoor
		//400 -- bad request
		
		for (int j=0; j<activeLinks.size(); j++) {
		HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage(); //ok
		connection.disconnect();
		System.out.println(activeLinks.get(j).getAttribute("href")+"---->"+response);
		
		}

	}

}
