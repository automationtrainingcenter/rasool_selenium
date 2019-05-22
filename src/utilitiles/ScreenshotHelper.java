package utilitiles;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {
	
	private static String getFilePath(String folderName, String fileName) {
		return System.getProperty("user.dir")+File.separator+folderName+File.separator+fileName;
	}
	
	private static String getTimeStamp() {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("HH_mm_ss-dd_MMM_yy");
		return df.format(date);
	}


	public static void captureScreenshot(WebDriver driver, String folderName, String fileName) {
		//convert WebDriver object reference to TakeScreenshot object reference
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destImg = new File(getFilePath(folderName, fileName+getTimeStamp()+".png"));
		try {
			BufferedImage bi = ImageIO.read(src);
			ImageIO.write(bi, "png", destImg);
		} catch (Exception e) {
			System.out.println("image not avaible");
		}
	}
	
//	public static void main(String[] args) {
//		System.out.println(getTimeStamp());
//	}
}
