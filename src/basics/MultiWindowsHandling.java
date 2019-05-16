package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SSTS/rasool/selenium_concepts/frames/framesDemo.html");
		driver.manage().window().maximize();

		// locate open windows button and click on it, it will open multiple windows
		driver.findElement(By.id("opentTab")).click();
		Thread.sleep(5000);

		// get all windows ids opened by driver instance
		Set<String> windowHandles = driver.getWindowHandles();
		// convert that set to list
		List<String> windowIds = new ArrayList<>(windowHandles);

//		for (int i = 0; i < windowIds.size(); i++) {
//			driver.switchTo().window(windowIds.get(i));
//			System.out.println(driver.getTitle());
//		}
		
		//switch to youtube
		driver.switchTo().window(windowIds.get(2));
		
		driver.findElement(By.id("search")).sendKeys("selenium"+Keys.ENTER);
		Thread.sleep(3000);
		
		//switch to facebook
		driver.switchTo().window(windowIds.get(1));
		driver.findElement(By.id("email")).sendKeys("sunshine");
		Thread.sleep(2000);
		
		
		//switch to google
		driver.switchTo().window(windowIds.get(3));
		driver.findElement(By.name("q")).sendKeys("best selenium training institute in lingampally"+Keys.ENTER);
		Thread.sleep(4000);
		
		//switch to main window
		driver.switchTo().window(windowIds.get(0));
		driver.findElement(By.id("opentWin")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		driver.quit();

	}

}
