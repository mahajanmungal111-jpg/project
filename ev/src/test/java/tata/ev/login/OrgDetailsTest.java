package tata.ev.login;

import static org.junit.Assert.assertEquals;

import org.junit.After;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class OrgDetailsTest {
	OrgDetails og=new OrgDetails();
	@Before
	public void data()
	{
		System.out.println("Test Case Start");
	}
	@After
	public void display()
	{
		System.out.println("Test Case End");
	}
	//@Ignore
	@Test
	public void addTest()
	{
		int add=	og.add(50, 50);
		int input=100;
		System.out.println("Add TestCase");
		assertEquals( input,add);
	}
	//@Ignore
	@Test
	public void subTest()
	{
		int add=	og.sub(50, 50);
		int input=0;
		System.out.println("Sub TestCase");
		assertEquals( input,add);
	}
	@Test
	public void mulTest()
	{
		int add=	og.mul(50, 50);
		int input=2500;
		System.out.println("Mul TestCase");
		assertEquals( input,add);
	}
	@Test
	public void divTest()
	{
		int add=	og.div(50, 50);
		int input=1;
		System.out.println("div TestCase");
		assertEquals( input,add);

	}
}
