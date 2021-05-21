package AutomationDemoFramework;

import Commands.AutoComplete;
import QuitBrowser.QuitChrome;
import WebPages.ChromeBrowserTest;

public class AutoMain {

	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		ChromeBrowserTest web = new ChromeBrowserTest();
		AutoComplete filler = new AutoComplete();
		QuitChrome quitter = new QuitChrome();
		
		
		web.webPage();
		Thread.sleep(2000);
		filler.autoCompletePage();
		Thread.sleep(1000);
		filler.input1();
		Thread.sleep(1000);
		quitter.quitChrome();
		System.out.print("Execution Complete");

	}

}
