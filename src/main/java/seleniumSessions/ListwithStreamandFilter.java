package seleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListwithStreamandFilter {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
        By links = By.tagName("a");
		
		List<WebElement> linkList = driver.findElements(links);
		
		System.out.println(linkList.size());
		
		List<String> collectList = linkList.stream().
		                                       filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon")).
		                                                          map(ele -> ele.getText()).
		                                                                         collect(Collectors.toList());
		
		collectList.stream().forEach(ele -> System.out.println(ele));
		

	}

}
