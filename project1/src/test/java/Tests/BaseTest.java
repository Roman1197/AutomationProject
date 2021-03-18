package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {

	public ExtentTest extentTest;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;

	public String dataGenerator() {
		return "";
	}

	public static WebDriver driver;

	@AfterClass
	public void afterClass() {
		extent.flush();
		// driver.quit();

	}

	@AfterMethod
	public void AfterMethod(ITestResult result) throws IOException {

		String methodName = result.getMethod().getMethodName();
		if (result.getStatus() == ITestResult.FAILURE) {

			String exeptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			extentTest.fail("<details><summary><b><font color=red>Exception Occured, click to see details:"
					+ "</font></b></summary>" + exeptionMessage.replaceAll(",", "<br>") + "</details> \n");

			String path = takeScreenshot(result.getMethod().getMethodName());
			try {
				extentTest.fail("<b><font color=red>" + "Screenshot of failure" + "</font></b>",
						MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (IOException e) { // TODO Auto-generated catch block
				extentTest.fail("Test failed, cannot attach screenshoot");

			}
			String logText = "<b>Test Method " + methodName + " Failed</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);

			extentTest.log(Status.FAIL, m);
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			String logText = "<b>Test Method " + methodName + " Succesfull</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);

			extentTest.log(Status.PASS, m);

		} else if (result.getStatus() == ITestResult.SKIP) {
			String logText = "<b>Test Method " + methodName + " Skipped</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);

			extentTest.log(Status.SKIP, m);

		}
	}

	public static String takeScreenshot(String methodName) throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		LocalDateTime now = LocalDateTime.now(); //
		System.out.println(dtf.format(now));
		String pathName = "C:\\Users\\angel\\Desktop\\screensLandwer\\";
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File DestFile = new File(pathName + dtf.format(now) + ".png");
		FileUtils.copyFile(SrcFile, DestFile);

		return DestFile.getPath();
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().browserVersion("87.0.4280.141").setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().browserVersion("86.0.1").setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().browserVersion("89.0.774.48").setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();

		// reports configurations setting
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		htmlReporter = new ExtentHtmlReporter(
				"C:\\Users\\angel\\Desktop\\screensLandwer\\" + dtf.format(now) + ".html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Reports");
		htmlReporter.config().setReportName("Automation Test Result");
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.setSystemInfo("Org", "Final Project");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);

	}

}
