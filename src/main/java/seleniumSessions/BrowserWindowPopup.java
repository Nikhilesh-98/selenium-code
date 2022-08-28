package seleniumSessions;

import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String>  it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window Id is :"+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window Id is :"+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is :" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is :" + driver.getTitle());
		
		driver.quit();
		
	}

}
