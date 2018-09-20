package com.test;

import org.testng.annotations.*;


public class TestNgBasics {
	
//@BeforeSuite --setup system property for chrome
//@BeforeTest --Launch chrome Browser
//@BeforeClass --Login to appS

//@BeforeMethod --Enter URL
//@Test --Google logo Test
//@AfterMethod --Logout from app
	
//@BeforeMethod --Enter URL
//@Test --Google Title Test
//@AfterMethod --Logout from app
	
//@BeforeMethod --Enter URL
//@Test --Search test
//@AfterMethod --Logout from app
	
//@AfterClass --close Browser
//@AfterTest --dele all the cookies
	
	
	//Pre Conditions annotions -- strating with @Before
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite --setup system property for chrome");
	}
	
	@BeforeTest //2
	  public void launchBrowser() {
		  System.out.println("@BeforeTest --Launch chrome Browser");
	  }
  
  @BeforeClass //3
  public void login() {
	  System.out.println("@BeforeClass --Login to appS");
	  
  }
  
  /*
   * @BeforeMethod
   * @Test -- 1
   * @AfterMethod
   * @BeforeMethod
   * @Test -- 2
   * @AfterMethod
   * @BeforeMethod
   * @Test -- 3
   * @AfterMethod
   */
  
  
  @BeforeMethod //4
  public void enterURL() {
	  System.out.println("@BeforeMethod --Enter URL");
  }
  
 
  //Test Case -- starting with @Test
  @Test //5
  public void googleTitleTest() {
	  System.out.println("@Test --Google Title Test");
  }
  
  
  @Test
  public void searchTest() {
	  System.out.println("@Test --Search test");
  }
  
  @Test
  public void googleLogoTest() {
	  System.out.println("@Test --Google logo Test");
  }
  
  
  //Post Condition -- starting with @After
  
  @AfterMethod //6
  public void logOut() {
	  System.out.println("@AfterMethod --Logout from app");
  }
  
  @AfterClass //7
  public void closeBrowser() {
	  System.out.println("@AfterClass --close Browser");
  }
  
  @AfterTest //8
  public void deleteAllCookies() {
	  System.out.println("@AfterTest --dele all the cookies");
  }
  
  
  
//  @AfterSuite //9
//  public void generateTestReport() {
//	  System.out.println("generateTestReport");
//  }
  
  
}
