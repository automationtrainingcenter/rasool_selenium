package screenshots;

import org.openqa.selenium.By;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
import utilitiles.JavaScriptHelper;
import utilitiles.ScreenshotHelper;

public class MultipleScreenshots extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.amazon.in");
		sleep(2000);
		//get the height of static header
		int headerHeight = driver.findElement(By.id("nav-main")).getSize().getHeight();
		
		//get client height i.e. view height
		long cHeight = (long) JavaScriptHelper.executeScript(driver, "return document.documentElement.clientHeight") - headerHeight;
		//get scroll height 
		long sHeight = (long) JavaScriptHelper.executeScript(driver, "return document.documentElement.scrollHeight");
		
		while(sHeight > 0) {
			//capture the screen shot
			ScreenshotHelper.captureScreenshot(driver, "screenshots", "amazon");
			//scroll the page by cHeight
			JavaScriptHelper.scrollPageBy(driver, 0, cHeight);
			sleep(2000);
			//reduce the scroll height by client height
			sHeight -= cHeight;
		}
		
		closeBrowser();
		
	}

}
