


package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureMultipleElementsTest {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		
		//identify all the links elements in GUI
		List<WebElement> lst=driver.findElements(By.xpath("//a"));
		
		//get the Link count 
		System.out.println(lst.size());
		
		//Capture the Link Name 
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}

	}

}
