package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class Amazon extends BaseClass{

	
	@Given("user is on Amazon home page")
	public void user_is_on_amazon_home_page() throws InterruptedException {
	     initilization();
	     getDriver().get("https://www.amazon.in");
	     Thread.sleep(5000);
	}
	
	@Given("validate Amazon home page title")
	public void validate_amazon_home_page_title() throws InterruptedException {
		String url = getDriver().getCurrentUrl();
		Assert.assertEquals(url.contains("amazon"), true);
		Thread.sleep(5000);
		getDriver().quit();
		
	}
}
