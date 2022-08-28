package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1.Open the browser 
		driver.get("http://bing.com"); //2.Enter URL
		
		String title = driver.getTitle(); //3. Get the page title
		System.out.println(title);
		
		//4.Validation
		if (title.equals("Google")) {
             System.out.println("Title is correct");
	   }else {
		System.out.println("Title is incorrect");
	   }
		
		System.out.println(driver.getCurrentUrl()); // 5.Get the current URL
		
		driver.quit(); // 6.Close the browser
	}

}
