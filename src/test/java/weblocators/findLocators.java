package weblocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findLocators {

	public static void main(String[] args) throws InterruptedException {

        String url;
        url = "https://www.amazon.com/";
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
        driver.manage().window().maximize();

        driver.get(url);

//        
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(args);
//

        
        

        // id = "twotabsearchtextbox" --> Amazon search Box element

        // in order to find the single element we have to use the findElement method
        // from driver and declare
        // the attribute type using By.id / By.className etc. and passing the element
        // value from the UI
      
        
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")); 

     //   "//*[@id='twotabsearchtextbox']"
        
        Thread.sleep(3000); // don't use this
        

        // this method will clear the search box , just in case there is any value
        searchBox.clear();

        String product = "Rose";
        
        // this method will sendKeys (write some values in the box)
        searchBox.sendKeys(product);

        // id = nav-search-submit-button --> searchButton

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

        searchButton.click();

        Thread.sleep(3000);

        
        if(driver.getTitle().equals("Amazon.com : " +product)) {
            System.out.println("You are searching the right product: "+product);
        }else {
            System.out.println("You are searching something else and the title: " + driver.getTitle());
        }
        
        
        driver.quit();

    }

	
	}


