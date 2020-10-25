package com.test.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.api.Screen;

public class Bootstrap {
	
	static WebDriver driver;
	static String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";

	public static void main(String[] args) {
		initial_Setup(url);

	}
	
	
	public static void initial_Setup(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ShobhaProj\\chromedriver.exe");
//		ChromeOptions chromeoption= new ChromeOptions();
//		chromeoption.addArguments("headless");
//	
//         driver= new ChromeDriver(chromeoption);
//		
		
		driver= new HtmlUnitDriver();		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[contains(text(),'Output')]"))));
		//ul[contains(@class,'multiselect')]/child::li/a/label
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		List<WebElement> detlist= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//label"));
		for(int i=0;i<detlist.size();i++) {
			if(detlist.get(i).getText().contains("Python")) {
				detlist.get(i).click();
				System.out.println("got it");
				break;
			}
		}
		
	}
	
	
	
	public void sikuli_Test() {
		Screen s= new Screen();
		Pattern pause= new Pattern("pause.png");
		
		s.wait(pause,2000);
		s.lick();
		
		
		
		
	}
	
	
	

}
