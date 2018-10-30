package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidEmailTest {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		String expMsg="couldn't find ur google account";
		String color="rgba(213,0,0,1)";
		
		//enter email and click on next button
		driver.findElement(By.id("identifierId")).sendKeys("xyz");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		//find error msg in GUI
		WebElement wb=driver.findElement(By.xpath("//div[text()=\"Couldn't find your Google Account\"]"));
		String actErrorMsg=wb.getText();
		
		//verify the error msg
		if(expMsg.equals(actErrorMsg))
		{
			System.out.println("Error is verified==Pass");
		}
		else
		{
			System.out.println("Error is not verified==Fail");
		}
		
		//verify the color of the msg
		String actColor=wb.getCssValue("color");
		if(color.equals(actColor))
		{
			System.out.println("Error color is verified==Pass");
		}
		else
		{
			System.out.println("Error color is not verified==Fail");
		}
	}

}
