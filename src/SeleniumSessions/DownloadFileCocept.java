package SeleniumSessions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static org.hamcrest.Matchers.*;

public class DownloadFileCocept {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void setUp() {
		//88898-88596-85985-59659-46546
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		//Chrome:
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		//profile.default_content_settings.popups provided by google. 
		
		prefs.put("profile.default_content_settings.popups", 0); //Its saying please dont display any popups for download
		prefs.put("download.default_directory",folder.getAbsolutePath());														
		
		options.setExperimentalOption("prefs", prefs); //first prefs is the std key name . Second one is map object
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(cap);
	}
	
	@Test
	public void downloadFileTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		
		Thread.sleep(2000); //wait for 2 sec to download the file
		
		File listOfFiles[] = folder.listFiles();
		Assert.assertNotEquals(listOfFiles.length, 0);  //make sure directory is not empty
		
		for(File file:folder.listFiles()) {
			Assert.assertNotEquals(file.length(), (long)0); //make sure the downloded file size is not empty
															//OR Assert.assertTrue(file.length()>0);
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		for(File file:folder.listFiles()) {
			file.delete();
		}
		
		folder.delete();
	}

}
