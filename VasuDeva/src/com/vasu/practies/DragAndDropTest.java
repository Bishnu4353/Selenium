package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		//finding no of frames 
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		
		System.out.println(frames.size());//1---> 0(index)
		
		//giving the control to a particular frame
		
		//1. based on index
		
		//driver.switchTo().frame(0);
		//2. based on String
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		//3. based on WebElement
		WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		
		driver.switchTo().frame(frame);
		WebElement drg=driver.findElement(By.id("draggable"));
		
		WebElement drp=driver.findElement(By.id("droppable"));
		
		
		Actions  dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg, drp).build().perform();
		
		//give the control back to previous html document
		
		driver.switchTo().defaultContent();
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1")).getText());
		
		

	}

}
