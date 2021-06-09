package AutomationDemoFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commands.AutoComplete;
import QuitBrowser.QuitChrome;
import WebPages.ChromeBrowserTest;

public class BeforeTestRun 
{
	ChromeBrowserTest web = new ChromeBrowserTest();
	AutoComplete filler = new AutoComplete();
	QuitChrome quitter = new QuitChrome();
	
	/***
	 * SetUp
	 * Open main webpage
	 * find hyperlink "AutoComplete"
	 * click on it
	 */
	

	
	public void chromeAutoComplete() throws InterruptedException
	{
		try
		{
			
			web.webPage();
			Thread.sleep(1000);
			web.autoCompletePage();
			Thread.sleep(1000);
			filler.input1();		
			
		}
		catch(Exception e)
		{
		 System.out.print("chromeAutoComplete: " + e);
		}
	} //chromeAutoComplete method.
	
	
	
	/***
	 * SetUp
	 * Open main webpage
	 * find hyperlink "Switch Window"
	 * click on it
	 */
	
	public void switchToActiveWindow()
	{ //This method will click on hyperlink Switch Window and launch the page
		try 
		{
			web.webPage();
			Thread.sleep(1000);
			web.switchWindow();
			Thread.sleep(1000);
			
		}
		catch (Exception e)
		{
			System.out.print("switchToActiveWindow: " + e);
		}
	}
	
	
	/***
	 * This function is for
	 * quick test, verify it is working
	 * 
	 */
	public void quickTest() throws InterruptedException
	{
		web.webPage();
		Thread.sleep(2000);
		web.autoCompletePage();
		Thread.sleep(1000);
		WebElement autocompleted = BrowserConnection.ChromeConnector.driver.findElement(By.id("route"));
        autocompleted.click();
        autocompleted.sendKeys("North Orange Grove Avenue");
	}

}// end class TestRun
