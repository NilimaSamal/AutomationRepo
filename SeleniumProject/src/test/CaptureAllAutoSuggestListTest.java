package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAllAutoSuggestListTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in/");
		
		//Search for Infosys
		driver.findElement(By.id("lst-ib")).sendKeys("Infosys");
		Thread.sleep(5000);
		
		//Capture AutoSuggest List
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@role='listbox']/li[@class='sbsb_c gsfs']"));
		
		//Display The flight Name
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}

	}

}
