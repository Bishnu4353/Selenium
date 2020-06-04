package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		Actions pageDown=new Actions(driver);
		
		pageDown.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.linkText("Create a Page")).click();
		

	}

}
