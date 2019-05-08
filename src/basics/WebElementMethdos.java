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
		 * sendKeys(String arg) it is used to type some data in a text field or text
		 * area
		 */
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("sunshine");
		sleep(2000);

		/*
		 * clear() it removes any existing data from the text field or text area
		 */
		firstName.clear();
		sleep(2000);
		
		/*
		 * click() it will click on any element
		 */
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		sleep(2000);


		/*
		 * submit() which will submit a form to the server
		 */
		driver.findElement(By.id("email")).submit();
		sleep(2000);

		WebElement loginButton = driver.findElement(By.id("loginbutton"));

		/*
		 * getText() -> String : returns a String value i.e. the inner text of element
		 */
		String innerText = loginButton.getText();
		System.out.println(String.format("inner text of login button is %s", innerText));

		/*
		 * getAttribute(String arg) -> String value: it returns a String value i.e.
		 * value of the given attribute name
		 */
		String attributeValue = loginButton.getAttribute("type");
		System.out.println(String.format("value of the type attribute is %s", attributeValue));

		/*
		 * getCssValue(String arg) -> String value: it returns string value i.e. value
		 * of the given css property
		 */
		String loginFontSize = loginButton.getCssValue("font-size");
		System.out.println(String.format("font size of login button is %s", loginFontSize));

		/*
		 * getTagName() -> String value: it returns String value i.e. tag name of the
		 * given element
		 */

		String loginTagName = loginButton.getTagName();
		System.out.println(String.format("tag name of the login button is %s", loginTagName));

		/*
		 * isDisplayed() -> boolean value: it returns true if a given element is visible
		 * on the page
		 */
		boolean displayed = loginButton.isDisplayed();
		System.out.println("login button is displayed " + displayed);

		/*
		 * isEnabled() -> boolean value: it return true if a given element is in enable
		 * mode
		 */
		boolean enabled = loginButton.isEnabled();
		System.out.println("login button is enabled " + enabled);

		// go back in driver history
		driver.navigate().back();
		sleep(2000);
		/*
		 * isSelected() -> boolean value: it returns true if a given option is selected
		 */
		boolean selected = driver.findElement(By.cssSelector("input[value='1']")).isSelected();
		System.out.println("female radio is selected " + selected);

		driver.close();

	}
}
