package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class GoogleTest extends BaseClass{

	
	@Given("user is on google home page")
	public void user_is_on_google_home_page() throws InterruptedException {
		initilization();
		getDriver().get("https://www.google.com");
		Thread.sleep(5000);
	}

	@Given("validate home page title")
	public void validate_home_page_title() throws InterruptedException {
		String actualTitle = getDriver().getTitle();
		Assert.assertEquals(actualTitle, "Google");
		
		Thread.sleep(5000);
		
		getDriver().quit();
	}

	
}
