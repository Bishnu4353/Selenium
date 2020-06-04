package com.vasu.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest 
{

	public static void main(String[] args)
	{
		
		String username="vasu.584";
		
		String password="vasuselenium";
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Gmail.com");
		driver.manage().window().maximize();
		
		//synchronization
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();

	}

}
