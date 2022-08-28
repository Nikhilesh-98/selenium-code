package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		List <WebElement> imageslist = driver.findElements(By.tagName("img"));
		System.out.println(imageslist.size());
		
		for(int i=0; i<imageslist.size(); i++) {
		String imageurl = imageslist.get(i).getAttribute("src");
		System.out.println(imageurl);
		
	}

  }
}


//By this code we can get total number of images and links 