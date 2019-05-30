package reports_and_logs;
/*This class explains how to work with extent reports 2, here we are taking some dummy test cases
to explain the extent reports features.
Extent report mainly provides two classes to generate the reports
1. ExtentReports -- which will create the report with a given name and location and
   starts and ends tests
2. ExtentTest -- which will used to log some info to the report
*/

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilitiles.BrowserHelper;

public class ExtentReportsDemo extends BrowserHelper {
	static ExtentReports report;

	// test1
	public static void test1() {
		/*
		 * To start a test, create an object of ExtentTest class by calling
		 * startTest("test case name", "description") method of ExtentReports class
		 * object
		 */
		ExtentTest test = report.startTest("test1");
		// selenium code
		//To create information logs and status logs use LogStatus Enum
		test.log(LogStatus.INFO, "launch browser");
		test.log(LogStatus.INFO, "navigate to url");
		test.log(LogStatus.INFO, "maximize the browser window");
		test.log(LogStatus.PASS, "test1 passed");
		report.endTest(test);

	}

	// test 2
	public static void test2() {
		ExtentTest test = report.startTest("test2");
		// selenium code
		test.log(LogStatus.INFO, "locate username and fill it with Admin");
		test.log(LogStatus.INFO, "locate password and fill it with Admin");
		test.log(LogStatus.INFO, "locate login button and click on it");
		test.log(LogStatus.FAIL, "test2 failed");
		/*Add a screenshot to the report by calling addScreenshot("path of the image file")
        of ExtentTest class object
       */
		test.log(LogStatus.INFO, "screenshot added"+test.addScreenCapture(getFilePath("screenshots", "alertImage.png")));
		report.endTest(test);
	}

	// test3
	public static void test3() {
		ExtentTest test = report.startTest("test3");
		// selenium code
		test.log(LogStatus.INFO, "locate logout button and click on it");
		test.log(LogStatus.PASS, "test3 passed");
		report.endTest(test);
	}

	public static void main(String[] args) {
		/* Create ExtentReports class object by providing an html file path */
		report = new ExtentReports(getFilePath("reports", "report.html"));
		test1();
		test2();
		test3();
		/*
		 * To write all the logs to the report, simply call the flush() method of
		 * ExtentReports class object
		 */
		report.flush();
	}

}
