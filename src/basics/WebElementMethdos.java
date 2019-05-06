package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethdos {
	public static void sleep(long timeInMillis) {
		try {
			Thread.sleep(timeInMillis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * sendKeys(String arg)
		 * it is used to type some data in a text field or text area
		 */
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("sunshine");
		sleep(2000);
		
		/*
		 * click()
		 * it will click on any element
		 */
		driver.findElement(By.id("loginbutton")).click();
		sleep(2000);
		
		driver.close();
		
		
	}
}
