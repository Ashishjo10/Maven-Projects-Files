package maventestpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayTest2 
{
  WebDriver driver;
  
  @FindBy(xpath="//*[@id=\"gh-ug-flex\"]/a")
  WebElement registerbutton;
  
  @FindBy(xpath="//*[@id=\"personalaccount-radio\"]")
  WebElement personaltypeaccount;
  

  @FindBy(xpath="//*[@id=\"firstname\"]")
  WebElement firstname;
  
  @FindBy(xpath="//*[@id=\"lastname\"]")
  WebElement lastname;
  
  @FindBy(xpath="//*[@id=\"Email\"]")
  WebElement emailaddress;
  
  @FindBy(xpath="//*[@id=\"password\"]")
  WebElement password;
  
  @FindBy(xpath="//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
  WebElement createaccbutton;
  
  public EbayTest2(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  @Test
  public void registration()
  {
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  registerbutton.click();
	  personaltypeaccount.click();
	  firstname.sendKeys("Ken");
	  lastname.sendKeys("williamson");
	  emailaddress.sendKeys("kenwilliamson@gmail.com");
	  password.sendKeys("Thomas10@123");
	  createaccbutton.click();
  }
}
