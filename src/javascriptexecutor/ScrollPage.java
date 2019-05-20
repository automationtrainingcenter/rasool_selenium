package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
import utilitiles.JavaScriptHelper;

public class ScrollPage extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.amazon.in");
		sleep(2000);
		WebElement backToTop = driver.findElement(By.id("navBackToTop"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("arguments[0].scrollIntoView()", backToTop);
		JavaScriptHelper.bringElementToView(driver, backToTop);
		sleep(2000);
//		js.executeScript("document.documentElement.scrollBy(0, arguments[0])", -100);
		JavaScriptHelper.scrollPageBy(driver, 0, -100);
		sleep(2000);
		backToTop.click();
		sleep(2000);
		
		closeBrowser();
	}

}
