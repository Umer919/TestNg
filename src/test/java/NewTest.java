import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver = null;
	
	
  @Test
  public void f() {
	  System.out.println("Hello This is Test1");
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver.get("http://localhost/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[@href = './allList.php']")).click();
	  driver.wait();
	  driver.close();
	  
		  
  }

  @AfterMethod
  public void afterMethod() {
	 
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
