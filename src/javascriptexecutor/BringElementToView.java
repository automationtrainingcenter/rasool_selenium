package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
import utilitiles.JavaScriptHelper;

public class BringElementToView extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.facebook.com");
		sleep(2000);
		WebElement messgerLink = driver.findElement(By.cssSelector("a[href *= 'messenger']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView()", messgerLink);
		JavaScriptHelper.bringElementToView(driver, messgerLink);
		sleep(3000);
		closeBrowser();
	
	}

}
