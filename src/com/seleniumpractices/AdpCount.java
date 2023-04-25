package com.seleniumpractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdpCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adp.com");
		
		 List<WebElement> elements = driver.findElements(By.xpath("//*"));
		 System.out.println("No of Elements   "+elements.size());
		 int adpcount = 0;
		 Iterator<WebElement> itr = elements.iterator();
		 while(itr.hasNext())
		 {
			WebElement webelement= itr.next();
			 String str = webelement.getText();
			 if(str!=null) {
				 if(str.contains("ADP")||str.contains("adp")) {
					 adpcount++;
				 }
					 
			 }
				 
		 }
		 System.out.println("No of occurences of adp	"+adpcount);
			
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
}
