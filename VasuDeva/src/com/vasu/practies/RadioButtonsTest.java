package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
	WebElement radio=driver.findElement(By.id("u_0_z"));
List<WebElement> radioList=	radio.findElements(By.tagName("label"));

System.out.println(radioList.size());

for (int i = 0; i < radioList.size(); i++)
{
//radioList.get(i).click();	
	
	//System.out.println(radioList.get(i).getText());
	
	if (radioList.get(i).getText().equals("Custom")) 
	{
		radioList.get(i).click();
	}
}

	}

}
