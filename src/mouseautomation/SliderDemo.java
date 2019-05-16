package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class SliderDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://www.hdfcbank.com/personal-loan-emi-calculator/index.html");
		//locate slider head
		WebElement sliderHead = driver.findElement(By.cssSelector("#loan_amount_range>a"));
		//locate slider
		WebElement slider = driver.findElement(By.cssSelector("#loan_amount_range>div"));
		
		//find the width of slider
		int width = slider.getSize().getWidth();
		int move = (int)(width * 0.25);
		System.out.println(width);
		//create Actions class object
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(sliderHead, move, 0).build().perform();
		sleep(3000);
		
		closeBrowser();
		
		
	}

}
