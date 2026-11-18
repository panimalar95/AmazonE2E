package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Basetest extends Listenerslogic
{

	
    @Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String Nameofbrowser) throws InterruptedException
	{
		if(Nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		if(Nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
	}
	
	@AfterMethod
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	{

}
}
