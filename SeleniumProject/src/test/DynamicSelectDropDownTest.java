package test;



import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelectDropDownTest
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium%20Note/Selenium%20using%20html%20tags/myPage.html");
		
		String expVal="Java";
		boolean flag=false;
		
		//Identify Multiselect Dropdown
		WebElement mWb=driver.findElement(By.xpath("//select[@multiple='true']"));
		
		//Create an object Select class
		Select sel=new Select(mWb);
		
		//get all the options from the dynamic dropdown
	     java.util.List<WebElement> lst=sel.getOptions();
		
		//get the option Count
		System.out.println(lst.size());
		
		//check for the expected value from the collection list
		for(WebElement wb:lst)
		{
			String OptionVal=wb.getText();
			if(OptionVal.equals(expVal))
			{
				sel.selectByVisibleText(expVal);
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println(expVal+"===>available==PASS");
		}
		else
		{
			System.out.println(expVal+"===>Not available==Fail");
		}
		

	}

}
