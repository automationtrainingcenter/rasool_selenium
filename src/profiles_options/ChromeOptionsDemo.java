package profiles_options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {
	/*
	 * chrome extensions are available in below folder in windows os
	 * C:\Users\%USERNAME%\AppData\Local\Google\Chrome\User Data\Default\Extensions
	 * 
	 * Choose the extension and get the complete path with the version.
	 * Copy the path and paste it into Chrome Pack Extension window to get the .crx extension file
	 * Create a File class object with .crx file path
	 * Use this File class objects in ChromeOptions class addExtensions method
	 */
	public static void main(String[] args) {
		File chroPath = new File("C:\\Users\\SuryaPrakash\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljngjbnaijcbncmcnjfhigebomdlkcjo\\5.0.3_0.crx");
		File katalon = new File("C:\\Users\\SuryaPrakash\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljdobmomdgdljniojadhoplhkpialdid\\3.7.0_0.crx");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(chroPath, katalon);
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

	}

}
