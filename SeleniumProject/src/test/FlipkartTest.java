package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Close the Hidden Window 
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        
        //Search for "Mobile"
        driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
        
        //Move Scroll Bar Down
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        
        //Select RAM 
        driver.findElement(By.xpath("//div[text()='6 GB & Above']/preceding-sibling::div")).click();
        
        //Select Brand
        driver.findElement(By.xpath("//div[text()='Samsung']/preceding-sibling::div")).click();
        
      //capture the result from the GUI
      	String result=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
      	System.out.println(result);
	}

}
