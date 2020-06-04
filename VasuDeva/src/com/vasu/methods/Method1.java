package com.vasu.methods;

public class Method1 
{
//Non-static methods
	
	//1. method with return type with parameters
	
	//create a method for addition of two number
	
	
	public  int  add(int a,int b)
	{
		
		int sum=a+b;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		
		Method1 ns=new Method1();
		
		//calling a method with method name , it won't return a value
		
		//ns.add(20, 30);
		
		//calling a method with variable, it will return a value
		
		int res=ns.add(20, 30);
		
		System.out.println(res);
		
		
		
		
	}
}
