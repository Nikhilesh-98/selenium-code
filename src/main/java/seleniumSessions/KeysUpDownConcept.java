package seleniumSessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysUpDownConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		Actions action = new Actions(driver);
		//Scroll down using actions class
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(1000);
		
		//Scroll up using actions class
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		

	}

}
