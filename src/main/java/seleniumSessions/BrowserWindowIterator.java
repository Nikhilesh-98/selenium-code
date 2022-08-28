package seleniumSessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowIterator {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); 
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click(); 
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click(); 
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click(); 
		
		Set<String> handles = driver.getWindowHandles();
	//	Iterator<String> it = handles.iterator();
		
//		while(it.hasNext()) {
//			String childWindowID = it.next();
//			driver.switchTo().window(childWindowID);
//			System.out.println(driver.getTitle());
//			driver.close();
			
//		}
	}

}
