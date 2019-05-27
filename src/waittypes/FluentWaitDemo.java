package waittypes;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class FluentWaitDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.facebook.com");
		
		Function<WebDriver, WebElement> con1 = new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				return t.findElement(By.id("email"));
			}
		};
		
		Function<WebDriver, Boolean> con2 = (WebDriver d) -> {
			return d.getTitle().toLowerCase().contains("facebook");
		};
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(250));
		wait.ignoring(NoSuchElementException.class);
		
		
		if(wait.until(con2)) {
			System.out.println("page loaded");
		}
		
		WebElement ele = wait.until(con1);
		ele.sendKeys("sunshine");
		
	}
	
	

}
