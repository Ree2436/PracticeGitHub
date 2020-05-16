package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DellDashboardPage {
	
	WebDriver driver;
	
	public void dashboardPageForDell() {
		
		this.driver = driver;
		
		
	}
		
		@FindBy(how = How.XPATH, using = "//button[@id='l4']")
		WebElement SUPPORT_MODULE;
		
		@FindBy(how = How.XPATH, using = "//a[text() =  'Contact Us']")
		WebElement CONTACT_US;
	
        @FindBy(how = How.ID, using = "l3")
        WebElement SERVICES_MODULE;
        
        public void moveToSupportModule() {
        	Actions action = new Actions(driver);
        	action.moveToElement(driver.findElement(By.xpath("//button[@id='l4']"))).build().perform();
        }
        
        public void clickOnContactUs() {
        	CONTACT_US.click();
        }
}
