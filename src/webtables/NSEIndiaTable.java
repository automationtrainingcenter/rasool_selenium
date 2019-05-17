package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class NSEIndiaTable extends BrowserHelper {
	public static void main(String[] args) {
		String companyCode = "DRREDDY";
		openBrowser(Browser.CHROME, "https://www.nseindia.com/live_market/dynaContent/live_watch/pre_open_market/pre_open_market.htm");
		WebElement tBody = driver.findElement(By.cssSelector("#preOpenNiftyTab>tbody"));
		// locate all the rows inside the table body using tr tag
		List<WebElement> rows = tBody.findElements(By.tagName("tr"));
		// iterate over every row using for loop
		for (int i = 2; i < rows.size(); i++) {
			// locate cell in every row using td tag
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			if(cells.get(0).getText().equals(companyCode)) {
				System.out.println(String.format("share price of %s is %s", companyCode, cells.get(3).getText()));
				break;
			}
		}
		closeBrowser();
	}

}
