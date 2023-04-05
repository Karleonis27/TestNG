package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTaskWebLocators {

	public static void main(String[] args) throws InterruptedException {
String url = "https://www.youtube.com/";
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		 driver.get(url);
		 
			WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox")); // key and value (hashMap)
			
		
			
			 Thread.sleep(3000); //Do not use this, it will make it slower
				
			   //this meathod will clear thes search box, just in case there's any value
				searchBox.clear();
				
				 //this method will sendKeys (write some values in the box)
				searchBox.sendKeys("laptop");
				 
		      
				
				
				//id = nav-search-submit-button
		        
		        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		        
		        searchButton.click();
		        
		        Thread.sleep(3000);
		        
				
			  //  WebElement verifyText
				 
				 
		 
				 
				 
				 
				 driver.quit();
			
	}

}
