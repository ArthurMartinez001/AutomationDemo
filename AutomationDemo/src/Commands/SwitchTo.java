package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/* This class is for switching to active windows and or pop ups*/


public class SwitchTo 
{
	public void alertBox()
	{
		try
		{
			WebElement openAlert = BrowserConnection.ChromeConnector.driver.findElement(By.id("alert-button"));
			openAlert.click();
			
		}
		catch(Exception e)
		{
			System.out.print("/nalertBox Method  " + e + "\n");
		}
	}

}// end of SwitchTo class
