package generic_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	
	public void DoubleClick(WebDriver driver , WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick();
		
	}
	public void rightclick(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.contextClick().perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement source , WebElement target ) {
		Actions a =new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	public void mousehover(WebDriver driver,WebElement ele) {
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void dropdown(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}

}
