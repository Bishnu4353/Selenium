package com.vasu.testng;

import org.testng.annotations.Test;

public class SampleTestNG 
{

	@Test(priority=1)//class/test case
	public void appLaunch()
	{
		System.out.println("appLaunch");
		
		
	}
	
	@Test(priority=2)//class/test case
	public void appLogin()
	{
		System.out.println("appLogin");
		
		
	}
	@Test//class/test case
	public void appClose()
	{
		System.out.println("appClose");
		
		
	}
}
