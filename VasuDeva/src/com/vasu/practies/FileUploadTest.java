package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadTest 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExecutableFile\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//FirefoxDriver driver=new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("VasuDeva");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Selenium");
		
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
			System.out.println("Employee Created ");
		}else
		{
			System.out.println("Employee Not Created");
		}
		
		
	}

}
