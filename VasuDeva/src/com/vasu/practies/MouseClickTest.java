package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickTest
{

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		
		WebElement ywl=driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"));
		
		Actions mouse=new Actions(driver);
		
		//mouse.moveToElement(signIn).build().perform();
		
		//mouse.moveToElement(ywl).click().build().perform();
		
		
		//mouse.moveToElement(signIn).moveToElement(ywl).click().build().perform();
		
		//mouse.moveToElement("vasu").mmoveToElement("sel").pause(2000).moveToElement("new @7 am").click().build().perform();
		
		
	}

}
