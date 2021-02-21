package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

	private WebDriver driver;
	@FindBy(id = "email_create")
	private WebElement email_createAcc;

	@FindBy(id = "SubmitCreate")
	private WebElement createAccount_btn;

	@FindBy(id = "id_gender1")
	private WebElement radio_Button_Gender1;
	@FindBy(id = "id_gender2")
	private WebElement radio_Button_Gender2;

	@FindBy(name = "customer_firstname")
	private WebElement first_Name_Field;

	@FindBy(name = "customer_lastname")
	private WebElement last_Name_Field;

	@FindBy(name = "email")
	private WebElement email_Address_Field;

	@FindBy(name = "passwd")
	private WebElement password_Field;

	@FindBy(name = "newsletter")
	private WebElement newsletter_CheckBox;

	@FindBy(name = "optin")
	private WebElement special_Offers_CheckBox;
	// date list/////////////

	@FindBy(name = "years")
	private WebElement birth_date_year;

	@FindBy(id = "months")
	private WebElement birth_date_month;

	@FindBy(id = "days")
	private WebElement birth_date_day;

	@FindBy(name = "firstname")
	private WebElement address_First_Name_Field;

	@FindBy(name = "lastname")
	private WebElement address_Last_Name_Field;

	@FindBy(id = "company")
	private WebElement address_Company_Field;

	@FindBy(name = "address1")
	private WebElement address1_Field;

	@FindBy(name = "address2")
	private WebElement address2_Field;

	@FindBy(name = "city")
	private WebElement city_Field;

	@FindBy(id = "id_state")
	private WebElement state_list;
	//// state list///

	@FindBy(name = "postcode")
	private WebElement zipCode_Field;
	/// Country//

	@FindBy(name = "other")
	private WebElement additional_Info_Field;

	@FindBy(name = "phone")
	private WebElement home_Phone_Field;

	@FindBy(name = "phone_mobile")
	private WebElement mobile_Phone_Field;

	@FindBy(name = "alias")
	private WebElement alias_Field;

	@FindBy(name = "submitAccount")
	private WebElement register_btn;

	@FindBy(xpath = "//a[@title=\"View my customer account\"]")
	private WebElement signedInUserName;

	public SignUpPage(WebDriver driver) {

		super(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail_createAcc() {
		return email_createAcc;
	}

	public WebElement getCreateAccount_btn() {
		return createAccount_btn;
	}

	public WebElement getRadio_Button_Gender1() {
		return radio_Button_Gender1;
	}

	public WebElement getRadio_Button_Gender2() {
		return radio_Button_Gender2;
	}

	public WebElement getFirst_Name_Field() {
		return first_Name_Field;
	}

	public WebElement getLast_Name_Field() {
		return last_Name_Field;
	}

	public WebElement getEmail_Address_Field() {
		return email_Address_Field;
	}

	public WebElement getPassword_Field() {
		return password_Field;
	}

	public WebElement getNewsletter_CheckBox() {
		return newsletter_CheckBox;
	}

	public WebElement getSpecial_Offers_CheckBox() {
		return special_Offers_CheckBox;
	}

	public WebElement getBirth_date_year() {
		return birth_date_year;
	}

	public WebElement getBirth_date_month() {
		return birth_date_month;
	}

	public WebElement getBirth_date_day() {
		return birth_date_day;
	}

	public WebElement getAddress_First_Name_Field() {
		return address_First_Name_Field;
	}

	public WebElement getAddress_Last_Name_Field() {
		return address_Last_Name_Field;
	}

	public WebElement getAddress_Company_Field() {
		return address_Company_Field;
	}

	public WebElement getAddress1_Field() {
		return address1_Field;
	}

	public WebElement getSignedInUserName() {
		return signedInUserName;
	}

	public WebElement getAddress2_Field() {
		return address2_Field;
	}

	public WebElement getCity_Field() {
		return city_Field;
	}

	public WebElement getState_list() {
		return state_list;
	}

	public WebElement getZipCode_Field() {
		return zipCode_Field;
	}

	public WebElement getAdditional_Info_Field() {
		return additional_Info_Field;
	}

	public WebElement getHome_Phone_Field() {
		return home_Phone_Field;
	}

	public WebElement getMobile_Phone_Field() {
		return mobile_Phone_Field;
	}

	public WebElement getAlias_Field() {
		return alias_Field;
	}

	public WebElement getRegister_btn() {
		return register_btn;
	}

}
