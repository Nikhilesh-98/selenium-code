package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//div[@class='input-group']//following::input[@name='username']    -----  CRMPRO Website
		
		//WebElement emailId = driver.findElement(By.id("username"));
		//WebElement password = driver.findElement(By.id("password"));
		//WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		//Actions action = new Actions(driver);
		//action.sendKeys(emailId,"nikhilarwat@gmail.com").build().perform();
		//action.sendKeys(password,"Nicks@98").build().perform();
		//action.click(loginbutton).build().perform();
		
		//Thread.sleep(5000);
		
		//driver.navigate().to("https://app.hubspot.com/contacts/22427317/objects/0-1/views/all/list");
	
		//driver.findElement(By.xpath
		//("//span[@class='private-truncated-string']//ancestor::td//preceding-sibling::td//div[@data-test-id='checkbox-select-row-101']")).click();
		
		//span[@class='private-truncated-string']//ancestor::td//preceding-sibling::td//div[@data-test-id='checkbox-select-row-101']
	
		//td[@class="sorting_1" and text()='Airi Satou']//preceding::td
		
		driver.findElement(By.xpath("//td[@class=\"sorting_1\" and text()='Ashton Cox']//preceding::td")).click();
	
	}
	

}
