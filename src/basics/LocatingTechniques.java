package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingTechniques {
	public static void main(String[] args) {
		// Set the System property for chromedriver.exe file
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");

		// Create an object of ChromeDriver class
		WebDriver driver = new FirefoxDriver();

		// get(String arg) - navigates to a url
		driver.get("http://www.facebook.com");
		
		//maximize browser window
		driver.manage().window().maximize();
		
		/*
		 * Selenium provides By class which contains several static methods to 
		 * locate an element in the current webpage
		 */
		
		/* id(String arg) - return By class reference
		 * it will locate an elmeent using id attribute value of the element
		 */
		
//		By emailId = By.id("email");
//		WebElement email = driver.findElement(emailId);
		WebElement email = driver.findElement(By.id("email"));
		
		/*
		 * name(String arg) - returns By class refernce
		 * if will locate an element using name attribute value of the element
		 */
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		
		/*
		 * linkText(String arg) - returns By class reference
		 * it will locate links in the page using link text
		 * link text is nothing but inner text of the <a>
		 */
		
		WebElement forgottenAccountLink = driver.findElement(By.linkText("Forgotten account?"));
		
		/*
		 * partialLinkText(String arg) - returns By class reference
		 * it will locate a link using part of the link text
		 */
		WebElement yDOBLink = driver.findElement(By.partialLinkText("date of birth"));
		
		/*
		 * cssSelector(String arg) - returns By class reference
		 * using cssSelector and xpath we can locate an element using any attribute values
		 * syntax: tagname[attrName = 'attrValue']
		 */
		WebElement femaleRadio = driver.findElement(By.cssSelector("input[value='1']"));
		
		/*
		 * xpath(String arg) - returns By class reference
		 * syntax : //tagname[@attrName = 'attrValue']
		 */
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='2']"));
		
		
		/*
		 * className(String arg) -return By class reference
		 * it will locate element or elements using class name (not class attribute value)
		 * one class attribute might contain multiple class names which are separated by space
		 * ex: class = "class1 class2 class3"
		 * here class1, class2 and class3 are 3 different class names
		 * By.className("class1");
		 */
		List<WebElement> textFields = driver.findElements(By.className("inputtext"));
		System.out.println(String.format("number of textfields in page are %d", textFields.size()));
		
		
		/*
		 * tagName(Sting arg) - returns By class reference
		 * it will locate element or elements using tag name
		 */
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(String.format("number of links in the page are %d", links.size()));
		
		driver.close();
	}

}
