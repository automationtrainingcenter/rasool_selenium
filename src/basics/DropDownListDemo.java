package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		/*
		 * Selenium provides Select class to automate dropdown list or list box
		 */

		// locate day dropdown list
		WebElement dayEle = driver.findElement(By.id("day"));
		// create an object of Select class
		Select daySelect = new Select(dayEle);
		// find out default date
		WebElement defaultDateEle = daySelect.getFirstSelectedOption();
		System.out.println("default date is " + defaultDateEle.getText());
		// selectByIndex()
		daySelect.selectByIndex(38);

		Thread.sleep(2000);

		// locate month drop down list
		WebElement monthEle = driver.findElement(By.id("month"));
		// create an object of Select class
		Select monthSelect = new Select(monthEle);
		// find out default month
		WebElement defaultMonthEle = monthSelect.getFirstSelectedOption();
		System.out.println("default month is " + defaultMonthEle.getText());
		// selectByValue(String arg)
		monthSelect.selectByValue("8");
		Thread.sleep(2000);

		// locate year drop down list
		WebElement yearEle = driver.findElement(By.id("year"));
		// create an object of Select class
		Select yearSelect = new Select(yearEle);
		// find out default year
		WebElement defaultYearEle = yearSelect.getFirstSelectedOption();
		System.out.println("default year is " + defaultYearEle.getText());
		// selectByVisibleText(String arg)
		yearSelect.selectByVisibleText("1991");
		Thread.sleep(2000);

		driver.close();
	}

}
