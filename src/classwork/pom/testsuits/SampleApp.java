package classwork.pom.testsuits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import classwork.pom.pages.SearchPage;
import classwork.pom.pages.UserCreationPage;


public class SampleApp {
	
	public WebDriver driver;
	public String btype = "Chrome";
	public String url = "http://automationpractice.com/index.php";
	
	public SearchPage SearchObj;
	public UserCreationPage Userobj;
	
	@BeforeClass
	public void bc() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/bashiruddin/Documents/Selenium_java_2/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/bashiruddin/Documents/Selenium_java_2/geckodriver");
		
		if (btype.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.get("http://gmail.com"); // will load the complete url
//		driver.navigate().to("http:gmail.com"); // This will not wait to load the URL
//		Thread.sleep(4000);
//		driver.navigate().refresh();
//		
//		driver.navigate().to("https://facebook.com");
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(4000);
//		
//		driver.navigate().forward();
//		
//		String s = driver.getCurrentUrl();
//		System.out.println(s);
//		
//		String s1 = driver.getTitle();
//		System.out.println(s1);
		
SearchObj = PageFactory.initElements(driver, SearchPage.class);
Userobj = PageFactory.initElements(driver, UserCreationPage.class);
//		
	}
	
	
	
	@Test(priority=1)
	public void searchUser() {
		boolean b = SearchObj.search("Casual dress");
		Assert.assertTrue(b, "Falied in search functionality");
		
	}
	
	@Test(priority=2)
	public void createUser() {
		String returnusercreation = Userobj.signiNewUser("uddin.b.un@gmail.com");
		Assert.assertTrue(returnusercreation.isEmpty(), "Failed to create User");
	}
}
