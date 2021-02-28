package Tests;

import org.testng.annotations.Test;

import PageObject.HomePage;

public class SmokeTest extends BaseTest {
	@Test
	public void smokeTest() throws InterruptedException {
		extentTest = extent.createTest("smokeTest");
		driver.get("http://automationpractice.com/index.php");

		HomePage homePage = new HomePage(driver);
		homePage.getSearchField().clear();
		homePage.getSearchField().sendKeys("Faded Short Sleeve T-shirts");
		Thread.sleep(3000);
		homePage.getSearchBtn().click();
		homePage.getAddToCartBtn().click();

	}
}
