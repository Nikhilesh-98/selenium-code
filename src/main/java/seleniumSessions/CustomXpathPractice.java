package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");

		//button[@class='sqdOP yWX7d    y3zKF     ']   xpath for "not now"
		Thread.sleep(5000);
		
		WebElement emailId = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailId,"nikhilarwat@gmail.com").build().perform();
		action.sendKeys(password,"Nicks@98").build().perform();
		action.click(loginbutton).build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='sqdOP yWX7d    y3zKF     ']")).click();
		Thread.sleep(3000);
		
		//button[@class='_a9-- _a9_1']
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"nikhilesh._a\"]")).click();
		
	}

}
