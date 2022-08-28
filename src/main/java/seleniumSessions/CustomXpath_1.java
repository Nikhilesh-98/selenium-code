package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//1. //*[@prop='value']
		     //*[@id='username']
		
		//2. //htmltag[@id='value']
		     //input[@id="username"]
		     //input[@class="form-control private-form__control login-email"]
		
		//3. //htmltag[@prop1='value' and @prop2='value']
		     ////input[@id='username' and @type='email']
		
		    //conatins in Xpath
		//4.//htmltag[contains(@prop,'value')]
		    //input[contains(@id,"username")]
		    //input[contains(@class,"login-email")]
		    //input[@id="username" and contains(@class,"login-email")]
		
		//5. //htmltag[contains(@prop,'value')][index number]
		     //input[contains(@class,"form-control")][]
		
		//6. //htmltag[contains(@prop,'value')][position()=1]
		     //input[contains(@class,"form-control")][position()=1]
		
		//text() in Xpath
		//7. //htmltag[text()=''value]
		     //i18n-string[text()="Don't have an account?"]
		     //i18n-string[text()="Forgot my password"]
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);
		
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailID,"Test@gmail.com").build().perform();
		action.sendKeys(password,"Test@123").build().perform();
		action.click(loginbutton).build().perform();
		
		String headervalue = driver.findElement(By.xpath("//h1[@class='private-page__title']")).getText();
		System.out.println(headervalue);
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Sales Dashboard']")).isDisplayed());
		
		
		
		
	}

}
