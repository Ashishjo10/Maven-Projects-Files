package maventestpack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JasWishlistProduct 
{
	WebDriver driver;
	   
	   @FindBy(xpath="//*[@id=\"shopify-block-wishlist_engine_product_page_bgTNAV\"]/div/div")
	   WebElement WishlistIcon;
	   
	   @FindBy(xpath="//*[@id=\"shopify-section-sections--16434563743914__header\"]/height-observer/x-header/nav[2]/a[3]/svg")
	   WebElement WishlistCart;
	   

	   @FindBy(xpath="//*[@id=\"wishlist-move-cart-0\"]")
	   WebElement Move2Cart;
	   
	   
	   public JasWishlistProduct (WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }   
	   
	   
	   public void productWishlist()
	   {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView();",WishlistIcon);
		   WishlistIcon.click();
		   
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait up to 10 seconds
		    try {
		        Alert alert = wait.until(ExpectedConditions.alertIsPresent()); // Wait until the alert is present
		        alert.dismiss(); // Close the alert
		    } catch (Exception e) {
		        System.out.println("No popup appeared: " + e.getMessage());
		    }
		   
		   js.executeScript("window.scrollBy(0, -200);"); // Scroll up 200 pixels
		 
		   wait.until(ExpectedConditions.elementToBeClickable(WishlistCart)).click();
	   }
	   
	   public void moVe2caRt()
	   {
		   Move2Cart.click();
	   }
	   
	   
}
