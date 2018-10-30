package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_RightClickTest 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

		WebElement srcWb=driver.findElement(By.id("draggable"));
		WebElement dstWb=driver.findElement(By.id("droptarget"));
		
		//create an object to actions class
		Actions act=new Actions(driver);
		
		//drag and drop operation
		act.dragAndDrop(srcWb, dstWb).perform();
		
		//right click operation
		WebElement imageWb=driver.findElement(By.xpath("//img[@class='kendo-ui logo']"));
		act.contextClick(imageWb).perform();
		act.sendKeys("T").perform();
		System.out.println("Done");
	}

}
