package AutomationDemoFramework;

import QuitBrowser.QuitChrome;

public class AutoMain {

	
	public static void main(String[] args) throws InterruptedException
	{
		TestRun runner = new TestRun();
		QuitChrome quitter = new QuitChrome();
		
		runner.chromeAutoComplete();
		Thread.sleep(500);
		//quitter.quitChrome();
		

	}

}
