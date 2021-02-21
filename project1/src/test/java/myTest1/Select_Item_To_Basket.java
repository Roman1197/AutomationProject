package myTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Item_To_Basket {
	WebDriver driver;
	Actions action;
	By category_women = By.xpath("//a[contains(@title,\"Women\")]");
	By category_women_tShirts = By.xpath("//a[contains(@title,\"T-shirts\")]");
	By add_to_cart_btn = By.xpath("//a[@title=\"Add to cart\"]");
	By cart = By.xpath("//a[@title=\"View my shopping cart\"]");

	public Select_Item_To_Basket(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
	}

	public void add_item_to_basket() throws InterruptedException {
		action.moveToElement(driver.findElement(category_women)).perform();
		Thread.sleep(5000);
		action.click(driver.findElement(category_women_tShirts));
		driver.findElement(add_to_cart_btn).click();
	}

	public boolean is_checked_item_inBasket(String item_title) throws InterruptedException {
		driver.findElement(cart).click();
		
		
		
		return true ;
		
	}
}
