package com.acttime.studenttest;

import org.testng.annotations.Test;

public class DependencyNgTest {
	@Test
	public void createCustomerTest()
	{
		String createNAme="HDFC";
		System.out.println("Execute CreateCustomerTest");
	}

	@Test(dependsOnMethods="createCustomerTest")
	public void modifyCustomerTest()
	{
		System.out.println("Execute Modify HDFC CustomerTest");
	}
	@Test(dependsOnMethods="createCustomerTest")
	public void deleteCustomerTest()
	{
		System.out.println("Execute Modify HDFC CustomerTest");
	}
}
