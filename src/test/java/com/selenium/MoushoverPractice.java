package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoushoverPractice {

	
	WebDriver driver;
	
	@Test
	public void mouseHoverHandle() throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
	WebElement ele=	driver.findElement(By.id("mousehover"));
	
	Actions action = new Actions(driver);
	action.moveToElement(ele).build().perform();
	
	WebElement subType=driver.findElement(By.xpath("//a[text()='Reload']"));
	
	Thread.sleep(2000);
	action.moveToElement(subType).click().perform();
	}
	
	@Test
	public void mousehandle() throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://www.browserstack.com/mouse-hover-in-selenium");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Products'])[1]"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//span[text()='Products'])[1]"))).build().perform();
		
		driver.findElement(By.xpath("(//a[@href='https://www.browserstack.com/automate'])[2]"));
		
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("(//a[@href='https://www.browserstack.com/automate'])[2]"))).click()
		.build().perform();
		
	}
}
