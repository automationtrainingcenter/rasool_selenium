package sikuli;

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class FileUploadDemo extends BrowserHelper{
	/*Sikuli is a tool to automate GUI using visual image macth. In sikuli all web elements should be
	* taken as images and store in project folder.
	* Download and install sikuliX from http://sikulix.com.
	* Associate sikulixapi.jar file to project build path.
	* Capture images of elements using any snipping tool which we want to automate and store in project folder.
	*
	* Sikuli mainly provides two classes
	* Screen -- is the main class which will perform all the operations like type, find, click, wait and so on.
	* Pattern -- is used to store the image paths of elements we want to automate.
	*/
	
	public static void main(String[] args) {
		openBrowser(Browser.CHROME, "https://smallpdf.com/word-to-pdf");
		//locate choose file button and click on it
		driver.findElement(By.xpath("//div[text()='Choose file']")).click();
		sleep(2000);
		//create Pattern class objects with the path of images we captured to automate
		Pattern fileName = new Pattern(getFilePath("images", "fileName.png"));
		Pattern openButton	= new Pattern(getFilePath("images", "open.PNG"));
		
		//create Screen class object
		Screen screen = new Screen();
		try {
			screen.find(fileName);
			screen.type(fileName, "D:\\selenium\\Notes\\Xpaths.docx");
			sleep(2000);
			screen.find(openButton);
			screen.click(openButton);
			sleep(4000);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeBrowser();
		
		
	}

}
