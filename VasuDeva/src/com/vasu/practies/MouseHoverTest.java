package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest
{

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		
		
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(signIn).build().perform();
		
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span")).click();

	}

}
