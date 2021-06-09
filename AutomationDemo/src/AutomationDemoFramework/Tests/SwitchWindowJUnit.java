package AutomationDemoFramework.Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.Alert;

import AutomationDemoFramework.BeforeTestRun;
import Commands.SwitchTo;

public class SwitchWindowJUnit 
{
	BeforeTestRun runTest = new BeforeTestRun();
	SwitchTo switcher = new SwitchTo();
	QuitBrowser.QuitChrome breakDown = new QuitBrowser.QuitChrome();
	

	
	@Test
	public void switchJUnitTest() throws InterruptedException
	{	
		System.out.print("Start Test: Switch Alert.\n");
		runTest.switchToActiveWindow();
		Thread.sleep(2000);
		switcher.alertBox();
		Alert alertBox = BrowserConnection.ChromeConnector.driver.switchTo().alert();
		String alertTextFound = alertBox.getText();
		String compareText = ("This is a test alert!");
		assertEquals(alertTextFound, compareText);
		System.out.print("\nSwitch Alert test\t ***passed***\n");
		
	}
	
}//end SwitchWindowJUnit class
