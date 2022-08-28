package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamTestforAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		
		//By country = By.id("Form_submitForm_Country");
		//By state = By.id("Form_submitForm_State");
		
		//By Country_options = By.xpath("//select[@name='Country']");
		
		By links = By.tagName("a");
		
		List<WebElement> count_list = driver.findElements(links);
		

		long startTime = System.currentTimeMillis();
		count_list.stream();
		
		count_list.parallelStream().forEach(ele -> System.out.println(ele.getText()));  //-->8446
		//count_list.stream().forEach(ele -> System.out.println(ele.getText()));    //-->9081

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		

	}

}
