package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1.Open the browser 
		
		driver.get("http://google.com"); //2.Enter URL
		System.out.println(driver.getTitle());//3.Get the URL
		
		driver.navigate().to("http://flipkart.com"); //4.Navigate to another site
		System.out.println(driver.getTitle()); //5. Get the URL of that site
		
		driver.navigate().back(); //6.Get back to previous site
		System.out.println(driver.getTitle()); //7.Get the URL of that site
		
		driver.navigate().forward(); //8.Again go to previous site
		System.out.println(driver.getTitle()); //9.Get the URL of that site
		
		driver.navigate().refresh();//10. Refresh the page
		
		
	}

}
