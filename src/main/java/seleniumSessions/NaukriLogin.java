package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		Thread.sleep(8000);
		
		WebElement emailId = driver.findElement(By.id("usernameField"));
		WebElement password = driver.findElement(By.id("passwordField"));
		WebElement loginbutton = driver.findElement(By.xpath
				("//button[@class=\"waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform\"]"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailId,"nikhilesh2398@gmail.com").build().perform();
		action.sendKeys(password,"Nicks@98").build().perform();
		action.click(loginbutton).build().perform();
		
	}

}
