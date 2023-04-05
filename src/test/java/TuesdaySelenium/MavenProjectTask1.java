package TuesdaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenProjectTask1 {

	public static void main(String[] args) {
	String url;
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		url  = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
	// this will navigate you to the url you have passed, navigate initial (first URL)	
		driver.get(url);
		
		
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle ="OragngeHRM";
		

		String currentUrl = driver.getCurrentUrl();
		
		
	
		 if (actualTitle.equals(expectedTitle)&& driver.getCurrentUrl().equals(url)) {
	            System.out.println("We are in" + url);
	        } else {
	            System.out.println("You are in different page" + driver.getCurrentUrl());
	        }

		 
	 url ="https://www.youtube.com/";
		 
		
		 driver.navigate().to(url);
		 

		 if (actualTitle.equals("https://www.youtube.com/")) {
	            System.out.println("We are in" + url);
	        } else {
	            System.out.println("You are in different page: " + driver.getCurrentUrl());
	        }
	
		 driver.navigate().back();
		 
		 if (actualTitle.equals("https://www.https://opensource-demo.orangehrmlive.com/web/index.php/auth/login.com/")) {
	            System.out.println("We are in" + "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        } else {
	            System.out.println("You are in different page" + driver.getCurrentUrl());
	        }
         
		 driver.quit();
		
	}

}
