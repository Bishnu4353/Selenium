package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("Http://Google.co.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_g")).sendKeys(Keys.ENTER);
		
		//capturing title of the page
		
		System.out.println(driver.getTitle());
		
		//capturing url of the page
		
		System.out.println(driver.getCurrentUrl());
		
		//navigate back
		
		driver.navigate().back();

	}

}
