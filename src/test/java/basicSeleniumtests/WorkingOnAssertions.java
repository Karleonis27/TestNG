package basicSeleniumtests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingOnAssertions {

	
	

	WebDriver driver;

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
 } @Ignore // to ignore  first code below
    @Test
    public void assertTrueTest() {
    	String title = driver.getTitle();
    	
    	Assert.assertTrue(title.equals("Google")); // it checks if it's true
    	
    }
 @Ignore
    @Test
    public void assertFalseTest() {
    	String title = driver.getTitle();
    	
    	Assert.assertFalse(title.equals("Google")); // it checks if it's false
    	
    }
 @Test
 public void assertEquals() {
 	String title = driver.getTitle();
 	
 	Assert.assertEquals("Google,Inc", title); // it compares two objects
 	
 }
    
    
}
