package FiftyOneTestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTestCases {

	WebDriver driver;
    
    @Before
    public void BeforeMethod() {
        
        /*1) Open the browser
        2) Enter the URL “http://practice.automationtesting.in/”*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void HomePageWithThreeSlidersOnly() throws InterruptedException {
        /*
            3) Click on Shop Menu
            4) Now click on Home menu button
            5) Test whether the Home page has Three Sliders only*/
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();

        driver.findElement(By.id("menu-item-40")).click();
        driver.findElement(By.xpath("//*[@id='content']/nav/a")).click();
        
        //INCOMPLETE, coming back to this
        
    }

    
	}

