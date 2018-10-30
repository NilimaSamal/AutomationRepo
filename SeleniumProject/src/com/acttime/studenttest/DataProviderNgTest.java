package com.acttime.studenttest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderNgTest 
{
	@Test(dataProvider="getAccData")
	public void createAccount(String accName,String MobileNum){
		System.out.println("execute createAccount");
	}
	
	@DataProvider
	public Object[][] getAccData()
	{
	Object[][] ObjArr=new Object[5][2];
	
	ObjArr[0][0]="abc@gmail.com";
	ObjArr[0][1]="8798375645";
	
	ObjArr[1][0]="xyz@gmail.com";
	ObjArr[0][2]="5446466450";
	
	ObjArr[2][0]="User1@gmail.com";
	ObjArr[0][3]="9876456700";
	
	ObjArr[3][0]="User2@gmail.com";
	ObjArr[0][4]="5678657341";
	
	ObjArr[4][0]="User3@gmail.com";
	ObjArr[0][5]="6756575657";
	
	return ObjArr;
	
	}

}
