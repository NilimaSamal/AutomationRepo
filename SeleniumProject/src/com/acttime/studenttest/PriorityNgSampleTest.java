package com.acttime.studenttest;

import org.testng.annotations.Test;

public class PriorityNgSampleTest {
	
	@Test(priority=1)
	private void createCustomerTest()
	{
		System.out.println("execute createCustomerTest");
	}
	@Test(priority=2)
	public void modifyCustomerTest()
	{
		System.out.println("execute modifyCustomerTest");
	}
	@Test(priority=3)
	public void deleteCustomerTest()
	{
		System.out.println("execute deleteCustomerTest");
	}
	

}
