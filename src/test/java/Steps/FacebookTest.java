package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class FacebookTest extends BaseClass {

	@Given("user is on facebook home page")
	public void user_is_on_facebook_home_page() {
		initilization();
		getDriver().get("https://www.facebook.com/reg");
	}

	@Given("validate fb home page title")
	public void validate_fb_home_page_title() throws InterruptedException {
		String url = getDriver().getCurrentUrl();
		Assert.assertEquals(url.contains("facebook"), true);

		Thread.sleep(5000);

		getDriver().quit();
	}
}
