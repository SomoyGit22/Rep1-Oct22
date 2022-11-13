package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline {
	WebDriver driver;

	   @Given("The Facebook website is brought up")
	   public void facebook_is_Launched() {
		// Write code here that turns the phrase above into concrete actions
				System.setProperty("webdriver.chrome.driver","C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				// webdriver is interface and chromedriver is class
				
				driver.get("https://www.facebook.com/");
	   }
	   @When("The username textbox is visible")
		public void username_textbox_is_visible() {
		    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.id("email")).isDisplayed();
		}

	   @When("The password textbox is visible")
		public void password_textbox_is_visible() {
		    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.id("pass")).isDisplayed();
		}
	   @Then("Enter Username as \"<username>\" and Enter Password as \"<password>\"")
	   public void enter_username_and_password(String arg1,String arg2) {
		   driver.findElement(By.id("email")).sendKeys(arg1);
		   driver.findElement(By.id("pass")).sendKeys(arg2);
	   }
	  
	   @Then("Click on Log in")
	   public void click_on_login() {
		   driver.findElement(By.name("login")).click();
	   }
	   

}
