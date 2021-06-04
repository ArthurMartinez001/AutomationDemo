package AutomationDemoFramework;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commands.AutoComplete;
import QuitBrowser.QuitChrome;
import WebPages.ChromeBrowserTest;

public class TestRun 
{
	ChromeBrowserTest web = new ChromeBrowserTest();
	AutoComplete filler = new AutoComplete();
	QuitChrome quitter = new QuitChrome();
	
	/* Test Case: Input Address search, select on result.
	 * 1. User clicks on main page hyperlink AutoComplete
	 * 2. Page opens, user adds input in the search.
	 * 3. Autocomplete displays address. 
	 * 4. User selects a choice. 
	 * 5. Page should fill in address. 
	 * 
	 * */
	
	@Before
	
	public void chromeAutoComplete() throws InterruptedException
	{
		try
		{
			
			web.webPage();
			Thread.sleep(2000);
			web.autoCompletePage();
			Thread.sleep(1000);
			filler.input1();		
			
		}
		catch(Exception e)
		{
		 System.out.print("chromeAutoComplete: " + e);
		}
	} //chromeAutoComplete method.
	
	public void switchToActiveWindow()
	{ //This method will click on hyperlink Switch Window and launch the page
		try 
		{
			web.webPage();
			Thread.sleep(1000);
			web.switchWindow();
			Thread.sleep(1000);
			System.out.print("Active Window test complete");
		}
		catch (Exception e)
		{
			System.out.print("switchToActiveWindow: " + e);
		}
	}
	
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
