package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandles {
	
	WebDriver driver;
	
	@Test
	public void openWebtable() {
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		List<WebElement> webTableElements= driver.findElements(By.xpath("(//table[@id='product']/tbody)[1]/tr"));
		
		int count= webTableElements.size();
		
		System.out.println(count);
		
		for(int i=0; i<count;i++) {
			
		String text=	webTableElements.get(i).getText();
		
		System.out.println(text);
		
		if(text.contains("WebSecurity Testing for Beginners")) {
			webTableElements.get(i).click();
		}
		}
		
		
	}

}
