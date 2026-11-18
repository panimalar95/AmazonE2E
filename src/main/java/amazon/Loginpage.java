package amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	@FindBy(id="ap_email_login")
	private WebElement emailid;
	
	@FindBy(id = "continue")
	private WebElement continuebutton;
	
	@FindBy(id="ap_password")
	private WebElement passwordenter;
	
	@FindBy(id = "signInSubmit")
	private WebElement signinbutton;
	
	@FindBy(xpath ="//div[@id='claim-collection-container']/h1")
	private WebElement signinorcreateaccounttext;

	public void enteremail()
	{
		emailid.sendKeys("8220457664");
	}
	public void continuebtn()
	{
		continuebutton.click();
	}
	public void enterpwd()
	{
		passwordenter.sendKeys(Keys.ENTER);
		passwordenter.sendKeys("Amazon@26");	
	}
   public void signinsubmit()
	{
		signinbutton.click();
	}
	public String verifyingLoginpage()
	{
		String  title = signinorcreateaccounttext.getText();
		return title;
	}
   
   
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
