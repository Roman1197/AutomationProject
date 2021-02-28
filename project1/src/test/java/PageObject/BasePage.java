package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);

	}

	// Click Method
	public void click(WebElement element) {

		element.click();
	}

	// Write Text
	public void writeText(WebElement element, String text) {

		element.sendKeys(text);
	}

	// Read Text
	public String readText(WebElement element) {

		return element.getText();
	}

}
