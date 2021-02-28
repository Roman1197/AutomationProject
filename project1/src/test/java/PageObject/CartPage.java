package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	WebDriver driver;
	@FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
	private WebElement toCheckoutBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getToCheckoutBtn() {
		return toCheckoutBtn;
	}

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
