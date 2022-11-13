package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookFeature {
	WebDriver driver;

	   @Given("The Facebook website is launched")
	   public void the_Facebook_website_is_Launched() {
		// Write code here that turns the phrase above into concrete actions
				System.setProperty("webdriver.chrome.driver","C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				// webdriver is interface and chromedriver is class
				
				driver.get("https://www.facebook.com/");
	   }
	   
	   @When("The username is visible")
		public void username_is_visible() {
		    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.id("email")).isDisplayed();
		}
	   @Then("Enter text ssuser")
	   public void enter_text_ssuser() {
		   driver.findElement(By.id("email")).sendKeys("ssuser");
	   }
	   @Then("Enter password")
	   public void enter_password() {
		   driver.findElement(By.id("pass")).sendKeys("pswd1");
	   }
	   @Then("Click Log in")
	   public void click_login() {
		   driver.findElement(By.name("login")).click();
	   }
	

}
