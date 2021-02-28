package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	private WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),\\\"Sign in\\\")]")
	private WebElement signInButton;

	@FindBy(xpath = "//a[@title=\\\"Women\\\"]")
	private WebElement category_Woman;

	@FindBy(name = "search_query")
	private WebElement searchField;

	@FindBy(name = "submit_search")
	private WebElement searchBtn;

	@FindBy(xpath = "//a[@title=\"Add to cart\"]")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
	private WebElement toCheckoutBtn;

	public HomePage(WebDriver driver) {

		super(driver);

	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getToCheckoutBtn() {
		return toCheckoutBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getCategory_Woman() {
		return category_Woman;
	}

}
