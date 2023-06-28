package stepdefinition;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.*;

public class LoginScenario {
	
	static WebDriver driver;

	@Given("User has entered sauce labs URL")
	public void user_has_entered_sauce_labs_url() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
		driver = new ChromeDriver(option);
		
	}

	@When("User hits enter to load URL")
	public void user_hits_enter_to_load_url() {
	  driver.get("https://www.saucedemo.com/");
	}

	@Then("User lands on Sign In page of SL")
	public void user_lands_on_sign_in_page_of_sl() throws Exception {
	   String headerOfLoginPage= driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
	   
	   if(headerOfLoginPage.equals("Swag Labs")) {
		   System.out.println("User landed on Login Page");
	   }else {
		   throw new Exception("Wrong Page");
	   }
	   
	   
	}
	@When("I enter UN as {string}")
	public void i_enter_un_as(String UN) {
	    driver.findElement(By.id("user-name")).sendKeys(UN);
	}

	@When("I enter PW as {string}")
	public void i_enter_pw_as(String PW) {
		driver.findElement(By.id("password")).sendKeys(PW);
	}

	@Then("I logged in to sauce labs")
	public void i_logged_in_to_sauce_labs() throws InterruptedException {
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
}
