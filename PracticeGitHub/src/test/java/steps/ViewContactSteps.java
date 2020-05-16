package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DellDashboardPage;
import util.BrowserFactory;

public class ViewContactSteps {
	
	WebDriver driver;
	
	@Given("^a user$")
	public void a_user() throws Throwable {
		
	}

	@When("^user goes to dell website$")
	public void user_goes_to_dell_website() throws InterruptedException {
        driver = BrowserFactory.startBrowser();
        
	}

	@When("^navigates to support$")
	public void navigates_to_support() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='l4']")));
		Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//button[@id='l4']"))).build().perform();
	}

	@When("^enters contact us page$")
	public void enters_contact_us_page() {
		DellDashboardPage delldashboardpage = PageFactory.initElements(driver, DellDashboardPage.class);
		delldashboardpage.clickOnContactUs();
	}

	@Then("^contact information page should display$")
	public void contact_information_page_should_display() {
	   String expectedTitle = "Contact Information | Dell US";
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals("No Match", expectedTitle, actualTitle);
	}


}
