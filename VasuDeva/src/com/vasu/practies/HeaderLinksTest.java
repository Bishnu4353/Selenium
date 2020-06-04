package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://Amazon.in/");
		
		driver.manage().window().maximize();
		
		//identify the header section 
		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(headerLinks.size());
		
		
		for (int i = 0; i < headerLinks.size(); i++) 
		{
			System.out.println(headerLinks.get(i).getText());
		}
		

	}

}
