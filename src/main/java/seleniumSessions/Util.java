package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
	
	WebDriver driver;
	
	public Util(WebDriver driver){
	this.driver = driver;
	}

	
	//This method is used to create the webelement on the basis of By loacator
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
}
