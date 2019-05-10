package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		//locate open window button and click on it, it will open a new window
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(3000);
		
		/*
		 * get ids of all windows opened by driver instance using getWindowHandles() of WebDriver interface
		 * getWindowHanldes() returns a Set<String> and convert that set to List<String>
		 * In that list index 0 we will have id of main window, index 1 will have id  of first child window
		 * , index 2 will id of second child window and so on 
		 * to switch the focus from main window to any window use following approach
		 * In WebDriver interface we have switchTo() which returns TargetLocator interface
		 * In TargerLocator interface we have window(String arg) i.e. id of the child window you want to switch
		 */
		Set<String> windowHandles = driver.getWindowHandles();
		//convert that Set to List
		List<String> windowIds = new ArrayList<>(windowHandles);
		
		//switch the driver focus to child window
		driver.switchTo().window(windowIds.get(1));
		
		//now focus is in child window
		//locate search fields and search for ruby
		driver.findElement(By.id("search-courses")).sendKeys("ruby");
		Thread.sleep(3000);
		
		//switch the driver focus back to main window
		driver.switchTo().window(windowIds.get(0));
		
		//locate enter your name text field and enter some data
		driver.findElement(By.id("name")).sendKeys("sunshine");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
