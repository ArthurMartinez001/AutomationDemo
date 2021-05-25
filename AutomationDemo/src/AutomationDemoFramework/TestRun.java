package AutomationDemoFramework;

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
	 * */
	public void chromeAutoComplete() throws InterruptedException
	{
		try
		{
			
			web.webPage();
			Thread.sleep(2000);
			web.autoCompletePage();
			Thread.sleep(1000);
			filler.input1();
			Thread.sleep(1000);
			//tear down
			quitter.closePage();
			System.out.print("Auto Complete test complete");
		}
		catch(Exception e)
		{
		 System.out.print("chromeAutoComplete: " + e);
		}
	} //chromeAutoComplete method.
	
	public void switchToActiveWindow()
	{
		try 
		{
			web.webPage();
			Thread.sleep(1000);
			web.switchWindow();
			Thread.sleep(1000);
			quitter.closePage();
			System.out.print("Active Window test complete");
		}
		catch (Exception e)
		{
			System.out.print("switchToActiveWindow: " + e);
		}
	}

}// end class TestRun
