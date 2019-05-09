package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		/*
		 * To handle alerts Selenium provides Alert interface
		 * 1 switch driver focus from web page to alert using switchTo() of WebDriver
		 * 2 get the text of alert
		 * 3 automate the alert i.e. either send data to alert text filed or click ok or cancel
		 * buttons
		 * 
		 * In WebDriver interface we have switchTo() which will return TargetLocator interface
		 * In TargetLocator interface we have alert() which will return Alert interface reference
		 * 
		 * In Alert interface we have
		 * accept() : it will click on OK button of the alert
		 * dismiss() : it will click on Cancel button of the alert
		 * getText() : return String value i.e. text of the alert
		 * sendKeys(String arg) : it will type some data in the alert text field 
		 * 
		 */
		
		//locate enter your name text filed and type some data
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("sunshine");
		Thread.sleep(2000);
		
		//locate alert button and click on it, it will open an alert with ok button
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		//Create an Alert interface reference by switching the driver focus to alert
		Alert alert = driver.switchTo().alert();
		
		//get the text of alert
		System.out.println(alert.getText());
		
		//click on OK button of the alert using accept() of Alert interface
		alert.accept();
		
		Thread.sleep(3000);
		
		name.sendKeys("surya");
		Thread.sleep(2000);
		
		//locate confirm button and click on it, it will open and alert with OK and cancel buttons
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		
		//switch the driver focus to alert
		Alert confirmAlert = driver.switchTo().alert();
		
		//get the alert text
		System.out.println(confirmAlert.getText());
		
		//click on Cancel button of the alert using dismiss()
		confirmAlert.dismiss();
		Thread.sleep(2000);
		
		driver.close();


	}
}
