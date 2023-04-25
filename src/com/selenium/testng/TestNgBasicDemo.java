package com.selenium.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNgBasicDemo {

		WebDriver driver;
		@BeforeSuite
		public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}
		@AfterSuite
		public void closeBrowser() {
				
			driver.close();
		}
		@Test	
		public void framesTest() throws InterruptedException{
		driver.get("https://www.jqueryui.com/");
		driver.findElement(By.linkText("Autocomplete")).click();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of iframes"+frames.size());
		Thread.sleep(5000);
		}
			
		
		
			
	}
	

