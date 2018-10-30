package test;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAddToCartTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https:amazon.in");
		
		//Search for Iphone 10
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 10",Keys.ENTER);
		
		//Click on Iphone Product,which open child window 
		driver.findElement(By.xpath("//h2[text()='Apple iPhone X (Silver, 3GB RAM, 64GB Storage)']")).click();
		
		//capture the session/window Ids
		Set<String> set=driver.getWindowHandles();
		
		//Get the window count
		System.out.println(set.size());
		
		//Capture the session Id From the set-collection
		java.util.Iterator<String> it=set.iterator();
		
		String parentWinSessionID=it.next();
		String childWinSessionID=it.next();
		
		//pass driver control to child window
		driver.switchTo().window(childWinSessionID);
		
		//click on "add-to-cart" button in child window
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//close the child window
		driver.close();
		
		//Pass control back to parent window 
		driver.switchTo().window(parentWinSessionID);
		
		//perform action on parent Window
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nokia",Keys.ENTER);
	}

}
