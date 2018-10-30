package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) 
	{
        //navigate to facebook app	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//verify the image id Displayed
         WebElement iwb=driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']"));
         boolean stat=iwb.isDisplayed();
         System.out.println(stat);
         
         //capture the size of the image
         Dimension dem=iwb.getSize();
         System.out.println("get the height=>"+dem.getHeight());
         System.out.println("get the Width=>"+dem.getWidth());
         
         //capture location of the element
        Point p=iwb.getLocation();
        System.out.println("get the X coordinate location=>"+p.getX());
        System.out.println("get the Y coordinate location=>"+p.getX());
        
        //First name editbox should contains default data
        String attVal=driver.findElement(By.name("firstname")).getAttribute("aria-label");
        System.out.println(attVal);
        
        String attCal=driver.findElement(By.name("lastname")).getAttribute("aria-label");
        System.out.println(attCal);
        
        //Female and Male radio button should be unselected
        boolean rStatus=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
        System.out.println(rStatus);
        
        driver.close();   
	}

}
