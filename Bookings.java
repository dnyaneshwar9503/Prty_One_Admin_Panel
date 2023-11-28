package Admin_Panel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bookings {
	WebDriver dr;
  @Test
  public void Login() throws InterruptedException {
	  
	  dr.findElement(By.xpath("//input[starts-with(@placeholder,'Email/Username')]")).sendKeys("admin@party.one");
	  //dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]")).sendKeys("Password!123");
	  //dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//button[contains(text(),'login')]")).click();
	  
	  String a=dr.getTitle();
	  String b="Party One - Admin Panel";
	  Assert.assertEquals(a, b);
	  System.out.println("Login Successfull");
	  Thread.sleep(9000);	
	  //Alert alert = dr.switchTo().alert();
     // alert.dismiss();
  }
  
  @Test(invocationCount = 30, description="Verify whether the pending booking will be accepted or not")
  public void PendingTableBookings() throws InterruptedException {
	  
	 
	 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[3]/a[1]/div[1]")).click();
	 //dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 Thread.sleep(1000);
	 
	 
	 dr.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]/i[1]")).click();
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 dr.findElement(By.xpath("//button[@id='status']")).click();
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/label[1]")).click();
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 dr.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 
	 dr.findElement(By.xpath("//tbody/tr[1]/td[14]/a[1]")).click();
	 //Thread.sleep(3000);
	 
	 //WebDriverWait wait = new WebDriverWait(dr, null);
	 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/button[2]")));
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 dr.findElement(By.xpath("//button[contains(@class,'px-5 text-white text-md font-body cursor-pointer background-lightgreen py-3 px-4 radius-105 border-0 d-inline-block')]")).click();
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 dr.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/input[1]")).click();
	 dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 dr.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	 //dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	 Thread.sleep(4000);
	 }
 
  @Test(invocationCount = 30)
  public void PendingEventBooking() throws InterruptedException {
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[3]/a[1]/div[1]")).click();

	  dr.findElement(By.xpath("//div[contains(text(),'Entry Bookings')]")).click();
	  Thread.sleep(1000);
	  
	  dr.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]/i[1]")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//button[@id='status']")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/label[1]")).click();
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		 Thread.sleep(2000);
		 
		 dr.findElement(By.xpath("//tbody/tr[1]/td[14]/a[1]")).click();
		 Thread.sleep(3000);
		 dr.findElement(By.xpath("//button[contains(@class,'px-5 text-white text-md font-body cursor-pointer background-lightgreen py-3 px-4 radius-105 border-0 d-inline-block')]")).click();
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/input[1]")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		 Thread.sleep(5000);
	  
  }

  @Test(invocationCount = 30)
  public void PendingEntryBooking() throws InterruptedException {
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[3]/a[1]/div[1]")).click();

	  dr.findElement(By.xpath("//div[contains(text(),'Event Booking')]")).click();
	  Thread.sleep(1000);
	  
	  	dr.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]/i[1]")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//button[@id='status']")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/label[1]")).click();
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		 Thread.sleep(2000);
		 
		 dr.findElement(By.xpath("//tbody/tr[1]/td[14]/a[1]")).click();
		 Thread.sleep(3000);
		 dr.findElement(By.xpath("//button[contains(@class,'px-5 text-white text-md font-body cursor-pointer background-lightgreen py-3 px-4 radius-105 border-0 d-inline-block')]")).click();
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/input[1]")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		 Thread.sleep(5000);
  }
	 
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  //ChromeOptions options = new ChromeOptions();
	 // options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  dr=new ChromeDriver();
	  
	  String a="https://box.party.one/";
	  dr.get(a);
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.manage().window().maximize();
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
