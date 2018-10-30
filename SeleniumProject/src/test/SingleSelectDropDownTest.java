package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDownTest 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//Identify Month Dropdown
		WebElement mWb=driver.findElement(By.id("month"));
		
		//Create an object to select class and pass dropdown element as an argument
		Select sel=new Select(mWb);
		Select sel1=new Select(driver.findElement(By.id("day")));
		Select sel2=new Select(driver.findElement(By.id("year")));
		
		//Using select methods to handle the dropdown
		sel1.selectByVisibleText("15");
		sel.selectByIndex(8);
		sel2.selectByVisibleText("1947");
	}

}
