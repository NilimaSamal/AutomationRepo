package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentificationMethod 
{

	public static void main(String[] args)
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		//identify email editbox in GUI based on locator
		WebElement ewb=driver.findElement(By.id("identifierId"));
		
		//type the data 
		ewb.sendKeys("seleniumoar1234");
		
		//Identify next button 
		WebElement bwb=driver.findElement(By.xpath("//span[text()='Next']"));
		
		//click a button 
		bwb.click();
		
		System.out.print("Done");
	}

}
