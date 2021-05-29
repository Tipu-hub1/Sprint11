package classwork.pom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
WebDriver driver;
	
 public SearchPage(WebDriver d) {
	 driver = d; 
 }

	
	@FindBy(xpath = "//input[@name = 'search_query']")
	WebElement  searchinput;
	
	@FindBy (xpath = "//button[@name = 'submit_search']")
	WebElement searchSubmit;
	
	@FindBy(xpath = "//input")
	List<WebElement> searchinputlist;
	
	
	
	
	public boolean search (String searchstr) {
		
		if (!searchinput.isEnabled()) {
			
		System.out.println("Input box is not enabled");
		return false;
		}
		searchinput.click();
		searchinput.clear();
		searchinput.sendKeys(searchstr);
		searchSubmit.click();
		return true;
		
	}
}
