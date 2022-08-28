package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1.Open the browser 
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // method 1
		
		String username = "admin";// Method 2
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth"); 
		

	}

}

//Selenium can not handle authantication popup, we can pass used id and password in link to login 