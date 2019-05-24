package screenshots;

import org.openqa.selenium.By;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
import utilitiles.ScreenshotHelper;

public class AlertScreenshot extends BrowserHelper{
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://learn.letskodeit.com/p/practice");
		//locate alert button and click on it
		driver.findElement(By.id("alertbtn")).click();
		sleep(2000);
//		try {
//			//get the screen size using ToolKit class
//			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//			//create a Rectangle class object which accepts Dimension class object
//			Rectangle rect = new Rectangle(screenSize);
//			//create a Robot class object
//			Robot r = new Robot();
//			//capture the screenshot using Rectangle class object
//			BufferedImage bi = r.createScreenCapture(rect);
//			//provide destination location of the image
//			File destLoc = new File(getFilePath("screenshots", "alertImage.png"));
//			// save the file to the destination location using ImageIO class
//			ImageIO.write(bi, "png", destLoc);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		ScreenshotHelper.captureAlertScreenshot("screenshots", "alertImage");
		driver.switchTo().alert().accept();
		closeBrowser();
		
	}

}
