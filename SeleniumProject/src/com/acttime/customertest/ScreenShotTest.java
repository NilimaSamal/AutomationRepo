package com.acttime.customertest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException 
	{
		//Login to App
		WebDriver driver=new FirefoxDriver();
		driver.get("https://amazon.co.in/");
		
		//get the ScreenShot
		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
		File srcImg=eDriver.getScreenshotAs(OutputType.FILE);
		//Copy the Screenshot in Local Drive and Create a new file in Destination Location
		File dstFile=new File("./ScreenShot/test.png");
		FileUtils.copyFile(srcImg, dstFile);
		

	}

}
