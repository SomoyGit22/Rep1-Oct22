package FirstSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalorieCalculator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0009GQ744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("50");
	}

}
