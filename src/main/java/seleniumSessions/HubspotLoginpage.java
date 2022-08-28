package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLoginpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(20000); // Static wait
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  //Dynamic wait - Implicit wait method
		System.out.println(driver.getTitle());
		
		WebElement emailID = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
	    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		
		emailID.sendKeys("Nikhil@gmail.com");
		password.sendKeys("Nikhil@98");
		loginbutton.click();

	}

}
