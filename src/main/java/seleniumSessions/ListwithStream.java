package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListwithStream {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/orangehrm-30-day-trial/?");
		
		Thread.sleep(3000);
		
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
		By Country_options = By.xpath("//select[@name='Country']");
		
		List<WebElement> count_list = driver.findElements(Country_options);
		
		//long startTime = System.currentTimeMillis();
		//count_list.stream();
		
		//count_list.stream().forEach(ele -> System.out.println(ele.getText()));   // Lambda --- sequential stream  ----188
		
		//long endTime = System.currentTimeMillis();
		//System.out.println(endTime - startTime);
		
		long startTime = System.currentTimeMillis();
		count_list.stream();
		
		count_list.parallelStream().forEach(ele -> System.out.println(ele.getText()));  // parellel stream   ----- 314
		

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		

	}

}
