package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1.Open the browser 
		
		driver.get("https://app.hubspot.com/login");
		
		//1.1id - 1st approach (always prefer this)
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("nikhilarwat@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Nikhil@98");
		
		
		//1.2 id - 2nd approach
		//driver.findElement(By.id("username")).sendKeys("nihkilarwat@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Nikhil@98");
	   // driver.findElement(By.id("loginBtn")).click();
		
		
		//2.name
		//WebElement email = driver.findElement(By.name("username"));
		//email.sendKeys("nikhilarwat@gmail.com");
		
		//WebElement pwd = driver.findElement(By.name("password"));
		//pwd.sendKeys("Nikhil@98");
		
		//driver.findElement(By.id("loginBtn")).click();
		
		
		//3.Xpath
		//WebElement email = driver.findElement(By.xpath("//*[@id=\'username\']"));
		//email.sendKeys("nikhilarwat@gmail.com");
		
		//WebElement pwd = driver.findElement(By.xpath("//*[@id=\'password\']"));
		//pwd.sendKeys("Nikhil@98");
	
		
		//4.Css selector
		//WebElement email = driver.findElement(By.cssSelector("#username"));
		//email.sendKeys("nikhilarwat@gmail.com");
				
		//WebElement pwd = driver.findElement(By.cssSelector("#password"));
		//pwd.sendKeys("Nikhil@98");
			
		
		//5.class name
		//WebElement email = driver.findElement(By.className("login-email"));
		//email.sendKeys("nikhilarwat@gmail.com");
		
		//WebElement pwd = driver.findElement(By.className("login-password"));
		//pwd.sendKeys("Nikhil@98");
		
		
		//6.link text
		//driver.findElement(By.linkText("Sign up")).click();
	    
				
		//7.partial link text
		//driver.findElement(By.partialLinkText("Sign")).click();
		
	}

}
