package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleTabs {

	WebDriver driver;
	
	@Test
	public void openMultipleTabs() throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("opentab")).click();
	String originalWindow=	driver.getWindowHandle();
		
	Set<String> windows=	driver.getWindowHandles(); // getWindowHandles return set 
		
		for(String id:windows) {
			if(!originalWindow.contentEquals(id)) {
				driver.switchTo().window(id);
				break;
			}
		}
		
/*	Iterator<String> it=	window.iterator();
	
	String parentWindow = it.next();
	
	String childWindow= it.next();
	
	driver.switchTo().window(childWindow); */
	Thread.sleep(2000);
		
	driver.findElement(By.xpath("//div[@id='navbarSupportedContent']//ul//li//a[@href='contactus.html'][normalize-space()='Contact']")).click();
	
	//driver.switchTo().window(parentWindow);
	
	
//	driver.findElement(By.id("checkBoxOption1")).click();
	}
}
