package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.SignUpPage;

public class LogInTest extends BaseTest {

	@Test
	public void logIn() throws InterruptedException {

		extentTest = extent.createTest("logIn");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		LoginPage loginPage = new LoginPage(driver);
		// add generator of email
		loginPage.getLogInEmailField().sendKeys("omen@gmail.com");
		loginPage.getLogInPasswordField().sendKeys("12345");
		Thread.sleep(3000);
		loginPage.getSignInButton().click();

		Thread.sleep(3000);
		SignUpPage signUpPageAfterLogin = new SignUpPage(loginPage.getDriver());

		Thread.sleep(3000);
		//System.out.println(signUpPageAfterLogin.getSignedInUserName());
		assertEquals(signUpPageAfterLogin.getSignedInUserName(), "roman katanov");

	}

}
