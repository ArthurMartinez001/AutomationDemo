package QuitBrowser;

public class QuitChrome 
{
	//ChromeConnector connection = new ChromeConnector();

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
