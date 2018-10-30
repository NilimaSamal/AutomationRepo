package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureURLTest {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Search for ur Favourite data
		driver.findElement(By.id("lst-ib")).sendKeys("Salman Khan");
		Thread.sleep(3000);
		
		//Capture  URL from AutoSuggest List 
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
