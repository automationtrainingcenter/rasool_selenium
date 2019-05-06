package Selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class MercuryToursAssignment {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement First_Name = driver.findElement(By.name("firstName"));
		First_Name.sendKeys("asdf");
		
		WebElement Last_Name = driver.findElement(By.name("lastName"));
		Last_Name.sendKeys("asdf");
		

		WebElement Phone = driver.findElement(By.name("phone"));
		Phone.sendKeys("asdf");
		
		WebElement Email = driver.findElement(By.name("userName"));
		Email.sendKeys("asdf@gmail.com");

		WebElement Address = driver.findElement(By.name("address1"));
		Address.sendKeys("asdf");
		
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("asdf");
		
		WebElement State = driver.findElement(By.name("state"));
		State.sendKeys("asdf");
		
		WebElement PostalCode = driver.findElement(By.name("postalCode"));
		PostalCode.sendKeys("asdf");
		
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("asdf");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("asdf");
		
		WebElement ConfirmPW = driver.findElement(By.name("confirmPassword"));
		ConfirmPW.sendKeys("asdf");
		
		Thread.sleep(5000);
		
		WebElement Submit=driver.findElement(By.name("register"));
		Submit.click();
		
		driver.close();


	}

}
