package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class WebTableDemo extends BrowserHelper{
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://learn.letskodeit.com/p/practice");
		//locate table body
		WebElement tBody = driver.findElement(By.cssSelector("#product>tbody"));
		//locate all the rows inside the table body using tr tag
		List<WebElement> rows = tBody.findElements(By.tagName("tr"));
//		//iterate over every row using for each loop
//		for(WebElement row : rows) {
//			//locate cells in every row using td tag
//			List<WebElement> cells = row.findElements(By.tagName("td"));
//			//iterate over every cell
//			for(WebElement cell : cells) {
//				//automate that cell
//				System.out.print(cell.getText()+"\t");
//			}
//			System.out.println();
//		}
		//iterate over every row using for loop
		for(int i = 1; i < rows.size(); i++) {
			//locate cell in every row using td tag
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			//iterate over the cells
			for(int j = 0; j < cells.size(); j++) {
				//automate that cell
				System.out.print(cells.get(j).getText()+"\t");
			}
			System.out.println();
		}
		closeBrowser();
	}
}
