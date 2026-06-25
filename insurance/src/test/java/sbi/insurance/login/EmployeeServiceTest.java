package sbi.insurance.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeServiceTest {
	EmployeeService e=new EmployeeService();
	@Test

	public void setIdTest()
	{
		int input=50;
		int id=	e.setId(50);
		assertEquals(input, id);
		System.out.println("This is setId Test");
	}
	@Test
	public void setNameTest()
	{
		String input="pune";
		String name=	e.setName("pune");
		assertEquals(input, name);
		System.out.println("This is setname Test");
	}
}
