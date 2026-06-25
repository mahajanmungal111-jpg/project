package tata.nexon.register;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StudentDataTest {
	StudentData s1=new StudentData();
	//@Test
	@RepeatedTest(value=10)
	public void  dataTest()
	{
		String str=	s1.data();
		String input="welcome to java";
		Assertions.assertEquals(input, str);

		System.out.println("data TestCase");

	}
	@Test
	@DisplayName(value="Display")
	public void  displayTest()
	{
		String str=	s1.display();
		String input="welcome to pune";
		Assertions.assertEquals(input, str);
		System.out.println("display TestCase");

	}
}
