package QuitBrowser;

public class QuitChrome 
{

		// this method closes a browser page
	public void closePage() throws InterruptedException
	{
		try
		{
			ChromeConnection.ChromeConnector.driver.close();
		}
		catch(Exception e)
		{
			System.out.print(" Close Window " + e);
		}
	}// end closePage method
	
	//this method quits the driver closing everything out.
	public void quitChrome() throws InterruptedException
	{
		try
		{
			ChromeConnection.ChromeConnector.driver.quit();
			
		}
		catch(Exception e)
		{
			System.out.print(e + " quitChrome method ");
		}
		
	}//end quitChrome method

} //end quitChrome method
