package BrowserConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConnector 

{	//Webdriver location
	public static WebDriver driver = new ChromeDriver();
	
	public void ChromeStarter()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arthur.martinez/eclipse-workspace/chromedriver");
	 	
			
	}// end ChromeStarter method
	
}// end Chrome Connector class
