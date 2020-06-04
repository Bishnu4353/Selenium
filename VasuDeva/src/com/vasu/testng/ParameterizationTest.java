package com.vasu.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 
{

	@Test(dataProvider="getData")
	public void adminLogin(String username,String pwd)
	{
		
		System.out.println("username is : "+username);
		System.out.println("password is : "+pwd);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object [][] data=new Object[1][2];
		
		data[0][0]="vasu";
		data[0][1]="selenium";
		
		return data;
	}
}
