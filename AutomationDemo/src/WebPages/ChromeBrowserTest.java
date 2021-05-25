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
			BrowserConnection.ChromeConnector.driver.navigate().to("https://formy-project.herokuapp.com");
			
		}//end try
		catch(Exception e)
		{
			System.out.print(e + " webPage ");
		}//end catch
		
	} //end webpage method
	
	//this method finds the hyperlinnk AutoComplete and clicks on it
	  public void autoCompletePage() //throws InterruptedException
	 	{
	 		try
	 		{
	 			
	 			BrowserConnection.ChromeConnector.driver.findElement(By.linkText("Autocomplete")).click();
	 		} // end try
	 		catch(Exception e)
	 		{
	 			System.out.print("Added page " + e);
	 		} //end catch
	 		
	 	}// end autoCompletePage method
	  
	  //this method finds the hyperlink Switch Window and clicks on it. 
	  public void switchWindow()
	  {
		  try 
		  {
			  BrowserConnection.ChromeConnector.driver.findElement(By.linkText("Switch Window")).click();
		  }
		  catch(Exception e)
		  {
			  System.out.print("Switch Window" + e);
		  }
	  }// end of switchWindow method
	
}// end ChromeBrowserTest class