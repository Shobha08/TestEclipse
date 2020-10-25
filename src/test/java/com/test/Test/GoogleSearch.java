package com.test.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test(priority=1)
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\ShobhaProj\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys("testing");
		
		//ul[@class='erkvQe' and @role='listbox']//li/descendant::div[@class='sbl1']
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe' and @role='listbox']//li/descendant::div[@class='sbl1']"));
		for(int i=0;i<list.size();i++) {
			String ans=list.get(i).getText();
			if(ans.equals("testing")) {
				System.out.println("Found it");
				list.get(i).click();
			}else
				System.out.println("not found");
			break;
			
		}
		
 
	}

}
