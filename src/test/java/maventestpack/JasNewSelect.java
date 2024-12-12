package maventestpack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JasNewSelect 
{
	WebDriver driver;
	   
	   @FindBy(xpath="//*[@id=\"shopify-section-sections--16434563743914__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary")
	   WebElement New;
	   
	   @FindBy(xpath="//*[@id=\"product-list-template--16434567545002__main\"]/product-card[1]/div[1]/a/img")
	   WebElement Product;
	   
	 
	   public JasNewSelect(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }   
	   
	   public void handlePopup() 
	   {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Wait for the modal to appear
	        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-class']"))); // Update with correct XPath
	        
	        // Find and click the close button
	        //WebElement closeButton = modal.findElement(By.xpath("//*[@id=\"shopify-section-sections--16443441807530__header\"]/height-observer/x-header")); // Adjust XPath as needed
	        //closeButton.click();
	        
	        WebElement outsideArea = driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16443441807530__header\"]/height-observer/x-header"));
	        outsideArea.click();
	        
	   }   
	   
	   public void newSelect()
	   {
		   New.click();	   
		   
	   }
	   
	   public void proDuctClick()
	   {
		   Product.click();
	   }
	   
}
