package seleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkswithStream {

	public static void main(String[] args) {
			

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://fireart.studio/blog/10-best-examples-of-website-footer-designs/");
		
		By links = By.xpath("//div[@class='footer-section']//li");
		
		List<WebElement> linkList = driver.findElements(links);
		
		System.out.println(linkList.size());
		
		List<String> collectList = linkList.stream().
                filter(ele -> !ele.getText().equals("")).
                                   map(ele -> ele.getText()).
                                                  collect(Collectors.toList());

collectList.stream().forEach(ele -> System.out.println(ele));


	}

}
