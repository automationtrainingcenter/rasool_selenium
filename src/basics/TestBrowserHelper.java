package basics;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class TestBrowserHelper extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://google.com");
		sleep(5000);
		closeBrowser();
	}

}
