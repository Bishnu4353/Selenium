package com.vasu.practies;

import com.vasu.methods.Method1;
import com.vasu.methods.StaticMethodTest;

public class ReusingMethod 
{

	public static void main(String[] args)
	{
		//reusing non-static method
		
		/*Method1 ns=new Method1();
		
		int res=ns.add(20, 30);
		System.out.println(res);*/
		
		//reusing static methods
		
		int res=StaticMethodTest.add(20, 100);
		
		System.out.println(res);

	}

}
