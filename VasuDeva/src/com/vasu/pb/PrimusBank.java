package com.vasu.pb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank //Library ,it contains reusable methods
{
//Global variables
	FirefoxDriver driver;
	String res;
	//appLaunch
	
	public String appLaunch(String url)
	{
		driver=new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//validation
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
						
			res="Pass";
		}else
		{
						
			res="Fail";
		}
		
		return res;
		
	}
	
	//appLogin
	
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
		//validation
		
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			
			res="Pass";
		}else
		{
						
			res="Fail";
		}
		
		return res;
	}
	
	
	//appLogout
	
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		//validation
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
						
			res="Pass";
		}else
		{
						
			res="Fail";
		}
		
		return res;
		
	}
	
	//appClose
	
	public void appClose()
	{
		driver.close();
	}
	
	//branchCreation
	
	
	public String branchCreation(String bName,String add1) throws Exception
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(bName);
		
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		
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
			//System.out.println("Pass");
			
			res="Pass";
		}else if(msg.contains("already Exist"))
		{
			//System.out.println("Fail");
			res="Fail";
			
		}else if(msg.contains("Please fill"))
		{
			//System.out.println("Warning");
			res="Warning";
		}
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		
		return res;
	}
	
	
	
	public static void main(String[] args) throws Exception 
	{
		PrimusBank app=new PrimusBank();
		
		//calling a method with method name ,it won't return a value
		//app.appLaunch("Http://PrimusBank.qedgetech.com");
		
		//calling a method with method variable ,it will return a value
				/*app.appLaunch("Http://PrimusBank.qedgetech.com");
				
				app.appLogin("Admin","Admin");
		
				app.branchCreation("Vasudeva324", "Vasusele");
				
				app.appLogout();
				
				app.appClose();*/
				
				
				//Modularity framework
				
				//Checking URL
				
				app.appLaunch("Http://PrimusBank.qedgetech.com");
				app.appClose();
				
				
				//appLogin
				
				app.appLaunch("Http://PrimusBank.qedgetech.com");
				
				app.appLogin("Admin","Admin");
				
				app.appLogout();
				
				app.appClose();
				//branchCreation
				app.appLaunch("Http://PrimusBank.qedgetech.com");
				
				app.appLogin("Admin","Admin");
		
				app.branchCreation("Vasudeva324", "Vasusele");
				
				app.appLogout();
				
				app.appClose();
				
				
		
	}
}
