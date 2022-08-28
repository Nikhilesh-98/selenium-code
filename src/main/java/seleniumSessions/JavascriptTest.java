package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		System.out.println(JavascriptUtil.getTitleByJs(driver));
		
		//JavascriptUtil.generateAlert(driver, "This is testing");
		Thread.sleep(2000);
		JavascriptUtil.refreshBrowserByJs(driver);
		
		Thread.sleep(2000);
		
		System.out.println(JavascriptUtil.getBrowserInfo(driver));
		
		JavascriptUtil.sendKeysusingJswithId(driver, "username", "nikhilarwat@gmail.com");
		JavascriptUtil.sendKeysusingJswithId(driver, "password", "Nicks@98");
		//WebElement login = driver.findElement(By.id("loginBtn"));
		//JavascriptUtil.clickElementByJs(login, driver);
		
		Thread.sleep(6000);
		
		WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
		JavascriptUtil.drawBorder(signUpLink, driver);
		
		WebElement loginForm = driver.findElement(By.id("hs-login"));
		JavascriptUtil.drawBorder(loginForm, driver);
		
		JavascriptUtil.flash(loginForm, driver);
	}

}
