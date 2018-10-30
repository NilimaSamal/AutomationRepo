package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatetoGmail 
{

	public static void main(String[] args) throws Throwable
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://gmail.com");
		
		//click on Create Account 
		driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");
		Thread.sleep(2000);
		
		//click on browser back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//click on browser forward option
		driver.navigate().forward();
		Thread.sleep(3000);
				
		//Refresh the current Page
		driver.navigate().refresh();
				
		//Delete all browser data(cookies) and History
		driver.manage().deleteAllCookies();
				
		System.out.print("Done");
	}

}
