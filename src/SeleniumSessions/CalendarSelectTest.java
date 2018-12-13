package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Handle Calendar in Selenium WebDriver - Session - 16:

Steps to handle calendar in Selenium Webdriver:
 1- Click on calendar
 2- Get all td of tables using findElements method
 3- using for loop get text of all elements
 4- using if else condition we will check specific date
 5- If date is matched then click and break the loop. 
 6- Handle NoSuchElementException in case of (31st day)*/

public class CalendarSelectTest {

	public static void main(String[] args) {

		// select.getOptions();
		// select.deselectAll();
		// select.deselectByIndex(arg0);
		// select.getAllSelectedOptions();
		// select.getFirstSelectedOption();
		// select.isMultiple();

		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.get("http://freecrm.com");

		driver.findElement(By.name("username")).sendKeys("RamyaGG");
		driver.findElement(By.name("password")).sendKeys("Framya28!");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();

		driver.switchTo().frame("mainpanel");

		String date = "31-March-2018";
		String dateArr[] = date.split("-"); // {18, September, 2017}

		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]

		String before_xpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath = "]/td[";

		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal;
		// 2-1 2-2 2-3 2-4 2-5 2-6 2-7
		// 3-1 3-2 3-3 3-4 3-5 3-6 3-7
		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
				try {
					dayVal = driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please Enter Correct date Value");
					flag = true;
					break;
				}

				System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).click();
					flag = true;
					break;
				}
			}

			if (flag) {
				break;
			}
		}

	}

}
