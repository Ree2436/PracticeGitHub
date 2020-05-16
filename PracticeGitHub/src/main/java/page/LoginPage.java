package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Library of Elements
	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_FIELD;

	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD;

	@FindBy(how = How.NAME, using = "login")
	WebElement SUBMIT_FIELD;

	// Methods to Interact With The Element
	public void Login(String username, String password) {
		USERNAME_FIELD.sendKeys(username);
		PASSWORD_FIELD.sendKeys(password);
		SUBMIT_FIELD.click();

	}

	public String getPageTitle() {

		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

}
