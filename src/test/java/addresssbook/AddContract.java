package addresssbook;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AddContract {
	static WebDriver driver = null;
	
	
  @Test
  public void f() {
	  System.out.println("View Details for the Address book");
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver.get("http://localhost/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[@href = './allList.php']")).click();
	  driver.findElement(By.xpath("//input[@value='View Details']")).click();
      driver.findElement(By.xpath("//a[@href='allList.php']")).click();
     driver.findElement(By.xpath("//tbody/tr[3]/td[4]/form[1]/input[2]")).click();
     driver.findElement(By.xpath(null));
     
     driver.wait(10000);
  }
  @AfterClass
  static void CloseAll() throws InterruptedException {
	  
      Thread.sleep(10000);
	  driver.close();
  }
  @SuppressWarnings("unused")
@Test
  void AddressBookAccesMainMenuPage() throws IOException, InterruptedException {
	  String URL = "http://localhost/index.php";
	  String actualTitle = "Address Book";
	  driver.get(URL);
	  String expectedTitle = driver.getTitle();
	  assertEquals(expectedTitle, actualTitle);
	  Thread.sleep(5000);
	  
  }
  
@Test
public void verify() throws Exception {
	
	driver.get("http://localhost/viewEntry.php");
	WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
	String strng = element.getText();
	System.out.println(strng);
	Assert.assertEquals("Business", strng);
	driver.wait(1000);
	
	}



  public void afterMethod() {
	  
	 
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	  
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
