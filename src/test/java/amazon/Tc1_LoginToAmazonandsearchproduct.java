package amazon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Basetest;



public class Tc1_LoginToAmazonandsearchproduct extends Basetest
{
	@Test
	public void validcredloginandsearch()
	{ 
		Reporter.log("Website launched");
		Homepage homepage = new Homepage(driver);
		homepage.hoveroveronaccountlist(driver);
		Reporter.log("Hoverover accountlist");
		homepage.signin();
		Reporter.log("Clickonsignin successful");		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enteremail();
		Reporter.log("Emailid entered");
		loginpage.continuebtn();
		loginpage.enterpwd();
		Reporter.log("Password entered");
		loginpage.signinsubmit();
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		homepage.searchtext();
		Assert.assertEquals(driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']")).size()>40, true);
	}

}
