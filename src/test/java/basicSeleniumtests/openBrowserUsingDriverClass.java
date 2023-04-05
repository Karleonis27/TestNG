package basicSeleniumtests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BaseClass;

public class openBrowserUsingDriverClass {
	
	@Before 
	public void beforeMethod() {
		BaseClass.getDriver(); // calling method to open browser
		
	}
	
	@Test
	public void test1() {
		String titlePage = BaseClass.getDriver().getTitle();
		System.out.println(titlePage);
		
	}
	@After 
	public void afterMethid() {
		if(driver != null) {}
		driver.quit();
		driver=null;
	}
}
