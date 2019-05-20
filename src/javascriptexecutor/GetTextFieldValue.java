package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
import utilitiles.JavaScriptHelper;

public class GetTextFieldValue extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://www.facebook.com/");
		sleep(2000);
		
		//locate text field
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("sunshine");
		sleep(2000);
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("selenium");
		sleep(2000);
		
		
		//get the text field value
		//create JavaScriptExecutor reference
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value = arguments[1]", fname, "selenium");
		
//		String fnameValue = js.executeScript("return arguments[0].value", fname).toString();
		String fnameValue = JavaScriptHelper.getText(driver, fname);
		System.out.println("first name value is "+fnameValue);
		
//		String lnameValue = js.executeScript("return arguments[0].value", lname).toString();
		String lnameValue = JavaScriptHelper.getText(driver, lname);
		System.out.println("last name value is "+lnameValue);
		
		closeBrowser();
		
		
	}

}
