package com.seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConnectionEst {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		WebElement userName = driver.findElement(By.id("identifierId"));
		userName.clear();
		userName.sendKeys("testingnawin@gmail.com");
		
		 WebElement nxt=driver.findElement(By.id("identifierNext"));
		 nxt.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
