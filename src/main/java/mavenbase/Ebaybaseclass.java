package mavenbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Ebaybaseclass 
{
	public static WebDriver driver;
	   
	   @BeforeClass
	   public void setUp()
	   {
		   driver=new ChromeDriver();
		   driver.get("https://www.ebay.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   }
}
