package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationHandle {
	
	static WebDriver driver;
	
	public static void selectContact(String name) {
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Redmi Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> productList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	    
		 for(WebElement product:productList) {

		        System.out.println(product.getText());      
		    }   
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		 
		
		
		

	}

}
