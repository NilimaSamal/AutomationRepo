package com.acttime.studenttest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BcAcTest {
	@BeforeClass
	public void configBC()
	{
		System.out.println("=========Lunch Browser=========");
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("=========Close Browser=========");
	}
	@Test(priority=1)
	public void createCustomerTest()
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
