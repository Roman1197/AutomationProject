package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public String dataGenerator() {
		return "";
	}

	public static WebDriver driver;

	@AfterClass
	public void afterClass() {

		driver.quit();

	}

	@AfterMethod
	public void AfterMethod(ITestResult result) throws IOException {
		/*
		 * String methodName = result.getMethod().getMethodName(); if
		 * (result.getStatus() == ITestResult.FAILURE) {
		 * 
		 * String exeptionMessage =
		 * Arrays.toString(result.getThrowable().getStackTrace()); extentTest.
		 * fail("<details><summary><b><font color=red>Exception Occured, click to see details:"
		 * + "</font></b></summary>" + exeptionMessage.replaceAll(",", "<br>") +
		 * "</details> \n");
		 * 
		 * String path = takeScreenshot(result.getMethod().getMethodName()); try {
		 * extentTest.fail("<b><font color=red>" + "Screenshot of failure" +
		 * "</font></b>", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * extentTest.fail("Test failed, cannot attach screenshoot");
		 * 
		 * } String logText = "<b>Test Method " + methodName + " Failed</b>";
		 * 
		 * Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		 * 
		 * extentTest.log(Status.FAIL, m); } else if (result.getStatus() ==
		 * ITestResult.SUCCESS) { String logText = "<b>Test Method " + methodName +
		 * " Succesfull</b>";
		 * 
		 * Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		 * 
		 * extentTest.log(Status.PASS, m);
		 * 
		 * } else if (result.getStatus() == ITestResult.SKIP) { String logText =
		 * "<b>Test Method " + methodName + " Skipped</b>";
		 * 
		 * Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		 * 
		 * extentTest.log(Status.SKIP, m);
		 */
	}

	/*
	 * public static String takeScreenshot(String methodName) throws IOException {
	 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
	 * LocalDateTime now = LocalDateTime.now(); //
	 * System.out.println(dtf.format(now)); String pathName =
	 * "C:\\Users\\angel\\Desktop\\screensLandwer\\"; TakesScreenshot scrShot =
	 * ((TakesScreenshot) driver); File SrcFile =
	 * scrShot.getScreenshotAs(OutputType.FILE); File DestFile = new File(pathName +
	 * dtf.format(now) + ".png"); FileUtils.copyFile(SrcFile, DestFile);
	 * 
	 * return DestFile.getPath(); }
	 */
	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().browserVersion("87.0.4280.141").setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// reports configurations setting
		/*
		 * htmlReporter = new
		 * ExtentHtmlReporter("C:\\Users\\angel\\Desktop\\screensLandwer\\extent.html");
		 * htmlReporter.config().setEncoding("utf-8");
		 * htmlReporter.config().setDocumentTitle("Automation Reports");
		 * htmlReporter.config().setReportName("Automation Test Result");
		 * htmlReporter.config().setTheme(Theme.STANDARD); extent = new ExtentReports();
		 * extent.setSystemInfo("Org", "Final Project"); extent.setSystemInfo("Browser",
		 * "Chrome"); extent.attachReporter(htmlReporter);
		 */
		// PageFactory.initElements(driver, this);
	}

}
