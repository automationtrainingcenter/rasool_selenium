package screenshots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilitiles.Browser;
import utilitiles.BrowserHelper;
/*
 * To take the Screenshot of current web page selenium provides 
 * TakeScreenshot Interface which contains getScreenshotAs() and this
 * interface in implemented by RemoteWebDriver class
 */
import utilitiles.ScreenshotHelper;

public class ScreenshotsDemo extends BrowserHelper{
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "http://www.amazon.in");
		sleep(2000);
//		//convert WebDriver object reference to TakeScreenshot Object reference
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File srcImg = ts.getScreenshotAs(OutputType.FILE);
//		File destImg = new File(getFilePath("screenshots", "image1.png"));
//		try {
//			BufferedImage bi = ImageIO.read(srcImg);
//			ImageIO.write(bi, "png", destImg);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenshotHelper.captureScreenshot(driver, "screenshots", "image");
		System.out.println("image saved");
		closeBrowser();
	}
}
