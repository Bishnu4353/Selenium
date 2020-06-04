package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest 
{

	public static void main(String[] args)
	{
		//String username;
		
		//username="Admin";
		
		String username="Admin";
		
		String password="Admin";
		
		//appLaunch
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		//appLogin
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
		//appLogout
		
		
		
		//appClose
		
		//driver.close();

	}

}
