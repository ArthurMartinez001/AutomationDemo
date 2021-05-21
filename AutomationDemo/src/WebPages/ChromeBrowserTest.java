package WebPages;

public class ChromeBrowserTest 

{
	//opens main webPage
	public void webPage() throws InterruptedException
	{
		try
		{	
			// goes directly to webpage
			ChromeConnection.ChromeConnector.driver.navigate().to("https://formy-project.herokuapp.com");
			
		}//end try
		catch(Exception e)
		{
			System.out.print(e + " webPage ");
		}//end catch
		
	} //end webpage method
	
}// end ChromeBrowserTest class