package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownTest 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium%20Note/Selenium%20using%20html%20tags/myPage.html");
		
		//Identify multiselect Dropdown
		WebElement mWb=driver.findElement(By.xpath("//select[@multiple='true']"));
		
		//Create an Object Select Class 
		Select sel=new Select(mWb);
		
		//Check whether Dropdown is multiselect or Single select
		boolean stat=sel.isMultiple();
		
		if(stat)
		{
			//select all the value from the DropDown
			for(int i=0;i<13;i++)
			{
				//select even number 
				/*if(i%2==0)
				{
					System.out.println(i);
				}*/
				sel.selectByIndex(i);
			}
		}
		else
		{
			System.out.println("It's not a multiselect dropdown");
		}
		//deselect all the value from the dropdown
		sel.deselectAll();
	}

}
