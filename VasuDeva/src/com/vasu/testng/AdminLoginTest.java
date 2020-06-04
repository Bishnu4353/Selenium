package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void adminLogin()
{
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
}
}
