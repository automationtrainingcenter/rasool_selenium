package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SSTS/rasool/selenium_concepts/frames/framesDemo.html");
		driver.manage().window().maximize();
		
		//now focus is in main page
		//switch the focus to frame 4
		//frame 4 is inner frame of frame 3 so first switch the focus to frame 3
		driver.switchTo().frame("fthree");
		//now focus is in frame 3
		//switch to inner frame of frame 3 i.e. frame 4
		driver.switchTo().frame(0);
		//now focus is in frame 4
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("python");
		Thread.sleep(2000);
		
		// now automate frame 3
		//now focus is in frame 4 i.e. inner frame of frame 3
		//switch to frame 3 from frame 4 using parentFrame()
		driver.switchTo().parentFrame();
		//focus is in frame 3
		driver.findElement(By.id("click")).click();
		Thread.sleep(2000);
		
		//now automate frame 2
		// now focus is in frame 3 so switch to main page using defaultContent()
		driver.switchTo().defaultContent();
		//now focus is in main page so switch the focus to frame2
		driver.switchTo().frame("ftwo");
		//focus is in frame 2
		driver.findElement(By.partialLinkText("selenium")).click();
		Thread.sleep(3000);
		
		//now automate frame 1
		//now focus is in frame 2 so switch to main page using defaultContent()
		driver.switchTo().defaultContent();
		//now focus is in main page so switch to frame 1
		driver.switchTo().frame("fone");
		//now focus is in frame 1
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("sunshine");
		Thread.sleep(2000);
		
		//now automate main page
		//now focus is in frame 1 so switch the focus to main page
		driver.switchTo().defaultContent();
		//now focus is in main page
		driver.findElement(By.id("opentTab")).click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
