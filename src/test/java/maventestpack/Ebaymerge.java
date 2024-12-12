package maventestpack;

import org.testng.annotations.Test;

import mavenbase.Ebaybaseclass;

public class Ebaymerge extends Ebaybaseclass
{
	@Test
	 public void logintestenable()
	   {
		 EbayTest1 test1=new EbayTest1(driver);
		   test1.searchText();
		   test1.windowhandling();
		   
		   
		   EbayTest2  test2=new EbayTest2(driver);
		   test2.registration();
		 
	   }
}
