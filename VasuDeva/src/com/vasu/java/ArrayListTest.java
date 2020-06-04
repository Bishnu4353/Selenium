package com.vasu.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args)
	{
		
		//ArrayList<String> l=new ArrayList<>();
		
		/*List<String> l=new ArrayList<>();
		//insert values into arrayList
		l.add("Selenium");
		l.add("vasu");
		l.add("Training");
		
		l.add("selenium training");
		
		l.add("Selenium");
		
		System.out.println(l.size());
		
		//Retrieving  values from an arrayList
		
		
		for (int i = 0; i <l.size() ; i++) 
		{
			System.out.println(l.get(i));
		}*/
		
		/*List<Integer> l=new ArrayList<>();
		//insert values into arrayList
		l.add(14);
		l.add(45);
		
		
		System.out.println(l.size());
		
		//Retrieving  values from an arrayList
		
		
		for (int i = 0; i <l.size() ; i++) 
		{
			System.out.println(l.get(i));
		}*/
		List<Object> l=new ArrayList<>();
		//insert values into arrayList
		l.add(14);
		l.add(45);
		l.add("Selenium");
		l.add('C');
		l.add(12.45);
		
		System.out.println(l.size());
		
		//Retrieving  values from an arrayList
		
		
		for (int i = 0; i <l.size() ; i++) 
		{
			System.out.println(l.get(i));
		}
	}

}
