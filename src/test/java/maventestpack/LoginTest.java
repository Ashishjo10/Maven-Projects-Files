package maventestpack;

import org.testng.annotations.Test;

import mavenbase.Baseclass;



public class LoginTest extends Baseclass
{
	@Test
	   public void logintestenable()
	   {
		JasNewSelect lg=new JasNewSelect(driver);
		   lg.newSelect();
		   lg.proDuctClick();
		   
		   
		   JasWishlistProduct  lt=new JasWishlistProduct (driver);
		   lt.productWishlist();
		   lt.moVe2caRt();
	   }
}
