package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		//sl.selectByIndex(26);
		//sl.selectByVisibleText("Baby");
		
		//sl.selectByValue("search-alias=fashion");
		
		List<WebElement> dropList=sl.getOptions();
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++)
		{
			System.out.println(dropList.get(i).getText());
		}
		
	}

}
