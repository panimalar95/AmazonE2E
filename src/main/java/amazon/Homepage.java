package amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	

	@FindBy(xpath="//div[@id='nav-link-accountList']")
	private WebElement accountandlist;
	
	@FindBy(xpath = "//a[@class='nav-action-signin-button']")
	private WebElement signin;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(xpath= "//span[text()='Sign Out']")
	private WebElement signout;
	
	public void hoveroveronaccountlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
			
	}
	
	public void signin()
	{
		signin.click();
	}
	
	public void searchtext()
	{
		searchbox.sendKeys("Toys"+Keys.ENTER);
	}
	
	public void signout()
	{
		signout.click();
	}
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
