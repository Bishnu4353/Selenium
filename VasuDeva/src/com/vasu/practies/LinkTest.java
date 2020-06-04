package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		//capture all the links by using tagName(tagName is common for all the elements) and stored into variable
		
		List<WebElement>  links=driver.findElements(By.tagName("a"));//collection
		
		//size
		
		System.out.println(links.size());
		
		
		for (int i = 0; i < links.size(); i++) 
		{
			//capture all link names
			//System.out.println(links.get(i).getText());
			
			//click on Specific link
			
			if (links.get(i).getText().equals("REGISTER")) 
			{
				links.get(i).click();
			}
		}
		

	}

}
