package tata.capital.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DeptServiceTest {
	DeptService d1=new DeptService();
	
	@Before
	public void data()
	{
		System.out.println("Test case execution start");
		
	}
	@After
	public void display()
	{
		System.out.println("Test case execution Done");
		
	}
	@Test
	public void addTest()
	{
		int add=	d1.add(50, 40);
		int result=90;
		assertEquals(result,add);
		System.out.println("Add TestCase");
	}

	@Test
	public void subTest()
	{
		int sub=	d1.sub(50, 40);
		int result=10;
		assertEquals(result,sub);
		System.out.println("Sub TestCase");
	}
	
	@Test
	public void mulTest()
	{
		int mul=	d1.mul(50, 10);
		int result=500;
		assertEquals(result,mul);
		System.out.println("MUl TestCase");
	}
	@Test
	public void divTest()
	{
		int div=	d1.div(50, 10);
		int result=5;
		assertEquals(result,div);
		System.out.println("div TestCase");
	}
}
