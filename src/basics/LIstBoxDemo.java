package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIstBoxDemo {
	public static boolean isOptionAvaliable(String option, Select select) {
		List<WebElement> options = select.getOptions();
		boolean status = false;
		for(WebElement op : options) {
			if (op.getText().toLowerCase().equals(option)){
				status = true;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();

		// locate list box
		WebElement fruitsEle = driver.findElement(By.id("multiple-select-example"));
		// create an object Select class
		Select fruitSelect = new Select(fruitsEle);
		// find out number of options in fruitselect
		List<WebElement> options = fruitSelect.getOptions();
		System.out.println("nubmer of options in fruit select is " + options.size());
		boolean isAvailable = isOptionAvaliable("apple", fruitSelect);
		if (isAvailable) {
			System.out.println("option available");
		} else {
			System.out.println("option not available");
		}

		// verify list box allows multiple selection or not
		if (fruitSelect.isMultiple()) {
			// select an option based on index
			fruitSelect.selectByIndex(2);
			Thread.sleep(2000);
			// select an option based on value
			fruitSelect.selectByValue("apple");
			Thread.sleep(2000);
			// find out number of options selected
			List<WebElement> allSelectedOptions = fruitSelect.getAllSelectedOptions();
			System.out.println("nubmer of selected options are " + allSelectedOptions.size());

			// select an option based on visible text
			fruitSelect.selectByVisibleText("Orange");
			Thread.sleep(2000);

			// deselect all selected options
//			fruitSelect.deselectAll();
//			Thread.sleep(2000);

			// deselect an option based on index
			fruitSelect.deselectByIndex(0);
			Thread.sleep(2000);

			// deselect an option based on value
			fruitSelect.deselectByValue("orange");
			Thread.sleep(2000);

			// deselect an option based visible text
			fruitSelect.deselectByVisibleText("Peach");
			Thread.sleep(2000);

		} else {
			fruitSelect.selectByIndex(1);
		}

		driver.close();
	}

}
