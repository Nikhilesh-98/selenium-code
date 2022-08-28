package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {
	
public static void selectValueFromDropDown(WebElement element,String value) {
		
		Select select = new Select (element);
		select.selectByVisibleText(value);

}

public static void selectValueFromDropDownByIndex(WebElement element,int index) {
	
	Select select = new Select (element);
	select.selectByIndex(index);

}


}