package seleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotconcept2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		takePageScreenshot(driver, "loginpage");
		
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		emailID.sendKeys("Nikhil@gmail.com");
		password.sendKeys("Nikhil@98");
		//loginbutton.click();
		
		takeElementScreenshot(emailID,"emailID");
		takeElementScreenshot(password,"password");
		takeElementScreenshot(loginbutton,"loginbutton");
		
		takePageScreenshot(driver,"loginPageError");
		
		driver.quit();

	}
	
	public static void takePageScreenshot(WebDriver driver, String fileName) {
		
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	

	public static void takeElementScreenshot(WebElement element, String fileName) {
	
	File SrcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(SrcFile, new File("./target/screenshots/"+fileName+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
	
//We can give name automatically to captured screenshot by this code.
//we can also take thr ss of specific element