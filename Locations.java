package Admin_Panel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Locations {
	WebDriver dr;
	
  @Test
  public void Login() throws InterruptedException {
	  
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin@party.one");
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[2]")).sendKeys("Password!123");
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//button[contains(text(),'login')]")).click();
	  Thread.sleep(1000);
	  
	  String a=dr.getTitle();
	  String b="Party One - Admin Panel";
	  Assert.assertEquals(a, b);
	  System.out.println("Login Successfull");
  }
  
  @Test
  public void Add_Country() throws InterruptedException {
	 Thread.sleep(1000);
	 //Select location=new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[8]/div[1]/div[1]/div[2]")));
	 //location.selectByIndex(0);
	 /*Select loc= new Select (dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[9]/div[1]/div[1]/div[2]/div[2]/i[1]")));
	 Thread.sleep(1000);
	 loc.selectByVisibleText("Country");*/

	 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[9]/div[1]/div[1]/div[2]")).click();
	 Thread.sleep(1000);
	
	 dr.findElement(By.xpath("//a[normalize-space()='Country']")).click();
	 Thread.sleep(1000);
	 dr.findElement(By.xpath("//a[normalize-space()='Add Country']")).click();
	 Thread.sleep(2000);
	 
	 WebElement CountryImage = dr.findElement(By.xpath("//input[@id='display_image']"));
	 CountryImage.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images\\Bangkok.jpg");
	 
	 dr.findElement(By.xpath("//input[@id='latitude']")).sendKeys("26.8206");
	 Thread.sleep(1000);
	 dr.findElement(By.xpath("//input[@id='longitude']")).sendKeys("26.8206");
	 Thread.sleep(1000);
	 dr.findElement(By.id("cityName")).sendKeys("Egypt");
	 Thread.sleep(1000);
	 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/div[5]/input[1]")).sendKeys("+39");
	 Thread.sleep(1000);
	 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/button[1]")).click();
	 Thread.sleep(1000);
	   
  }
  
  @Test
  public void Update_Country() throws InterruptedException {
	  
	  dr.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/button[1]/i[1]")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
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
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  dr=new ChromeDriver();
	  
	  String a="https://box.party.one/";
	  dr.get(a);
	  //dr.manage().window().maximize();
     dr.getTitle();
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
