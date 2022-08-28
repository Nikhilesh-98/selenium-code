package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ixigo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Start date
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		
		
		List<WebElement> startDateList = driver.findElements(By.xpath("//div[@class='rd-month'][1]/table//div[contains(@class,'day')]"));
		
		for(WebElement e: startDateList) {
			if(e.getText().equals("13")) {
				e.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		Thread.sleep(2000);
		String MonthValue = driver.findElement(By.xpath("//div[contains(@class,'month')]")).getText();
		
		while(!MonthValue.contains("October 2022")) {
			
			driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next'][2]")).click();
		}
		
		//End date
		
        List<WebElement> endDateList = driver.findElements(By.xpath("//div[@class='rd-month'][2]/table//div[contains(@class,'day')]"));
		
		for(WebElement e: endDateList) {
			if(e.getText().equals("5")) {
				e.click();
				break;
			}
		}
		
	}

}
