package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class test extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;

	
	private WebDriver driver; 
	String URL = "http://google.com";

	@BeforeMethod
	public void testSetUp() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/ChromeDriver/chromedriver");
		driver = new ChromeDriver();	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(URL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

	
	
	
	
	
	

}
