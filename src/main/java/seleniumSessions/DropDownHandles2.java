package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandles2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/orangehrm-30-day-trial/?");
		
		Thread.sleep(3000);
		
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
		Select select = new Select(driver.findElement(country));
		select.selectByVisibleText("India");
		
		Select select1 = new Select(driver.findElement(state));
		select1.selectByVisibleText("Maharashtra");

	}

}