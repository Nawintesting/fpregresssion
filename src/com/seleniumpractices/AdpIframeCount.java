package com.seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdpIframeCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adp.com");
		
		 List<WebElement> elements = driver.findElements(By.xpath("//*"));
		 System.out.println("No of Elements   "+elements.size());
		int frameCount = 0;
		for(WebElement webElement : elements) {
			String tagName = webElement.getTagName();
			if(tagName.equalsIgnoreCase("iframe")) {
				frameCount++;
				String cls = webElement.getAttribute("class");
				String id = webElement.getAttribute("id");
				String src = webElement.getAttribute("src");
				String href = webElement.getAttribute("href");
				String img = webElement.getAttribute("img");
				System.out.println("class  "+cls);
				System.out.println("id  "+id);
				System.out.println("src  "+src);
				System.out.println("href  "+href);
				System.out.println("img  "+img);
				
				
				
				
			}
		}
		
		System.out.println("frame count "+frameCount);
		
		
		driver.close();
	}

}
