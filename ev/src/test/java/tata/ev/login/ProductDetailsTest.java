package tata.ev.login;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductDetailsTest {
	ProductDetails p1=new ProductDetails();
	@BeforeClass
	public static  void display()
	{
		System.out.println("Test Case Execution start here");
	}
	@AfterClass
	public static  void data()
	{
		System.out.println("Test Case Execution End here");
	}
	@Test
	public void addTest()
	{
		String str=	p1.add();
		String input="hi";
		assertEquals(input, str);
		System.out.println("Add TestCase");
	}
	@Test
	public void updateTest()
	{
		String str=	p1.update();
		String input="hello";
		assertEquals(input, str);
		System.out.println("Update TestCase");
	}
	@Test
	public void deleteTest()
	{
		int str=	p1.delete();
		int input=10;
		assertEquals(input, str);
		System.out.println("Delete TestCase");
	}
}
