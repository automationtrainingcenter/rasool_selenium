package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		/*
		 * In WebDriver interface we have manage() which return Options interface reference
		 * In Options interface we have window() which returns Window interface reference
		 */
		Options manage = driver.manage();
		Window window = manage.window();
		
		// getSize() -Dimension class object which is height and width of the browser
		// window
		Dimension size = window.getSize();
		System.out.println(String.format("browser height is %s and width is %s", size.getHeight(), size.getWidth()));

		// getPosition() - Point class object which is x and y coordinate location of
		// window
		Point position = window.getPosition();
		System.out.println(String.format("Browser is at x = %d and at y = %d", position.getX(), position.getY()));
		System.out.println("Browser is at x = "+position.getX()+" and at y = "+position.getY());

		// maximize() - it will maximizes the browser window
		window.maximize();
		Thread.sleep(2000);

		// fullScreen() - F11 mode
		window.fullscreen();
		Thread.sleep(2000);
		
		// setSize(Dimesion arg) - set browser height and width with specified values
		window.setSize(new Dimension(400, 250));
		Thread.sleep(2000);
		
		// setPosition(Point arg) - set browser location with specified x and y
		// coordinate value
		window.setPosition(new Point(300, 150));
		Thread.sleep(2000);
		

		driver.close();
	}

}
