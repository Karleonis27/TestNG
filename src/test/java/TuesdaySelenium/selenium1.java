package TuesdaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {



	public static void main(String[] args) {
		// create variable
		String url;
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		//calling chrome driver, overriding and mking driver into chrome driver
		driver = new ChromeDriver();
		// it will make your browser full screen
		driver.manage().window().maximize();
		
       /*
        * open gogle.com
        */
		
		url  = "https://www.google.com/"; // uniform resource locator
		
	// this will navigate you to the url you have passed, navigate initial (first URL)	
		driver.get(url);
		
		
	//	driver.getTitle(); --> will return the title of the page
		
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle ="Google";
		
		
		
		String currentUrl = driver.getCurrentUrl();
		
		
	
		 if (actualTitle.equals(expectedTitle)&& driver.getCurrentUrl().equals(url)) {
	            System.out.println("We are in" + url);
	        } else {
	            System.out.println("You are in different page" + driver.getCurrentUrl());
	        }

		 url ="https://www.amazon.com/";
		 
		 // to navigate you to the url you have pass, it is different than the driver.get !!! To continue to navigate a different URL
		 driver.navigate().to(url);
		 

		 if (actualTitle.equals("https://www.amazon.com/")) {
	            System.out.println("We are in" + url);
	        } else {
	            System.out.println("You are in different page" + driver.getCurrentUrl());
	        }
		
		 // should navigate you back to previous page
		 driver.navigate().back();
		 
		 if (actualTitle.equals("https://www.google.com/")) {
	            System.out.println("We are in" + "https://www.google.com/");
	        } else {
	            System.out.println("You are in different page" + driver.getCurrentUrl());
	        }
         
		 
		 // should navigate you back to forward page
		// this should navigate me back to forward page which is in our case Amazon.com
		 
		 driver.navigate().forward();
		 
		 if (actualTitle.equals("https://www.amazon.com/")) {
	            System.out.println("We are in" + "https://www.amazon.com/");
	        } else {
	            System.out.println("You are in different page" + driver.getCurrentUrl());
	        }
		 
		 driver.quit(); // will close the browser, never forget to do this !!!!!
	

		 
	}

}
