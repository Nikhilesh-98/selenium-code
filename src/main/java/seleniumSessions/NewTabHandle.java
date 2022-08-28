package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String parentWindowId = driver.getWindowHandle();
		System.out.println(driver.getTitle()); 
		
	//	This programme will work in selenium 4
		
	//	driver.switchTo()).newWindow(WindowType.WINDOW);
	//	driver.get("https://amazon.in");
	//	System.out.println(driver.getTitle);
	//	System.out.println(driver.getCurrentUrl);
	//	driver.close();
		
	//	driver.switchTo().window(parentWindowId);
		//	System.out.println(driver.getTitle);
		//	System.out.println(driver.getCurrentUrl);
		//	driver.quit();
		
		
			
		

	}

}
