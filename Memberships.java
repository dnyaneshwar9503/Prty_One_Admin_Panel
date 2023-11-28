package Admin_Panel;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Memberships {
	WebDriver dr;
  @Test
  public void Login() throws InterruptedException {
  
	  dr.findElement(By.xpath("//input[starts-with(@placeholder,'Email/Username')]")).sendKeys("admin@party.one");
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]")).sendKeys("Password!123");
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//button[contains(text(),'login')]")).click();
	  
	  String a=dr.getTitle();
	  String b="Party One - Admin Panel";
	  Assert.assertEquals(a, b);
	  System.out.println("Login Successfull");
	  Thread.sleep(9000);	
	  //Alert alert = dr.switchTo().alert();
     // alert.dismiss();
	 
  }
  @Test
  public void CreateMemberships() {
	  
	  dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[4]/div[1]")).click();
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("a[href='/active-memberships']")).click();
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("a[href='/create-membership']")).click();
	  dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  
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
