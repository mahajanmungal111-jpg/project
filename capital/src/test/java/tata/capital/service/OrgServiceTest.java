package tata.capital.service;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class OrgServiceTest {
	

	@BeforeClass
	
	public static void demo()
	{
		System.out.println("Testing start here");
	}
	@AfterClass
	public static void display()
	{
		System.out.println("Testing End here");
	}
	OrgService o1=new OrgService();
	@Test
	public void addTest()
	{
		String str=o1.add();
		String input ="Hello";
		assertEquals(input, str);
		System.out.println("Add test case");
	}
	@Ignore
	@Test
	public void updateTest()
	{
		float  u=o1.update();
		float input=50.f;
		assertEquals(input, u);
		System.out.println("update test case");
	}
	@Test
	public void deleteTest()
	{
		int  u=o1.delete();
		int input=10;
		assertEquals(input, u);
		System.out.println("Delete test case");
	}
}
