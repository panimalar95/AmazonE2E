package amazon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Basetest;



public class Tc1_LoginToAmazonandlogout extends Basetest
{
	@Test
	public void validcredandlogout() throws InterruptedException
	{ 
		Reporter.log("Website launched");
		Thread.sleep(2000);
		Homepage homepage = new Homepage(driver);
		homepage.hoveroveronaccountlist(driver);
		Reporter.log("Hoverover accountlist");
		homepage.signin();
		Reporter.log("Clickonsignin successful");		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enteremail();
		Reporter.log("Emailid entered");
		loginpage.continuebtn();
        Thread.sleep(2000);
		loginpage.enterpwd();
		Reporter.log("Password entered");
		loginpage.signinsubmit();
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		homepage.hoveroveronaccountlist(driver);
		homepage.signout();
		
		
		Assert.assertEquals(loginpage.verifyingLoginpage(), "Sign in or create account");
		Reporter.log("Signed out");
		
		
	}

}
