package seleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderHandlePractice {

	public static void main(String[] args) throws InterruptedException {  
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//input[@placeholder='DD/MY']")).click();
		
	    List <WebElement> startDate =  driver.findElements(By.xpath("//span[contains(@class,'')]"));
	 
	    Thread.sleep(2000);
	    
	    for(WebElement e: startDate) {
			if(e.getText().equals("13")) {
				e.click();
				break;
			}
		}
	    
		
		
				
	}				
				
}				
				

				
				
				
				
				
				
				