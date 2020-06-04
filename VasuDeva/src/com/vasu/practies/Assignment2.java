package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		//appLogin
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("Vasudeva456");
		
		driver.findElement(By.id("txtAdd1")).sendKeys("");
		
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		
		Thread.sleep(2000);
				
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		
		country.selectByIndex(1);
		Thread.sleep(2000);
			
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		
		state.selectByIndex(1);
		Thread.sleep(2000);
		
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		
		city.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("btn_insert")).click();
		
		//alert
		
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		
		Thread.sleep(2000);
		al.accept();
		
		Thread.sleep(2000);
		//validation
		
		if(msg.contains("created Sucessfully"))
		{
			System.out.println("Pass");
		}else if(msg.contains("already Exist"))
		{
			System.out.println("Fail");
		}else if(msg.contains("Please fill"))
		{
			System.out.println("Warning");
		}
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
