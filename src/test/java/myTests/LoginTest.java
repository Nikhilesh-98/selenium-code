package myTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	By username = By.id("email");
	By password = By.id("pass");
	By login = By.xpath("//button[@data-testid='royal_login_button']");
	By signup = By.linkText("Create New Account");
	By home= By.xpath("//span[contains(text(),'Home')]");
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
	}
	
	
	@Test(priority=1)
	public void signUpLinkTest(){
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		String Title = driver.getTitle();
		System.out.println("Page title is"+ Title);
		Assert.assertEquals(Title, "Facebook – log in or sign up");
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		
		driver.findElement(username).sendKeys("9527694863");
		driver.findElement(password).sendKeys("Nicks@98");
		driver.findElement(login).click();
		
		String homeVal = driver.findElement(home).getText();
		Assert.assertEquals(homeVal,"Home");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
