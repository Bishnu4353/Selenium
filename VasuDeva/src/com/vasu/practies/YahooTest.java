package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("Http://yahoo.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("header-search-input")).sendKeys("Selenium");
		
		driver.findElement(By.id("header-desktop-search-button")).click();

	}

}
