package Tests;

import org.testng.annotations.Test;

import PageObject.LoginPage;


public class LogInTest extends BaseTest {
	
	@Test
	public void logIn() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		LoginPage loginPage=new LoginPage(driver);
		// add generator of email
		loginPage.getLogInEmailField().sendKeys("omen@gamil.com");	
		loginPage.getLogInPasswordField().sendKeys("12345");
		Thread.sleep(3000);
		loginPage.getSignInButton().click();
		Thread.sleep(3000);
	}

}
