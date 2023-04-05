package basicSeleniumtests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listOfElements {
	 WebDriver driver;
	 @Before
	    public void openBrowser() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://amazon.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        }
	        
	        @Test
	        public void getListOfTabs() {
	            
	            List<WebElement> tabs= 
	                    driver.findElements(By.xpath("//div[@id='nav-xshop']/a")); //xpath
	            
	            for (WebElement eachTab : tabs) {
//	                String eachTabText = eachTab.getText();
//	                System.out.println(eachTabText);
	               
	            	
	            	//looping each tab to find best sellers
	                if(eachTab.getText().contains("New Releases")) {
	                    eachTab.click();
	                    break;
	                }
	                
	                
	            }
	        }}
