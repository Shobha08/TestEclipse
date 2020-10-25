package com.test.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet {
	
	static String url="https://www.spicejet.com/";
	static String url1="https://jqueryui.com/droppable/";

	
	  static WebDriver driver;
	public static void main(String[] args) {
		
		initial_Setup(url);
		WebElement ele=driver.findElement(By.xpath("//a[contains(@title,'SpiceJet')]"));
		
		
		
	}
	
	
//	public static void explicitWait(WebDriver driver,By element ,int time) {
//		
//		WebDriverWait wait= new WebDriverWait(driver,time);
//		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(element));
//			
//	}
	
	
	
	
	
	public static void initial_Setup(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ShobhaProj\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(0);
		
	
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	   driver.findElement(By.partialLinkText("International")).click();
	   
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().to(url);
	    
	   
	   
	  // action.clickAndHold().moveToElement().build
		
		
		
	//action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
		
//		List<WebElement> weblist=driver.findElements(By.tagName("a"));
//		Iterator<WebElement> it= weblist.iterator();
//		while(it.hasNext()) {
//			WebElement ele= it.next();
//			System.out.println(ele.getText()ele.getAttribute("id"));
//		
//		
//		}
		
		
		
		
//		for (int i=0;i<weblist.size();i++) {
//			System.out.println(weblist.get(i).getText());
//			String element= weblist.get(i).getText();
//			System.out.println(element);
//			if(element.equals("Draggable")) {
//				System.out.println("value is present");
//			}
//			else
//				System.out.println("not there");
//				break;
//			
//			
		}
 		
		
	}
	
	
	


