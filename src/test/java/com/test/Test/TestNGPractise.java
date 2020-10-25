package com.test.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractise {
	
	WebDriver driver;
	
	
//	@BeforeSuite
//	@BeforeTest
//	@BeforeClass
//	@BeforeMethod
//	@Test
//	@AfterMethod
//	@AfterClass
//	@AfterTest
//	@AfterSuite
	
	
	@BeforeMethod
	public void initial_SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\ShobhaProj\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.rediffmail.com/");		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test
	public void launchingCreateAccount() {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Create')]"))));
		
		WebElement createaccount=driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
		
	   boolean account_displayed = createaccount.isDisplayed();
	   
	   
	   if(account_displayed==true) {
		   
		   createaccount.click();
	   }
		
		
		
	}
	
	
	
	

}
