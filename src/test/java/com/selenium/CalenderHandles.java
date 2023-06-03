package com.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CalenderHandles {
	WebDriver driver;
	
	@Test
	public void calenderDatesHandle() {
		
		driver= new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_view_date1")));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	//	WebElement departureEle= driver.findElement(By.xpath("(//a[text()='30'])[1]"));
		//	String departureText=	departureEle.getText();
		//System.out.println("departureText " + departureText);
		
	//	departureEle.click();
		
		
		
		int count=	driver.findElements(By.xpath("//tr/td[@data-month='4']")).size();
		
	
	
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			
		
			String text=driver.findElements(By.xpath("//tr/td[@data-month='4']")).get(i).getText();
			System.out.println(text);
		
			if(text.equalsIgnoreCase("31")) {
			 driver.findElements(By.xpath("//tr/td[@data-month='4']")).get(i).click();
			 break;
		}
			
			
		}
		
		
	}
	

}
