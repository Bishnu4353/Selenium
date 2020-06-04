package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpCreationTest extends OHRM //child
{

	@Test(dataProvider="getData")
	public void empCreation(String fname,String lname) throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		driver.findElement(By.id("photofile")).sendKeys("D:\\Desert.jpg");
		
		
		
		driver.findElement(By.id("btnSave")).click();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object [][] data=new Object[2][2];
		
		data[0][0]="vasu456";
		data[0][1]="selenium34";
		data[1][0]="vasu456678";
		data[1][1]="selenium34";
		return data;
	}
}
