package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	 @Test
	 public void openBrowser() throws InterruptedException {
	   WebDriver driver;
		 
		 //ChromeDriver driver = new ChromeDriver();
		 
		driver=new ChromeDriver();//Chrome browser will open
		//
		
		
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	 }

}
