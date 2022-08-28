package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCharSequenceConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		WebElement email =  driver.findElement(By.id("input-email"));
		
		//We can use StringBuilder, StringBuffer, String, Keys
		StringBuilder username = new StringBuilder()
	    .append("Naveen")
	    .append(" ")         
	    .append("Automation")        
	    .append(" ")
	    .append("Labs")
	    .append(" ")
	    .append("Selenium");
		
		String space = " ";
		
		StringBuilder userinfo = new StringBuilder()
		.append("Test")
		.append(" ")
		.append("WebDriver");
		
		String author = "Nikhilesh";
		
		email.sendKeys(username, space, userinfo, space, author);
		
		WebElement password = driver.findElement(By.id("input-password"));
		StringBuffer pass = new StringBuffer()
				.append("Test")
				.append("@")
				.append("123");
		
		password.sendKeys(pass);
				
		
		
		
		
		
		
		
	}

}
