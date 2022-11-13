package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculateBMI {
	WebDriver driver;
	@When("Launch website https://www.calculator.net")
	public void launch_bmi_calculator_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.calculator.net/");
	}
	
	@Then("Validate title of the current page")
	public void validate_title_of_current_page() {
		String actual_page_title= driver.getTitle();
		String expected_page_title="Calorie Calculator";
		if(expected_page_title==actual_page_title)
			System.out.println("Expected Page Title :"+expected_page_title);
		else
			System.out.println("Actual Page Title : "+actual_page_title);
	}
	
	@Given("Open website https://www.calculator.net")
	public void open_bmi_calculator_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.calculator.net/");
	}
	
	@When("Click on BMI Calculator")
	public void click_on_BMI_calculator() {
		driver.findElement(By.xpath("//*[@id=\"hl2\"]/li[1]/a")).click();
	}
	
	@When("Enter age as {string}")
	public void enter_age(String age) {
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys(age);	
	}
	
	@When("Enter height as {string}")
	public void enter_height(String height) {
		driver.findElement(By.id("cheightmeter")).clear();
		driver.findElement(By.id("cheightmeter")).sendKeys(height);
	}
	
	@When("Enter weight as {string}")
	public void enter_weight(String weight) {
		driver.findElement(By.id("ckg")).clear();
		driver.findElement(By.id("ckg")).sendKeys(weight);
	}
	
	@When("Click on Calculate")
	public void click_on_calculate() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[2]/table/tbody/tr/td/table[4]/tbody/tr/td/input[2]")).click();
	}
	
	@Then("Capture the BMI Result and Print")
	public void capture_the_BMI_value_and_print() {
		String valueofBMI=driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/h2")).getText();
		System.out.println(valueofBMI);
	}
	

}
	
	
	
	
		
	


