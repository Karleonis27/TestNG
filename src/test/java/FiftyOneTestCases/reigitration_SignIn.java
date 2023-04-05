package FiftyOneTestCases;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class reigitration_SignIn {
	
	
	WebDriver driver;
	
	@Before
	    public void RegistrationSingIn() {
	
	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
      driver.get("https://practice.automationtesting.in/");
      driver.manage().window().maximize();
    }

}

