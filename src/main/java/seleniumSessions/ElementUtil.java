package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
	this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	
	
	//wait custom methods: wait utils
	
	public WebElement waitForElementToBePresent(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}

	public void doClick(By locator) {
	     getElement(locator).click();
		
	}
	
public String waitForTitleToBePresent(String title, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

public WebElement waitForElementToBeClickable(By locator, int timeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.elementToBeClickable(locator));
	return getElement(locator);
}

public WebElement waitForElementToBeVisible(By locator, int timeout) {
	WebElement element =  getElement(locator);
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.visibilityOf(element));
	return getElement(locator);
}

public WebElement waitForElementVisibilityLocated(By locator, int timeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	return getElement(locator);
}

public String waitForUrl(String  url, int timeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.urlContains(url));
	return driver.getCurrentUrl();
}

public boolean waitAlertToBePresent(int timeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.alertIsPresent());
	return true;
}

public void clickWhenReady(By locator, int timeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.elementToBeClickable(locator));
	getElement(locator).click();
	
}

public List<WebElement> visiblilityOfAllElements(By locator, int timeout) {
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(locator)));
	return driver.findElements(locator);
}


}



