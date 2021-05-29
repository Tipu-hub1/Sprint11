package classwork.pom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// we pass our webdriver as a constructor to this pages....
public class UserCreationPage {
	
	WebDriver driver;
	
	
	UserCreationPage(WebDriver d){
		driver = d;
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement signinLink;
	
	@FindBy (xpath = "//input[@id = 'email_create']")
	WebElement emailInput;
	
	@FindBy (xpath = "//input[@id = 'SubmitCreate']")
	WebElement submitButton;
	
	
	public String signiNewUser(String emailid) {
		if (!signinLink.isEnabled()){
			return "Sign in link not enable";
		}
		
		signinLink.click();
		emailInput.sendKeys(emailid);
		submitButton.click();
		return "";
		
	}
	
	public boolean addUserDetails() {
		
	/// add the code 
		return true;
	}
	
}
