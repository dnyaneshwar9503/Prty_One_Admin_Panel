package Admin_Panel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Users {
	WebDriver dr;
  @Test
  public void Login() throws InterruptedException {
	  
	  Thread.sleep(2000);
      dr.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin@party.one");
      Thread.sleep(2000);
      dr.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[2]")).sendKeys("Password!123");
      Thread.sleep(2000);
      dr.findElement(By.xpath("//button[contains(text(),'login')]")).click();
      Thread.sleep(5000);
      String m = this.dr.getTitle();
      String n = "Party One - Admin Panel";
      Assert.assertEquals(m, n);
      System.out.println("Login Successfull");
      Thread.sleep(2000);
      
  }
  @Test
  public void Add_User() throws InterruptedException {
	
	  dr.findElement(By.xpath("//div[contains(text(),'users')]")).click();
	  Thread.sleep(1000);
	  
	  
	  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  dr=new ChromeDriver();
	  
	  dr.get("https://box.party.one/");
	  
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
