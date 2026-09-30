package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(css = "[data-qa='login-email']")
	WebElement emailField;
	@FindBy(css = "[data-qa='login-password']")
	WebElement passwordField;
	@FindBy(css = "[data-qa='login-button']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emailAddress) {
		emailField.sendKeys(emailAddress);
	}
	
	public void enterPassword(String passwordValue) {
		passwordField.sendKeys(passwordValue);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void loginApplication(String emailAddress, String passwordValue) {
		enterEmail(emailAddress);
		enterPassword(passwordValue);
		clickLogin();
	}
	
	
}
