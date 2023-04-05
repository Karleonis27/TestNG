package cohort13_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowserTesting {

	public static void main(String[] args) {
	
		// you setting the chrome driver path
		WebDriver driver;
		
		// declare and initialized webdriver to chromedriver
		System.setProperty("webdriver.chrome.driver", "/Users/k.leon/Downloads/chromedriver_mac_arm64/chromedriver");
		
		 driver = new ChromeDriver();
		String url= "https://www.techcircleschool.com/";
		
		driver.get(url);
		
		
//		
//		   //declare the driver object
//        WebDriver driver;
//        
//        WebDriverManager.chromedriver().setup();
//
//        //initialized webdriver to chromedriver
//        driver = new ChromeDriver();
//
//        // windowsUsers
//        // \\Users\\techcircle\\Downloads\\chromedriver_mac_arm64\\chromedriver.exe
//        String url = "https://www.techcircleschool.com/";
//
//        driver.get(url);


	}

}
