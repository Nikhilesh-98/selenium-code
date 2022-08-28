package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysCopyPaste {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Frlz%3D1C1GCEB_enIN920IN920%26sxsrf%3DALiCzsbakgj39x1YFsqO7nrbOtrSqTxtxQ%3A1660597623125%26q%3DBenedict%2BCumberbatch%26stick%3DH4sIAAAAAAAAAONgFuLWz9U3MDQoLDepSlLiBHHMDUwNzLWEspOt9NMyc3LBhFVyYnHJIlYRp9S81JTM5BIF59LcpNSipMSS5AwAhRdOW0UAAAA%26sa%3DX%26ved%3D2ahUKEwj6wsOb4Mn5AhUHRmwGHVlCAdEQ9OUBegQICxAC%26biw%3D1366%26bih%3D652%26dpr%3D1&hl=en&dsh=S1946358983%3A1660647550865133&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
        
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement userName = driver.findElement(By.id("username"));
		
		firstName.sendKeys("Nikhil");
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		userName.click();
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
