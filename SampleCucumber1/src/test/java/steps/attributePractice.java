package steps;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class attributePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("Selenium");
		WebDriver driver = new FirefoxDriver(myProfile);
		
		driver.quit();
		/*driver.navigate().to("http://www.facebook.com");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_1")).getAttribute("value");
		*/
	}

}
