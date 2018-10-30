package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartXpathTest
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//close the Hidden window
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Search for "Iphone 10"
		driver.findElement(By.name("q")).sendKeys("iphone 10",Keys.ENTER);
		
		//capture the result from the GUI
		String result=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(result);
		
		//Capture the count
		String[] arr=result.split(" ");//split the complete string by "space" delimiter
		
		String count=arr[5];  //get the actual string count from the Array
		
		String interCount=count.replace(",", "");  // repalce "," by nothing
		
		int expCount=Integer.parseInt(interCount); //convert "String" data into=> "int" Data
		
		System.out.println(expCount-5);
		
	}

}
