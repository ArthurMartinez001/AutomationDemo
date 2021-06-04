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
	{  //set up 
		runTest.chromeAutoComplete();
		Thread.sleep(1000);	
	} //end set up  
	
	@Test
	public void test() throws InterruptedException 
	{	
		System.out.print("Start address test.\n");
		WebElement streetNo = BrowserConnection.ChromeConnector.driver.findElement(By.id("route"));
		WebElement streetName = BrowserConnection.ChromeConnector.driver.findElement(By.id("street_number"));
		WebElement city = BrowserConnection.ChromeConnector.driver.findElement(By.id("locality"));
		WebElement state = BrowserConnection.ChromeConnector.driver.findElement(By.id("administrative_area_level_1"));
		WebElement zipCode = BrowserConnection.ChromeConnector.driver.findElement(By.id("postal_code"));
		WebElement country = BrowserConnection.ChromeConnector.driver.findElement(By.id("country"));
		
		String theText1 = streetNo.getAttribute("value");
		String theText = streetName.getAttribute("value");
		String cityText = city.getAttribute("value");
		String stateText = state.getAttribute("value");
		String zipText = zipCode.getAttribute("value");
		String countryText = country.getAttribute("value");
		
		String StreetNoInfo = ("West Orange Grove Avenue");
		String StreetNameInfo = ("1295");
		String cityInfo = ("Pomona");
		String stateInfo = ("CA");
		String zipInfo = ("91768");
		String countryInfo = ("United States");
		
		assertEquals(StreetNoInfo, theText1);	
		assertEquals(StreetNameInfo, theText);
		assertEquals(cityInfo, cityText);
		assertEquals(stateInfo, stateText);
		assertEquals(zipInfo, zipText);
		assertEquals(countryText, countryInfo);
		
		
		System.out.print("\n**** Text Tests Passed ****\n\n");
			
	} //end Test
	
	@After
	public void breakDown() throws InterruptedException
	{
		//complete breakdown or teardown
		quitter.closePage();
		System.out.print("Test complete.");
	}// end breakDown Method
	


} //end TestRunJUnitTests class
