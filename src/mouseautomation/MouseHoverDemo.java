package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
/*
 * To automate mouse events Selenium provides Actions class 
 * Create an object of Actions class by providing WebDriver object as an argument
 * Call the methods of Actions class to perform mouse events
 * and every event or every Actions class method class must have build() and perform()
 * build() is used to build the actions or mouse events
 * perform() is used to perform actions on elements
 */

public class MouseHoverDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.amazon.in");
		//locate shop by category element
		WebElement shopByCat = driver.findElement(By.id("nav-link-shopall"));
		
		//create Actions class object
		Actions actions = new Actions(driver);
		actions.moveToElement(shopByCat).build().perform();
		sleep(2000);
		
		//locate mobile and computers
		WebElement mobileAndComputers = driver.findElement(By.cssSelector("span[aria-label='Mobiles, Computers']"));
		//move the mouse to mobile and computers
		actions.moveToElement(mobileAndComputers).build().perform();
		sleep(2000);
		
		
		//locate power banks
		WebElement powerbanks = driver.findElement(By.cssSelector("a[href *= 'Power-Banks']"));
		//move to power banks and click on it
		actions.moveToElement(powerbanks).click().build().perform();
		sleep(4000);
		
		closeBrowser();
	}

}
