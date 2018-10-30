package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartPriceTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//close the Hidden window
		driver.findElement(By.xpath("//button[text()='✕']")).click();
				
	    //Search for "Iphone 10"
	    driver.findElement(By.name("q")).sendKeys("iphone 10",Keys.ENTER);
	    
	    //Capture the Price
	    String X="//a[text()='Apple iPhone X (Space Gray, 256 GB)']/../a[3]/div/div[1]";
	    
	    String price=driver.findElement(By.xpath(X)).getText();
	    
	    System.out.println(price);
	    
	}

}
