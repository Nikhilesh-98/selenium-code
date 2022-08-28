package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLoginExplcitwait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");

		System.out.println(driver.getTitle());
		
		By emailID = By.id("email");
		
		WebDriverWait wait = new WebDriverWait(driver ,0);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Nikhil@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		
		password.sendKeys("Nikhil@98");
		loginbutton.click();
		
	}

}
