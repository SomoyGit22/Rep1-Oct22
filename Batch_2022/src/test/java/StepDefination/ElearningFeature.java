package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElearningFeature {
	WebDriver driver;
	
	@Given("The elearningupskills website is Launched")
	public void elearning_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
					System.setProperty("webdriver.chrome.driver","C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver=new ChromeDriver();
					// webdriver is interface and chromedriver is class
					
					driver.get("http://elearningm1.upskills.in/");
	}
	
	@When("click on Sign up")
	public void click_on_Sign_up() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"login_block\"]/div/ul/li/a")).click();
	}
	
	@When("fill up the required fields and click on Register")
	public void fill_up_the_required_fields_and_click_on_register() {
		driver.findElement(By.name("firstname")).sendKeys("Superstar");
		driver.findElement(By.name("lastname")).sendKeys("Singer");
		driver.findElement(By.name("email")).sendKeys("lol5678@mail.com");
		driver.findElement(By.name("username")).sendKeys("user_momo13");
		driver.findElement(By.name("pass1")).sendKeys("Pass_bourbon22");
		driver.findElement(By.name("pass2")).sendKeys("Pass_bourbon22");
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("After successsful registeration , verify that the next button is visible")
	public void after_successful_registration_verify_that_the_next_button_is_visible() {
		driver.findElement(By.name("next")).isDisplayed();
		
	}
	
	@Then("Click on Next")
	public void click_on_next() {
		driver.findElement(By.name("next")).click();
	}
	
	@Then("Click on name dropdwon")
	public void click_on_name_dropdown() {
		driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/a")).click();
	}
	
	@Then("Click on Profile")
	public void click_on_profile() {
		driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/ul/li/a[1]")).click();
	}
	
	@Then("CLick on messages")
	public void click_on_messages() {
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[2]/a")).click();
	}
	
	@Then("Click on Compose message")
	public void click_on_compose_message() {
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/div[1]/a[1]/img")).click();
	}
	
	@Then("Fill up the fields  subject , message")
	public void fill_up_the_fields_subject_and_message() {
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[2]/div[1]/input")).sendKeys("guelhflknbjd");
		driver.findElement(By.xpath("/html/body/p")).sendKeys("ljrwbjandlkachj");
	}
	
	@Then("Click on send message")
	public void click_on_send_message() {
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[6]/div[1]/button")).click();
	}
	

}

