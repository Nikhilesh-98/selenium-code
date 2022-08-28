package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLogin {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtil elementUtil = new ElementUtil(driver);
		 
		
		By emailID = By.id("username");
		By password = By.id("password");
		By loginbutton = By.id("loginBtn");
		//By signUp = By.linkText("Sign up");
		
		driver.get("https://app.hubspot.com/login");
		//elementUtil.clickWhenReady(signUp,15);
		
		String title = elementUtil.waitForTitleToBePresent("Login",10);
		System.out.println(title);
	
	    elementUtil.waitForElementToBePresent(emailID, 3).sendKeys("nikhil@gmail.com");
		elementUtil.doSendKeys(password, "Nikhil@98");
		//elementUtil.doClick(loginbutton);
		elementUtil.waitForElementToBePresent(loginbutton, 0).click();
	

	}

}
