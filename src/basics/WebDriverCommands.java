package basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		// Set the System property for chromedriver.exe file
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");

		// Create an object of ChromeDriver class
		WebDriver driver = new FirefoxDriver();

		// get(String arg) - navigates to a url
		driver.get("http://www.facebook.com");

		// getTitle() - returns title of the current web page. tilte is inner text of
		// title tag in head tag
		String title = driver.getTitle();
		System.out.println("title of the current web page is " + title);

		// getCurrentUrl() - returns url of the current web page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("url of the current page is " + currentUrl);

		// getPageSource() - returns source code of the current web page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource.contains("Facebook helps you connect and share with the people in your life"));

		// getWindowHandle() - returns unique id of the current browser window
		String windowId = driver.getWindowHandle();
		System.out.println("id of the current window or tab is " + windowId);

		// getWindowHandles() - returns a set of unique ids of the all the windows
		// opened by the driver instance
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println("the number of windows opened are " + windowIDs.size());

		/*
		 * findElement(By arg) which accepts a By class argument and returns a
		 * WebElement interface reference. It is used to locate an element in the web
		 * page using locating techniques provided in By class. If an element located
		 * with the information we provided it will return that element as a WebElement
		 * interface reference else it will throw NoSuchElementException
		 */
		WebElement email = driver.findElement(By.id("email"));

		/*
		 * findElements(By arg): which accepts a By class argument and returns List of
		 * WebElement type If elemnets are located using the information we provided it
		 * will return the List of those elements else it will return List of size 0
		 */
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of links in the page are "+links.size());

		// close() - it will close current browser window
//		driver.close();

		// quit() - it will close all the browser windows opened by driver instance
		driver.quit();
	}

}
