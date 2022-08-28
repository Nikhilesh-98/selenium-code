package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//WebElement frameElement = driver.findElement(By.name("main"));// Method 1 
		//driver.switchTo().frame(frameElement);
		
		//driver.switchTo().frame("main"); // Method 2
		
		driver.switchTo().frame(2); // Method 3 
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
