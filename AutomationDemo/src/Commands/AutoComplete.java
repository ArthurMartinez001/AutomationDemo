package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoComplete 
{
	  public void autoCompletePage() //throws InterruptedException
	 	{
	 		try
	 		{
	 			//WebElement auto1 = ChromeConnection.ChromeConnector.driver.findElement(By.linkText("Autocomplete"));
	 			//auto1.click();
	 			
	 			ChromeConnection.ChromeConnector.driver.findElement(By.linkText("Autocomplete")).click();
	 		} // end try
	 		catch(Exception e)
	 		{
	 			System.out.print("Added page " + e);
	 		} //end catch
	 		
	 	}// end autoCompletePage method

	
	 public void input1() //throws InterruptedException
	    {

	        try {

	            //Thread.sleep(2000);

	            WebElement autocompleted = ChromeConnection.ChromeConnector.driver.findElement(By.id("autocomplete"));
	            autocompleted.click();
	            ChromeConnection.ChromeConnector.driver.findElement(By.id("autocomplete")).click();
	            autocompleted.sendKeys("North Orange Grove Avenue, Pomona, CA 91768");
	            
	            Thread.sleep(1000);
	            WebElement autocompleteR = ChromeConnection.ChromeConnector.driver.findElement(By.className("pac-item"));
	            autocompleteR.click();

	        } //end try
	        catch (Exception e)
	        {
	            System.out.print(e + ", Location: input1. ");
	        } //end catch

	    }// end input1 method

	   
}//end AutoComplete class
