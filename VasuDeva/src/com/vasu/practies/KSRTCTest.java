package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KSRTCTest {

	public static void main(String[] args) throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("exampleModalCenter")).click();
		
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();

	}

}
