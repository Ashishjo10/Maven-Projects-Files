package maventestpack;

import java.util.Set;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EbayTest1 
{
	WebDriver driver;
	   
	   @FindBy(xpath="//*[@id=\"gh-ac\"]")
	   WebElement searchbar;
	   
	   @FindBy(xpath="//*[@id=\"item246da966c7\"]/div/div[1]/div/a/div/img")
	   WebElement toyproduct;
	   

	   @FindBy(xpath="//*[@id=\"atcBtn_btn_1\"]")
	   WebElement add2carticon;
	   
	   
	   public EbayTest1(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver,this);
	   }   
	   
	   
	   public void searchText()
	   {
		   searchbar.sendKeys("toys",Keys.ENTER);
		   toyproduct.click();
	   }
	   
	   
	   public void windowhandling()
	   {
		 String parentwindow=driver.getWindowHandle();
		 

			Set<String> allwindows=driver.getWindowHandles();
			for(String handle:allwindows)
			{
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					driver.switchTo().window(handle);
					add2carticon.click();
					driver.close();
					
				}
				driver.switchTo().window(parentwindow);
			}
	   }
	   
	  
	   
	   
}
