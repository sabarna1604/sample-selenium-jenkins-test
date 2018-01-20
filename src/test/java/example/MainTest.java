package example;

import org.openqa.selenium.WebDriver;
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
	  Assert.assertTrue(title.equals("Googl"));   
  }
  
  @BeforeTest  
  public void beforeTest() {    
     
    driver = new FirefoxDriver();    
  }      
  @AfterTest  
  public void afterTest() {  
    driver.quit();        
    
  }   
}
