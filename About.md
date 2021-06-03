#Automation Demo

This project is just a demo, displaying some basic Java + Selenium test on a website. 

Framework: 
  Source folders
    AutomationDemoFramework - consists of the following classes: 
      Main - main class
      TestRun - construct Java/Selenium tests.
      TestRunJUnitTests - construct JUnit tests.
    BrowserConnection - consists of the following class: 
      ChromeConnector - chrome connectors
    Commands - consists of the following classes: 
      Autocomplete- all method commands for the autocomplete page.
      Switchto - all methods to test pages launched or pop ups. 
    QuitBrowser- consists of the following classes: 
      QuitChrome - all methods to quit browser page or quit chrome driver.
    Webpages- consists of the following classes: 
      ChromeBrowserTest - all methods that find and click on selected hyperlinks. 
      
      
3 Automation tests for the following: 

1. Test Case: Input Address search, select on result.
	 1. User clicks on main page hyperlink AutoComplete
	 2. Page opens, user adds input in the search.
	 3. Autocomplete displays address. 
	 4. User selects a choice. 
	 5.Page should fill in address. 


      
