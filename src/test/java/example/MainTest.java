package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
	private WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://google.in");
	  String title = driver.getTitle();      
	  Assert.assertTrue(title.equals("Google")); 
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.get("http://facebook.com");
	  Assert.assertTrue(driver.getTitle().contains("Facebook"));
  }
  
  @BeforeTest  
  public void beforeTest() {    
	  System.setProperty("webdriver.chrome.driver", "/home/kaushik/");
    driver = new ChromeDriver();    
  }      
  @AfterTest  
  public void afterTest() {  
    driver.quit();        
    
  }   
}
