package farukAmazon;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	 WebDriver driver;
	    WebDriverWait wait;

	    @Before
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.com/");
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);    
	        wait = new WebDriverWait(driver, 30);
	    }
	    
	    

	    @Test
	    public void searchBoxTest() {
	        // twotabsearchtextbox

	        WebElement searchBox = driver.findElement(By.xpath("//*[contains(@id,'searchtextbox')]"));
	        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

//	        wait.until(ExpectedConditions.visibilityOf(searchBox));
	//
//	        searchBox.clear();
//	        searchBox.sendKeys("laptop");
//	        searchButton.click();

	        if (wait.until(ExpectedConditions.visibilityOf(searchBox)) != null) {
	            searchBox.clear();
	            searchBox.sendKeys("laptop");
	            searchButton.click();
	        }
	        
	        String expectedTitle = "Amazon.com : laptop...";
	        String actualTitle = driver.getTitle();
	        
	        Assert.assertEquals(expectedTitle, actualTitle);
	        
	        if(!(expectedTitle.equals(actualTitle))) {
	        //    System.out.println("---Expected: " + expectedTitle + " +++Actual: " + actualTitle);
	            
	            Assert.assertFalse("Actual: "+actualTitle,false);
	            
	        }
	        
	        

	    }

	    @After
	    public void afterMethod() {
	        driver.quit();
	    }

	}
	
