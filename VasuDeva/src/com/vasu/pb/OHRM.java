package com.vasu.pb;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM 
{
	FirefoxDriver driver;
	String res;
	//appLaunch
	
	public String appLaunch(String url)
	{
				driver=new FirefoxDriver();

				driver.get(url);
				driver.manage().window().maximize();
				
				//validation
				
				if(driver.findElement(By.id("txtUsername")).isDisplayed())
				{
					res="Pass";
				}else
				{
					res="Fail";
				}
				
				return res;
	}
	
	//appLogin
	
	public String  appLogin(String userName,String password) throws Exception
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		//validation
		
		if(driver.findElement(By.linkText("PIM")).isDisplayed())
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
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		//validation
		
		if(driver.findElement(By.id("txtUsername")).isDisplayed())
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
	
	//empCreation
	
	public String empCreation(String fName,String lName) throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys(fName);
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		driver.findElement(By.id("photofile")).sendKeys("D:\\Desert.jpg");
		
		//Actions action=new Actions(driver);
		
		
		//action.moveToElement(driver.findElement(By.id("photofile"))).click().build().perform();

		//Run Autoit program
		
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\FileUp.exe");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		
		//validation
		
		if(driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).isDisplayed())
		{
			//System.out.println("Employee Created ");
			
			res="Pass";
		}else
		{
			//System.out.println("Employee Not Created");
			res="Fail";
		}
		
		return res;
	}
	
	public static void main(String[] args) 
	{
		OHRM app=new OHRM();
		
		String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		System.out.println(results);
		
		app.appClose();
	}

}
