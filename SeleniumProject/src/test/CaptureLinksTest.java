package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureLinksTest {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		
		//Identify Links available in Trending Now
		List<WebElement> lst=driver.findElements(By.xpath("//ul[contains(@class,'Trs($trendTrs)')]/li"));

		//Capture the Link Name 
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}
	}

}
