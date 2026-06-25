package sbi.insurance.register;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class ProductServiceImpleTest {
	ProductService p1=new ProductServiceImple();
	@RepeatedTest(value=10)
	@DisplayName(value="This method is testing load")
	public void add()
	{
		int x=	p1.add(10, 20);
		int input=30;
		assertEquals(input, x);
	}

	public void opTest()
	{
		String str=p1.op("Max");
		String input="Max";
		assertEquals(input, str);
	}
}
