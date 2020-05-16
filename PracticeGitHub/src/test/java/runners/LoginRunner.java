package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Users\\fazee\\Selenium\\techfiosBDDDIY\\src\\test\\java\\features\\contact.feature", glue = {
 "steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )
public class LoginRunner {

}
