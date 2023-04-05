package Utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static WebDriver driver;
    private static Properties configFile;
    //public driver instantiation function
    public static WebDriver getDriver() {
        
        if (driver==null) {    //it makes a singleton class. otherwise there will be bunch of problems
                
        
             switch (BaseClass.getProperty("browser")) {   //we can switch this chrome to other browser to change it. for example "chrome-headless"
                
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;  //dont forget to put break!!

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
 case "firefox-headless": //running your code without open a browser but it's running in back.  //you don't need a browser
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support EDGE");
                    }
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your OS doesn't support Safari");
                    }
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;

                }
                
                driver.get(BaseClass.getProperty("url"));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        }        
        
        return driver;        
    } 
    
    
    //driver close function
    public static void closeDriver() {
        //it will reset and next one starts as brand new
        if (driver != null) {
            driver.quit();
            driver = null;   //we have empty that we need to protect them from overloading. otherwise test is not going to work
        }            
    }
static {
        
        try {
            //we have to tell the computer location of the file
            //this code will grab the file that we created under resourcess!!!!
            String filePath = "src\\main\\resources\\files\\config.properties";    //here  is only part we change in this code and the rest is same
            FileInputStream input = new FileInputStream(filePath);   //it will open the connection from filePath to input. it lets you have connection
            
            configFile = new Properties();  //configfile coming from utilities
            configFile.load(input);
            
            
            input.close();
            
        }catch (Exception e) {
            e.printStackTrace();

            
        }
    }
    
    //once it loads getProperty is not null anymore then you can call it to get value by providing key
    
    public static String getProperty (String keyname) {
        
        return configFile.getProperty(keyname);  //keyname is browser //this concept coming from map key and value.
    }}