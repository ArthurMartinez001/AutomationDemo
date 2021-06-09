package AutomationDemoFramework;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import QuitBrowser.QuitChrome;

@RunWith(Suite.class)
@Suite.SuiteClasses
(
 {
	AutomationDemoFramework.Tests.AutoCompleteJUnit.class,
	AutomationDemoFramework.Tests.SwitchWindowJUnit.class,
 }
)
public class JUnitTestSuites 
{
	


		
		@BeforeClass
		public static void setUpBeforeClass()throws Exception
		{
			BrowserConnection.ChromeConnector connect = new BrowserConnection.ChromeConnector();
			connect.ChromeStarter();
		}
		
		@AfterClass
		public static void tearDownAfterClass() throws Exception
		{
			//complete breakdown or teardown
			QuitChrome quitter = new QuitChrome();
			quitter.quitChrome();
			System.out.print("\nTest complete.");
		}


}
