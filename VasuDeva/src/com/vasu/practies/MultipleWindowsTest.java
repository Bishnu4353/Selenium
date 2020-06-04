package com.vasu.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//capture all window id's
		
		
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		
		/*Iterator<String> it=windows.iterator();
		
		
		while(it.hasNext())
		{
			//capturing all the window id's
			//System.out.println(it.next().toString());
			
			//give the focus to one by one window , capture title of the window and close it
			
			//driver.switchTo().window(it.next().toString());
			
			//System.out.println(driver.getTitle());
			
			//driver.close();
			
			//close all the windows except "Intellect"
			
			driver.switchTo().window(it.next().toString());
			
			if(!driver.getTitle().equals("Intellect"))
			{
				driver.close();
			}
		}*/
		
		
		/*for(String items:windows)
		{
			//System.out.println(items);
			driver.switchTo().window(items);
			System.out.println(driver.getTitle());
			driver.close();
			
		}*/
		
		
		/*List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(tabs.get(2));
		
		System.out.println(driver.getTitle());
		
		driver.close();*/
		
		
		
		

	}

}
