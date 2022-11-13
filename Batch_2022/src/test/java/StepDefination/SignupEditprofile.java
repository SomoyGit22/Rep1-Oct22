package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupEditprofile {
WebDriver driver;
	
	@Given("The elearningupskills website is opened")
	public void elearning_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
					System.setProperty("webdriver.chrome.driver","C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver=new ChromeDriver();
					// webdriver is interface and chromedriver is class
					
					driver.get("http://elearningm1.upskills.in/");
	}
	
	@When("click on Sign up button")
	public void click_on_Sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"login_block\"]/div/ul/li/a")).click();
	}
	
	@When("fill up required fields and click on Register button")
	public void fill_up_the_required_fields_and_click_on_register() {
		driver.findElement(By.name("firstname")).sendKeys("My");
		driver.findElement(By.name("lastname")).sendKeys("Name");
		driver.findElement(By.name("email")).sendKeys("Nov22@mail.com");
		driver.findElement(By.name("username")).sendKeys("t20wc");
		driver.findElement(By.name("pass1")).sendKeys("Aus&Nz22");
		driver.findElement(By.name("pass2")).sendKeys("Aus&Nz22");
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("After successsful registeration is done, verify that the next button is visible")
	public void after_successful_registration_is_done_verify_that_the_next_button_is_visible() {
		driver.findElement(By.name("next")).isDisplayed();
		
	}
	
	@Then("Click on Next button")
	public void click_on_next() {
		driver.findElement(By.name("next")).click();
	}
	
	@Then("Click on your name dropdwon")
	public void click_on_your_name_dropdown() {
		driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/a")).click();
	}
	
	@Then("Click on Profile option")
	public void click_on_profile_option() {
		driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/ul/li/a[1]")).click();
	}
	
	@Then("Click on Edit profile")
	public void click_on_Edit_profile() {
		driver.findElement(By.xpath("//*[@id=\"sn-avatar-one\"]/div/ul/li[4]/a")).click();
	}
	
	@Then("Enter first name, last name, phone")
	public void enter_first_name_last_name_phone() {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Tomato");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Onion");
		driver.findElement(By.name("phone")).sendKeys("03326627788");
	}
	
	@Then("Click on Save settings")
	public void click_on_Save_settings() {
		driver.findElement(By.name("apply_change")).click();
	}

}
