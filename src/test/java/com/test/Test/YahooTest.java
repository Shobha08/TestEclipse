package com.test.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooTest {
	
//	String firstname="Shobha";
//	static String lastname="thomas";
//	static String emailid="shobhathomas";
//	static Long phonenum= 9779806745L;
	
	static String url="https://in.yahoo.com/?p=us";
	
	 static WebDriver driver;
	 static Select select;
	
	
		public static void main(String[] args) {
			
			login_Redirect();
			enter_AccountDetails();
		
	}
		
		
		public static void login_Redirect() {
			System.setProperty("webdriver.chrome.driver", "C:\\ShobhaProj\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(By.id("header-signin-link")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@id=\"createacc\" and @role=\"button\"]")).click();
            
		}
		
		
		public static void enter_AccountDetails() {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamereg-firstName")));
			WebElement firstname=driver.findElement(By.id("usernamereg-firstName"));
			WebElement lastname=driver.findElement(By.name("lastName"));
			WebElement emailid=driver.findElement(By.name("yid"));
			WebElement  password=driver.findElement(By.name("password"));
			WebElement phone=driver.findElement(By.name("phone"));
			firstname.sendKeys("Shobha");
			lastname.sendKeys("lastname");
			emailid.sendKeys("shobha123");
			password.sendKeys("shobha@1234");
			phone.sendKeys("12345678900");
			
		  select = new Select (driver.findElement(By.id("usernamereg-month")));
		  select.selectByVisibleText("May");
		  
		  select= new Select(driver.findElement(By.name("dd")));
		  select.selectByVisibleText("Monday");
		  
		  select= new Select(driver.findElement(By.id("usernamereg-year")));
		  select.selectByVisibleText("2020");
		  
		  driver.findElement(By.id("reg-submit-button")).click();
		  
		  driver.switchTo().frame(0);
		  
		  
			
		}
		
		
		
		
		
		

}
