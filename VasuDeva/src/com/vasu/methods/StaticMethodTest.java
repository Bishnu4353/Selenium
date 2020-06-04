package com.vasu.methods;

public class StaticMethodTest 
{

	//1. static method with return type with parameters
	
	//addition of two numbers
	
	public static int add(int a,int b)
	{
		
		int sum=a+b;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		// calling static methods no need to create object reference
		
		//calling static methods
		//syntax:
		//   classname.methodname 
		
		//calling a method with method name
		
		//StaticMethodTest.add(20, 30);//it won't return a value
		
		
		//calling a method with variable
		
	int res=StaticMethodTest.add(30, 50);
	
	System.out.println(res);
		
		
		
		
		
		
		
	}
}
