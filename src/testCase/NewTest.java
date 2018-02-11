package testCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "H:\\Source code\\Java\\AutomationTestNg\\lib\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		driver.get("http://www.store.demoqa.com");
			
	  }
  @Test
  public void f() throws InterruptedException {
		
	
	System.out.println("Page Title is :"+driver.getTitle());
	
	System.out.println("Page length is :"+driver.getTitle().length());
	
	if(driver.getCurrentUrl().equalsIgnoreCase("http://www.store.demoqa.com")){
		
		System.out.println("Title matches");
		
		
	}
	else{
		System.out.println("Title doesnt match");
	}
	
	
	System.out.println("page source length is :"+driver.getPageSource().length());
	
	
	Thread.sleep(5);
	
	driver.navigate().refresh();
	
  
  }
  

  @AfterTest
  public void afterTest() {
	  
	driver.quit();
  }

}
