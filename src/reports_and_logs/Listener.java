package reports_and_logs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import utilitiles.JavaScriptHelper;

public class Listener implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("alert accepted");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("alert dismissed");
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		String text = JavaScriptHelper.getText(arg1, arg0);
		System.out.println("element value changed to "+text);
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("clicked on that element");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("element located succesfully");
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		
	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		System.out.println("the inner text of element is "+arg0);
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("navigated back to "+arg0.getCurrentUrl());
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("navigated forward to "+arg0.getCurrentUrl());
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		System.out.println("page is refreshed");
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("navigated to "+arg0);
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		System.out.println("window focus switched to the page with title as "+arg1.getTitle());
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		String alertText = arg0.switchTo().alert().getText();
		System.out.println("alert came with text as "+alertText);
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		String alertText = arg0.switchTo().alert().getText();
		System.out.println("alert came with text as "+alertText);
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("changing element value");
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("clicking on that element");
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("locating an elmenet using "+arg0);
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("navigating to "+arg0);
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		System.out.println("window focus swtiching from the page with title as "+arg1.getTitle());
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}
