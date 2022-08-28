package myTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInTest {
	
	WebDriver driver;
	By signin = By.xpath("//div[@class='header_user_info']");
	By createAcc = By.id("email_create");
	By loginbutton = By.id("SubmitCreate");
	
	@BeforeMethod
	public void setup(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test(priority = 1)
	public void signuptest() {
		
		Assert.assertTrue(driver.findElement(signin).isDisplayed());
		
	}
	
	@Test(priority = 2)
	public void getTitle() {
		String Title = driver.getTitle();
		System.out.println("Page Title is:" + Title);
		Assert.assertEquals(Title, "Your laga");
	}
	
	@Test(priority = 3)
	public void createaccTest() {
		
		driver.findElement(createAcc).sendKeys("nikhil@gmail.com");
		driver.findElement(loginbutton).click();
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}

}
