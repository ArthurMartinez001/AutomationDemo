package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoComplete 
{  
	  //this method fills out the info. 
	 public void input1() //throws InterruptedException
	    {

	        try {


	            WebElement autocompleted = BrowserConnection.ChromeConnector.driver.findElement(By.id("autocomplete"));
	            autocompleted.click();
	            autocompleted.sendKeys("1295 West Orange Grove Avenue, Pomona, CA 91768");
	            //select the pac item found that matches the address, then click it.
	            Thread.sleep(1000);
	            WebElement autocompleteR = BrowserConnection.ChromeConnector.driver.findElement(By.className("pac-item"));
	            autocompleteR.click();

	        	} //end try
	        catch (Exception e)
		        {
		            System.out.print(e + ", Location: input1. ");
		        } //end catch

	    }// end input1 method

	   
}//end AutoComplete class
