package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownAssignment 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		// Identify the element where we need to take mouse cursor
		WebElement wb=driver.findElement(By.xpath("//span[text()='Departments']"));
				
	    //create an object to actions class 
		Actions act=new Actions(driver);
				
		//move mouse cursor on the expected element execute action by taking help of perform()
		act.moveToElement(wb).perform();
				
		//click on "Amazon Music" sub menu link
		driver.findElement(By.xpath("//span[text()='Amazon Music']")).click();
		
		//click on "Amazon Music Unlimited" sub menu link
		driver.findElement(By.xpath("//span[text()='Amazon Music Unlimited']")).click();
		
		driver.close();
	}

}
