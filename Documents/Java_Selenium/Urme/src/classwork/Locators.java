package classwork;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends FirstCodewithSelenium{
	
	
	
	public void locator1() {
		
		//WebElement searchInput = driver.findElement(By.id("search_query_top"));
		//searchInput.sendKeys("Casual Dresses");
		List<WebElement> searchInputlist = driver.findElements(By.tagName("input"));
		System.out.println("size of input elements " + searchInputlist.size());
		
		for (int i = 0; i<searchInputlist.size(); i++) {
			System.out.println(searchInputlist.get(i));
		}
		
		
//		for (WebElement w : searchInputlist) {
//			System.out.println(w.getLocation());
//		}
		
		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Casual Dresses"); // using css selector with id
		driver.findElement(By.cssSelector("input[name ='search_query']")); // CSS selector with name.
		driver.findElement(By.cssSelector("input.search_query")).click(); // using css selector with classname
		driver.findElement(By.cssSelector("form>input[name=search_query]")); // using css selector with parentchild relationship
		
		//--------------------------- Xpath----------
		
		driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("casual dress");
		driver.findElement(By.xpath("//input[@id = 'search_query_top'][@type = 'text']")).sendKeys("casual dress");
		driver.findElement(By.xpath("//input[(@id = 'search_query_top')or (@type = 'text')]")).sendKeys("casual dress"); // and/or
		driver.findElement(By.xpath("//input[not(@id = 'search_query_top')]"));  // not having the attribute
		driver.findElement(By.xpath("//input[not(@type = 'hidden']")); // input not hidden
		driver.findElement(By.xpath("//input[@class = 'search_query form-control ac_input']")); // xpath by class
		driver.findElement(By.xpath("//input[starts-with (@class,'search_query')]")); // starts with ...starts-with
		driver.findElement(By.xpath("//input[contains (@class,'search_query')]")); // using contains -- using partial text
		driver.findElement(By.xpath("//a[text()= 'Contact us']")).click(); // contact us link --- we can use text()
		driver.findElement(By.xpath("//a[contains (text(), 'Sign in')]")).click(); // Sign-in Link --- need to use contains follows by parenthesis and text(),
		
		driver.findElement(By.xpath("//form[@id = 'searchbox']/button")).click(); // search button .. parent-child
		
		driver.findElement(By.xpath("//div[@id = 'search_block_top']/form/button")).click(); // grandparent/parent/child
		
		
		
		
		
	}
	
	
	public static void main (String[]args) throws InterruptedException, IOException {
		
		Locators obj = new Locators();
		obj.LaunchURL();
		obj.locator1();
		System.out.println("newchange");
		
	}

}
