package newStepsDefinations;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class tryFirstDefination{
	
	@Given("^the user is on login page of facebook$")
	public void the_user_is_on_login_page_of_facebook() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is new one");
	WebDriver driver = new FirefoxDriver();
	driver.quit();
	driver.manage();
	 
	}

	@When("^the user choose to login$")
	public void the_user_choose_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is new one");
	}

	@When("^he provides user id as (\\d+)$")
	public void he_provides_user_id_as(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is new one");
	}

	@When("^he provides password as Fume@(\\d+)nana$")
	public void he_provides_password_as_Fume_nana(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is new one");
		
	}

	@When("^he click on submit button$")
	public void he_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is new one");
	}

	@Then("^Successfully login$")
	public void successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is new one");
	}



}
