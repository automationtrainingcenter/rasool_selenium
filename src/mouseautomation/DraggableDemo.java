package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class DraggableDemo extends BrowserHelper{
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://jqueryui.com/draggable/");
		
		//switch to frame which contains draggable element
		driver.switchTo().frame(0);
		
		//locate draggable element
		WebElement dragEle = driver.findElement(By.id("draggable"));
		
		//create an object of Actions class
		Actions actions = new Actions(driver);
		
//		actions.clickAndHold(dragEle).moveByOffset(250, 150).release().build().perform();
		actions.dragAndDropBy(dragEle, 250, 150).build().perform();
		sleep(3000);
		
		closeBrowser();
	}

}
