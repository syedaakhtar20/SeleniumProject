package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle {

	WebDriver driver;
	
	@Test
	public void alethandle() throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// How to handle title of the page
		System.out.println(driver.getTitle());
		
	//	driver.findElement(By.id("alertbtn")).click();
	// How to handle the java script pop ups- alert, confirm	
	driver.findElement(By.id("confirmbtn")).click();
		
	Alert al=	driver.switchTo().alert();
	
	String alertText= al.getText();
	System.out.println(alertText);
	
	Thread.sleep(2000);
	al.dismiss();
	
	
		
	}
}

