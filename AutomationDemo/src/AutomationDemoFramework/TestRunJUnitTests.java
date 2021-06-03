package AutomationDemoFramework;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserConnection.ChromeConnector;
import Commands.AutoComplete;
import QuitBrowser.QuitChrome;
import WebPages.ChromeBrowserTest;

public class TestRunJUnitTests 
{
	ChromeConnector connectMe = new ChromeConnector();
	ChromeBrowserTest web = new ChromeBrowserTest();
	AutoComplete filler = new AutoComplete();
	QuitChrome quitter = new QuitChrome();
	TestRun runTest = new TestRun();
	
	
	@Before
	public void setUp() throws InterruptedException
	{  //set up the auto complete with text
		//runTest.chromeAutoComplete();
		runTest.quickTest();
		Thread.sleep(1000);	
	} //end set up  
	
	@Test
	public void test() throws InterruptedException 
	{
		System.out.print("Start Auto Complete Test.   ");
		
		WebElement streetName = BrowserConnection.ChromeConnector.driver.findElement(By.id("route"));
		String theText = streetName.getAttribute("value");
		String StreetNameInfo = ("North Orange Grove Avenue");
		assertEquals(StreetNameInfo, theText);	
		System.out.print(" **** Street Name Passed ****");
		
	} //end Test
	
	@After
	public void breakDown() throws InterruptedException
	{
		quitter.closePage();
		System.out.print("  Test complete.");
	}
	

} //end TestRunJUnitTests class
