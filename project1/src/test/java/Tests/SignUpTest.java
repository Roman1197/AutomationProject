package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import PageObject.SignUpPage;

public class SignUpTest extends BaseTest {
	@Test
	public void signUpTestPositive() throws InterruptedException {

		extentTest = extent.createTest("signUpTestPositive");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		SignUpPage signUpPage = new SignUpPage(driver);
		// add generator of email

		signUpPage.getEmail_createAcc().sendKeys("omen@gmail.com");
		Thread.sleep(3000);
		signUpPage.getCreateAccount_btn().click();

		signUpPage.getRadio_Button_Gender1().click();

		signUpPage.getFirst_Name_Field().sendKeys("roman");

		signUpPage.getLast_Name_Field().sendKeys("katanov");

		signUpPage.getPassword_Field().sendKeys("123456");

		// signUpPage.getBirth_date_day();

		// signUpPage.getBirth_date_month();

		// signUpPage.getBirth_date_year();

		signUpPage.getNewsletter_CheckBox().click();

		signUpPage.getSpecial_Offers_CheckBox().click();

		signUpPage.getAddress_First_Name_Field().sendKeys("roman");

		signUpPage.getAddress_Last_Name_Field().sendKeys("katanov");

		signUpPage.getAddress_Company_Field().sendKeys("Company");

		signUpPage.getAddress1_Field().sendKeys("steing yehuda ");

		signUpPage.getAddress2_Field().sendKeys("rammllla");

		signUpPage.getCity_Field().sendKeys("ramal");

		// signUpPage.getState_list(2);

		signUpPage.getZipCode_Field().sendKeys("12345");

		signUpPage.getAdditional_Info_Field().sendKeys("send something");

		signUpPage.getHome_Phone_Field().sendKeys("13456567");

		signUpPage.getMobile_Phone_Field().sendKeys("1234566");

		signUpPage.getAlias_Field().sendKeys("123");

		signUpPage.getRegister_btn().click();

		System.out.println(signUpPage.getSignedInUserName());
		assertEquals(signUpPage.getSignedInUserName(), "roman katanov");

	}
}
