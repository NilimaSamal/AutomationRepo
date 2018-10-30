package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMTSearchTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
		//From
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("BOM");
		driver.findElement(By.xpath("//span[contains(text(),'Mumbai, India')]")).click();

		//To
		driver.findElement(By.id("hp-widget__sTo")).clear();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("DEL");
		driver.findElement(By.xpath("//div[@class='locationFilter autocomplete_to']//span[contains(text(),'New Delhi, India')]")).click();
		
		//Search
		driver.findElement(By.id("searchBtn")).click();
		
		//Identify all the flights Name
		List<WebElement> lst=driver.findElements(By.xpath("//span[@class='pull-left airline_info_detls']"));
		
		System.out.println(lst.size());
		
		//Display the Flights name
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}
	}

}
