package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[contains(text(),\\\"Sign in\\\")]")
	private WebElement signInButton;

	@FindBy(xpath = "//a[@title=\\\"Women\\\"]")
	private WebElement category_Woman;

	public HomePage(WebDriver driver) {

		super(driver);

	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getCategory_Woman() {
		return category_Woman;
	}

}
