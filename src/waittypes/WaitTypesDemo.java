package waittypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class WaitTypesDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.facebook.com");
		/*
		 * implicitlyWait() -- An implicit wait tells the WebDriver to wait for a
		 * certain amount of time when trying to locate element or elements if they are
		 * not available immediately on the page the implicit wait set for life of the
		 * WebDriver object
		 */
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		/*
//		 * pageLoadTimeout() -- A pageLoadTimeout tells the WebDriver to wait for a
//		 * certain amount of time for a page load to complete before throwing an
//		 * exception
//		 */
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		
//
//		/*
//		 * setScriptTimeout() -- setScriptTimeout tells the WebDriver to wait for a
//		 * certain amount of time for an asynchronous script to finish execution before
//		 * throwing an exception
//		 */
//		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		/*
		 * Explicit wait or WebDriverWait with Expected conditions -- tells the
		 * WebDriver to wait for a certain condition to met before locating an element
		 * with in a given time frame
		 */
		//create an object of WebDriverWait class
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		ele.sendKeys("sunshine");
	}

}
