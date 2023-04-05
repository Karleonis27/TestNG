package basicSeleniumtests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class alertTestingExamples {
 WebDriver driver;
	 @Before
	    public void openBrowser() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	 }
	   
	        @Test
	        public void firstAlert() {
	            
	            driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Alert')]")).click();
	            
	            String jsText = driver.switchTo().alert().getText();
	            
	            System.out.println(jsText);
	            
	            driver.switchTo().alert().accept();
	            
	        } @Ignore
	        @Test
	        public void secondtAlert() {
	            
	            driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Confirm')]")).click();
	            
	            String jsText = driver.switchTo().alert().getText();
	            
	            System.out.println(jsText);
	            
	            driver.switchTo().alert().accept();
	            
	
	          }
	      
	         @Test
	            public void thirdAlert() {
	        	 //pressing the alert button
	            driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Prompt')]")).click();
	          
	            //getting the text of the alert box and printing it out.
	            String jsText = driver.switchTo().alert().getText();
	            System.out.println(jsText);
	            
	            //sending string word to the alert box and accepting the alert
	            String sendingString = "MrFlashlight"; 
	            driver.switchTo().alert().sendKeys("MrFlashlight");
	            driver.switchTo().alert().accept();
	            
	            
	            String actualResultOnPage = 
	            		driver.findElement(By.xpath("//*[@id='result']")).getText();

	            //	          String expectedPrint = "You entered: MrFlashlight";
	            Assert.assertTrue(actualResultOnPage.contains(sendingString));

	        }@After
	            public void afterTest() {
	        	driver.close();
	        }

	        }
	        






	        


