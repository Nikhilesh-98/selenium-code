package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropdownValues {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9062097%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw_b6WBhAQEiwAp4HyIKsjCm0r4VqCP1G12aFUi0l6sPz259FvRRm7XFv1_aFy4XwXFPEpmRoC_pQQAvD_BwE");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
	}
		
		
public static void getDropDownValues(WebElement element) {
	    System.out.println("============================");
		Select select = new Select(element);
		
		List<WebElement> droplist = select.getOptions();
		System.out.println("total number of values in dropdown: "+droplist.size());
		
		for(int i = 0; i<droplist.size();i++ ) {
			String text = droplist.get(i).getText();
			System.out.println(text);
			
		}
	}
}
