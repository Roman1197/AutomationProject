package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(id = "email")
	private WebElement logInEmailField;

	@FindBy(id = "passwd")
	private WebElement logInPasswordField;

	@FindBy(xpath = "//a[@title=\"Recover your forgotten password\"]")
	private WebElement forgotPasswordLink;

	@FindBy(id = "SubmitLogin")
	private WebElement signInButton;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public WebElement getLogInEmailField() {
		return logInEmailField;
	}

	public WebElement getLogInPasswordField() {
		return logInPasswordField;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

}
