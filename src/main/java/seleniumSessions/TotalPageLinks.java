package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List <WebElement> linkslist = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+ linkslist.size()); // It will give you number of total link available on webpage
		
		for(int i=0; i<linkslist.size(); i++) {
			String text = linkslist.get(i).getText();    // This will print all links 
			System.out.println(text);
			
			
		}
		
		
		driver.quit();
		

	}

}
