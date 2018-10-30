package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
;

public class MMTCalenderTest {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
         
		//click on "from"
		WebElement uWb=driver.findElement(By.id("hp-widget__sfrom"));
		uWb.clear();
		uWb.sendKeys("Bangalore(BLR)");
		
		// click on To
		WebElement sWb=driver.findElement(By.id("hp-widget__sTo"));
		sWb.sendKeys("Goa");
		
		//click on "Depart"
		driver.findElement(By.id("hp-widget__depart")).click();
		
		//Execute java Script to handle Scroll Bar
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(300,0)");
		
		//Handle Calender window
		int monthCount=0;
		while(monthCount<=12)
		{
			try
			{
				//click on Apr-25-2019
				driver.findElement(By.xpath("//td[@data-month='3' and @data-year='2019']/a[text()='25']")).click();
				break;
			}
			catch(Throwable t)
			{
				//click on next button 
				driver.findElement(By.xpath("//span[text()='Next'][1]")).click();
				monthCount++;
			}
		}
	}

}
