package com.sbi.login;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperationTest {

@Test
	public void saveTest()
	{  
		Operation op=new Operation();
		String str=	op.save();
		String str1="SDA1";
		System.out.println("hello");
		assertEquals(str1, str);
	
		
	}
}
