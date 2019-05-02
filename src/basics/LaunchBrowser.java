package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * To launch any browser in Selenium
 * 1 set the System property to the desired browser executable
 * 2 create an object object desired browser driver class
 */
public class LaunchBrowser {
	public static void main(String[] args) {

		// To launch chrome browser
		// set the System property to the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an object of ChromeDriver class
//		ChromeDriver cObj = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		

		// To launch firefox browser
		// set the system property to the path of geckodriver.exe file
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		// create an object of FirefoxDriver class
//		FirefoxDriver fObj = new FirefoxDriver();
		driver = new FirefoxDriver();

	}
}
