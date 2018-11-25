package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Test4 {
	
	@Test
	
	public void Sum ()
	{
		System.out.println ("ADD");
		int a =10;
		int b =20;
		Assert.assertEquals(30, a+b);
		
	}
	
	@Test
	public void Subtract ()
	{
		System.out.println ("SUBTRACT");
		int a =10;
		int b =20;
		Assert.assertEquals(10, b-a);
		
	}
  
	@Test
	public void Multiply ()
	{
		System.out.println ("MUL");
		int a =10;
		int b =20;
		Assert.assertEquals(200, a*b);
			
	}
	
	@Test
	public void div ()
	{
		System.out.println ("DIV");
		int a =10;
		int b =20;
		Assert.assertEquals(2, b/a);
		
	}
}

