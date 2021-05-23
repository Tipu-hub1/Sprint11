package classwork;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCodewithSelenium {

	WebDriver driver;
	
	public void LaunchURL() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bashiruddin/Documents/Selenium_java_2/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/bashiruddin/Documents/Selenium_java_2/geckodriver");
		
		driver = new ChromeDriver();
		
		//driver.get("https://macys.com"); // Wait till the page gets laod
		
		Thread.sleep(4000);
		//driver.get("www.facebook.com");
		
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(4000);
		System.out.println("changed from Github by Bashir");
		System.out.println("Changed by Laboni");
		System.out.println("conflict_1 from local");
		System.out.println("conflict from another coworker");
		
		System.out.println("Changed from server");

//		driver.navigate().refresh();
//		driver.navigate().forward();
//		driver.navigate().back();
//		
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String psource = driver.getPageSource();
//		System.out.println(psource);
//		
//		FileWriter File  = null;
//		
//		try {
//			
//			File = new FileWriter("psourde.html");
//			
//			File.write(psource);
//		}
//		finally {
//			if (psource != null) {
//				
//				File.close();
//			}
//			
//		}
//		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.close(); // close the current page
		//driver.quit(); // quit the webdriver session
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		FirstCodewithSelenium obj = new FirstCodewithSelenium();
		
		//obj.LaunchURL();
		
		
	}

}
