 package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Heghlight webelemt using js executor

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("RamyaGG");
		driver.findElement(By.name("password")).sendKeys("Framya8!");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//executeScript -- to execute JavaScript Code
		
		//In HTML, JavaScript code must be inserted between <script> and </script> tags.
		// so javascript file will be there inside script tag of html
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		flash(loginBtn, driver);
		
		drawBorder(loginBtn, driver); // draw a border
		
		//Take ScreenShot and Store as File format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		//Copy the ScreenShot to desired location using copyFile Method
		FileUtils.copyFile(src, new File("H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\SeleniumSessions\\element.png"));

		
		//generate alert
		generateAlert(driver, "There is an issue with Login Button on Login page");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//Click On Any Element by using JS executor
		clickElememtByJS(loginBtn, driver);
		
		//refersh the page
		//1.by using selenium
		//driver.navigate().refresh();
		
		//2. by using JS executor
		refreshBrowserByJS(driver);
		
		//get the title of the page by JS
		System.out.println(getTitleByJS(driver));
		
		//get the page inner text by JS
		System.out.println(getPageInnerTextByJS(driver));
		
		//Scroll Page down
		//scrollPageDown(driver);
		
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
	    scrollIntoView(forgotPwdLink, driver);
	}
	

//what is javascript executor
//
	
	public static void flash(WebElement element, WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)",element, driver);
			changeColor(bgcolor,element,driver);		
		}
	}
		
	public static void changeColor(String color, WebElement element, WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = ((JavascriptExecutor)driver);
     		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
			Thread.sleep(30);
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		//argument[0] --> there is only one element. First Element
	}
	
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	

	public static void clickElememtByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
		//it is very powerful. JS Executor will hit the JS Library inside the HTML code directly
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)"); //the first is there goes 0(first history ) and then it will refresh the browser
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString(); 
	    return title;
	}
	
	public static String getPageInnerTextByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String innerText = js.executeScript("return document.documentElement.innerText;").toString(); 
	    return innerText;
	    
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element); 
		
	}
	
}
