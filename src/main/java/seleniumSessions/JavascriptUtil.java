package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+ "')");
		
	}
	
	public static void refreshBrowserByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	public static String getBrowserInfo(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String UAgent = js.executeScript("return navigator.userAgent;").toString();
		return UAgent;
		
	}
	
	public static void sendKeysusingJswithId(WebDriver driver, String id, String value) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("document.getElementById('"+ id +"').value='" + value + "'");
		
	}
	
	public static void clickElementByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 20; i++) {
			changeColor("rgb(0,200,0)", element, driver);// 1
			changeColor(bgcolor, element, driver);// 2
		}
		
	}

		private static void changeColor(String color, WebElement element, WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.backgroundcolorr='" + color + "'", element);
			
			try {
				Thread.sleep(20);
			} catch(InterruptedException e) {
				
			}
		
	}

		public String getPageInnerText(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("return document.documentElement.innerText;").toString();
		}

		public void scrollPageDown(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		
		public void scrollIntoView(WebElement element, WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
} 
