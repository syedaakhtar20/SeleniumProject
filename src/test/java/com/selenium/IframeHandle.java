package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeHandle {
	
	WebDriver driver=null;
	
	@Test
	public void iframeHandle() {
		
		driver = new ChromeDriver();
		
		//driver.get("https://jqueryui.com/draggable/");
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
	//	WebElement frameId= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
	//	driver.switchTo().frame(frameId);
		
		driver.switchTo().frame("frame1");
		
	String text=	driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
	
	System.out.println(text);
		
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
	}
	
	@Test
	
	public void handleIframe() {
		driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		//WebElement frameId= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame("courses-iframe");
		
		driver.findElement(By.xpath("//a[text()='SUPPORT']")).click();
		
	}
	

}



