package sikuli;

import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo2 {
	
	public static void main(String[] args) {
		//create Screen class object
		Screen screen = new Screen();
		
		Pattern ffBrowser = new Pattern(".\\images\\ffbrowser.PNG");
		Pattern addressBar = new Pattern(".\\images\\addressBar.PNG");
		Pattern choosefile = new Pattern(".\\images\\choosefile.PNG");
		Pattern fileName = new Pattern(".\\images\\fileName.PNG");
		Pattern openButton = new Pattern(".\\images\\open.PNG");
		Pattern closeButton = new Pattern(".\\images\\close.PNG");
		
		try {
			screen.find(ffBrowser);
			screen.click(ffBrowser);
			Thread.sleep(2000);
			screen.find(addressBar);
			screen.type(addressBar, "https://smallpdf.com/pdf-to-word"+Key.ENTER);
			Thread.sleep(2000);
			screen.find(choosefile);
			screen.click(choosefile);
			Thread.sleep(2000);
			screen.find(fileName);
			screen.type(fileName, "D:\\selenium\\Notes\\Xpath.docx");
			Thread.sleep(2000);
			screen.find(openButton);
			screen.click(openButton);
			Thread.sleep(4000);
			screen.find(closeButton);
			screen.click(closeButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
