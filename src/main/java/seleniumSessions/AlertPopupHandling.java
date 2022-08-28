package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // 1.Open the browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//2.Launch URL
		driver.findElement(By.name("proceed")).click();//3.Click on login button
		
		Alert alert = driver.switchTo().alert();//4.Popup handling
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Popup is correct");
		}else {
			System.out.println("Popup is incorrect");
		}
		
		alert.accept(); // click ok to accept the popup
		driver.quit();

	}

}
