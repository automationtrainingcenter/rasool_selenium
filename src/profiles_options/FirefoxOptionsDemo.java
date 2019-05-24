package profiles_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxOptionsDemo {

	public static void main(String[] args) {
		/*
		 * Profile is a File where Firefox saves your personal information such as bookmarks, 
		 * passwords, and user preferences. 
		 * Multiple Firefox profiles can exist, each containing a separate set of preferences.
		 * When starting Firefox in Selenium WebDriver, it starts new "anonymous" profile.
		 * 
		 * to open profiles in firefox browser type about:profiles
		 * create the profiles with extensions and preferences you want
		 * and launch firefox browser using this profile as bellow
	
		 */
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("automation");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
	}

}
