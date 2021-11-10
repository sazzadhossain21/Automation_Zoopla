package com.stepdef;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.*;


public class Stepdefzoopla  {
	WebDriver driver;

	@Given("Users can open any browser")
	public void users_can_open_any_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Users able to enter url as {string}")
	public void users_able_to_enter_url_as(String url) {
		driver.get(url);

	}

	@When("Users able to click Sign In button")
	public void users_able_to_click_sign_in_button() {
		WebElement signinbtn = driver.findElement(By.xpath("(//*[text()='Sign in'])[2]"));
		signinbtn.click();
	}

	@When("Users enter valid username as {string} and password as {string}")
	public void users_enter_valid_username_as_and_password_as(String username, String password) {
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys(username);
		WebElement pwd = driver.findElement(By.id("input-password"));
		
		pwd.sendKeys(password);
	}

	@When("Users click the Sign In button")
	public void users_click_the_sign_in_button() throws Exception {
		WebElement lstsigninbtn = driver.findElement(By.xpath("//*[@data-testid='signin-button']"));
		lstsigninbtn.click();
		Thread.sleep(4000);
	}

	@Then("Users can verify Sign In page")
	public void users_can_verify_sign_in_page() throws InterruptedException {

		String title="MyZoopla - Zoopla";
		Assert.assertEquals(driver.getTitle(),title);
		System.out.println(driver.getTitle());
		
	}

	@Then("Users can close the browser")
	public void users_can_close_the_browser(){
		driver.quit();

	}
}