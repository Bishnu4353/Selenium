package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
				
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("UFT");
		
		driver.findElement(By.xpath("//*[@id='sb_form']/label")).click();

	}

}
