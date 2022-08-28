package seleniumSessions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckodriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\DOWNLOADS\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //1.Open the browser 
		driver.get("http://www.google.com"); //2.Enter URL
		
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
