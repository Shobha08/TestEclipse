package com.test.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class PopupTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		login_Redirect();
		
		

	}
	
	
	
	
	public static void login_Redirect() {
		System.setProperty("webdriver.chrome.driver", "C:\\ShobhaProj\\chromedriver.exe");
        //driver=new ChromeDriver();
		//driver= new HtmlUnitDriver();
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("Headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
        driver.get("http://popuptest.com/goodpopups.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
        driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
        
	}
	
	
	
	public static void popTest() {
		
		Set<String> windowhandle= driver.getWindowHandles();
		Iterator<String> it= windowhandle.iterator();
		
		String parentwindow=it.next();
		String childwindow=it.next();
		
		
		driver.switchTo().window(parentwindow);
		driver.close();
		
		driver.switchTo().window(childwindow);
		
		
		
		
		
		
		
	}
	
	

}
