package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // 1.Open the browser
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");//2.Launch URL
		
		
		
		driver.findElement(By.name("upfile")).sendKeys("‪E:\\DOWNLOADS\\Nikhilesh Sakharam Arwat-22_02272.pdf");
		

	}

}
