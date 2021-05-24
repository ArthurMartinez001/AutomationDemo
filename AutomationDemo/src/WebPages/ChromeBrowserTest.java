package WebPages;

import org.openqa.selenium.By;

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
	
	//this method finds the hyperlinnk and clicks on it
	  public void autoCompletePage() //throws InterruptedException
	 	{
	 		try
	 		{
	 			
	 			ChromeConnection.ChromeConnector.driver.findElement(By.linkText("Autocomplete")).click();
	 		} // end try
	 		catch(Exception e)
	 		{
	 			System.out.print("Added page " + e);
	 		} //end catch
	 		
	 	}// end autoCompletePage method
	  
	  
	
}// end ChromeBrowserTest class