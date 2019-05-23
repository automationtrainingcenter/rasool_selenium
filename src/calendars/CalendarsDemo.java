package calendars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
import utilitiles.CalendarHelper;

public class CalendarsDemo extends BrowserHelper{
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://www.expedia.com/");
		
		//locate deaprting date element and click on it
		driver.findElement(By.id("package-departing-hp-package")).click();
		sleep(2000);
//		boolean status = false;
		//locate table body
		WebElement tbody = driver.findElement(By.xpath("(//table[@class='datepicker-cal-weeks']/tbody)[1]"));
//		//locate rows inside the table body
//		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
//		//iterate over the rows
//		for(WebElement row : rows) {
//			//locate cells in every row
//			List<WebElement> cells = row.findElements(By.tagName("td"));
//			//iterate over the cells
//			for(WebElement cell : cells) {
//				//get the cell text and compare it will given date
//				if(cell.getText().endsWith("26")) {
//					cell.findElement(By.tagName("button")).click();
//					status = true;
//					break; // breaks the cells loop
//				}
//			}
//			//break the rows loop
//			if(status) {
//				break;
//			}
//		}
		CalendarHelper.selectDate(tbody, "30");
		sleep(3000);
		
		closeBrowser();
	}

}
