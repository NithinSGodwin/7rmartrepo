package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pswd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement button;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement searchElement;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alert;

	public void enterUsername(String UserName) {

		username.sendKeys(UserName);
	}

	public void enterPassword(String Password) {
		pswd.sendKeys(Password);
	}

	public void signin() {
		button.click();
	}

	public boolean isHomePageloaded() {
		return searchElement.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}


