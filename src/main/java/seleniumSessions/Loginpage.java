package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//page objects
		By emailID = By.id("username");
		By password = By.id("password");
		By loginbutton = By.id("loginBtn");
		
		Util util = new Util(driver);
		util.getElement(emailID).sendKeys("Nikhil@gmail.com");
		util.getElement(password).sendKeys("Nikhil@98");
		util.getElement(loginbutton).click();
		

	}

}
