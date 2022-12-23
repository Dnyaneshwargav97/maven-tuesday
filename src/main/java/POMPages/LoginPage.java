package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	private WebElement username;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	private WebElement pass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")
	private WebElement loginbttn;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]")
	private WebElement searchbuttn;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void usernamemethod(String user) {
		username.sendKeys(user);
	}
	
	public void passmethod(String pass1) {
		pass.sendKeys(pass1);
	}
	
	public void loginbutton() {
		loginbttn.click();
	}
	public void searchboxmethod(String searchname) {
		searchbox.sendKeys(searchname);
	}
	public void searchbuttnmethod() {
		searchbuttn.click();
	}
	


}
