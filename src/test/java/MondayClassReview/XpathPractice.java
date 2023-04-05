package MondayClassReview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	public static void main(String[] args) {
       

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        String userName = "Admin";
        String passWord = "admin123";

        WebDriver driver; // declaring the web driver object

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(); // initializing to chromedriver

        driver.manage().window().maximize(); // maximize

        driver.get(url); // invoked the url/ navigating to url

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 

        WebElement userNameBox = driver.findElement(By.xpath("//*[@name='username']")); //xpath
        // WebElement userNameBox = driver.findElement(By.name("username"));
   
        //  driver.findElement(By.name("userName")).sendKeys(userName);

        WebElement passWordBox = driver.findElement(By.xpath("//*[@name='password']"));

        WebElement loginButton = driver.findElement(By.xpath("//*[contains(@class,'login-button')]"));

        userNameBox.clear();
        userNameBox.sendKeys(userName);

        passWordBox.clear();
        passWordBox.sendKeys(passWord);

        loginButton.click();

        driver.quit();

    }
}
