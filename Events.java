package Admin_Panel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Events {
	WebDriver dr;
  @Test(priority=1 ,description="Verify that users can successfully log in to their accounts using valid credentials.")
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
      
      Alert alert = dr.switchTo().alert();
      alert.dismiss();
      
  }
  
  @Test(priority=2 , description="Verify that users can add Event in a specific club")
  public void Add_Event() throws InterruptedException {
	  Thread.sleep(2000);
	  
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[7]/a[1]/div[1]")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/a[1]")).click();
	  Thread.sleep(2000);
	  
	  /*
	  String Clubname="Unwind";
	  int count=0;
	  
	  Thread.sleep(2000);
	  dr.findElement(By.id("club_name")).sendKeys("Unwind");
	  Thread.sleep(3000);
	 List<WebElement> optionslist = dr.findElements(By.xpath("//ul[@class='po-updateEvent_clubList']/li"));
	  Thread.sleep(3000);
	 for(WebElement ele:optionslist) {
		 
		 String currentoption=ele.getText();
		 
		 if(currentoption.contains(Clubname)) {
			 ele.click();
			 count++;
			 break;			
		 }
	 }
	 if(count!=0) {
		 System.out.println(Clubname + "has been selected in the DD");
	 }
	 else {
		 System.out.println("Option you want to select is not available in DD");
	 }
	 */
	  
	  dr.findElement(By.id("club_name")).sendKeys("Unwind");
	  Thread.sleep(3000);
	  dr.findElement(By.xpath("//span[normalize-space()='Unwind']")).click();
	  Thread.sleep(2000);
	  
	  dr.findElement(By.xpath("//input[@id='event_name']")).sendKeys("ENIGMA");
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//input[@name='description']")).sendKeys("ENIGMA Special Event");
	  Thread.sleep(1000);
	  
	  Select EventType = new Select(dr.findElement(By.id("event_type")));
	  EventType.selectByIndex(2);
	  
	  Thread.sleep(1000);
	  WebElement datepicker = dr.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"));
	  datepicker.sendKeys("09/10/2023");
	  datepicker.sendKeys(Keys.TAB);
	 
	  Thread.sleep(1000);
	  
	  dr.findElement(By.id("event_timing")).sendKeys("200000");
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//input[@id='entry_per_head']")).sendKeys("500");
	  Thread.sleep(1000);
	  
	  WebElement EventBanner = dr.findElement(By.xpath("//input[@id='image']"));
	  EventBanner.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images\\ENIGMA.png");
	  Thread.sleep(2000);
	  
	  WebElement EventPhoto = dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[9]/div[1]/input[1]"));
	  EventPhoto.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images\\event 1.jfif");
  
	  dr.findElement(By.xpath("//input[@id='status']")).click();
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(5000);
	  
  }
  
  @Test(priority = 3 , description="Verify that users can update the Event in a specific club")
  public void Edit_Event() throws InterruptedException {
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[7]/a[1]/div[1]/div[2]")).click();
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]/i[1]")).click();
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/a[1]")).click();
	  Thread.sleep(1000);
	  
	  WebElement CN = dr.findElement(By.id("club_name"));
	  CN.clear();
	  CN.sendKeys("Vault");
	  Thread.sleep(3000);
	  dr.findElement(By.xpath("//span[normalize-space()='Vault']")).click();
	  Thread.sleep(2000);
	  
	  WebElement EventName =dr.findElement(By.xpath("//input[@id='event_name']"));
	  EventName.clear();
	  EventName.sendKeys("Nakhra - Big Friday Bollywood Night");
	  Thread.sleep(1000);
	  
	  WebElement EventDescription = dr.findElement(By.xpath("//input[@name='description']"));
	  EventDescription.clear();
	  EventDescription.sendKeys("Nakhra - Big Friday Bollywood Night");
	  Thread.sleep(1000);
	  
	  Select EventType1 = new Select(dr.findElement(By.id("event_type")));
	  EventType1.selectByIndex(1);
	  
	  Thread.sleep(1000);
	  WebElement datepicker1 = dr.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"));
	  datepicker1.clear();
	  datepicker1.sendKeys("09/10/2023");
	  datepicker1.sendKeys(Keys.TAB);
	 
	  Thread.sleep(1000);
	  
	  dr.findElement(By.id("event_timing")).sendKeys("233000");
	  Thread.sleep(1000);
	  
	  WebElement EntryFee = dr.findElement(By.xpath("//input[@id='entry_per_head']"));
	  EntryFee.clear();
	  EntryFee.sendKeys("550");
	  Thread.sleep(1000);
	  
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[8]/div[1]/div[1]/span[1]")).click();
	  Thread.sleep(2000);
	  
	  WebElement EventBanner1 = dr.findElement(By.xpath("//input[@id='image']"));
	  EventBanner1.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images\\thirsty party.png");
	  Thread.sleep(2000);
	  
	  WebElement EventPhoto1 = dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[9]/div[1]/input[1]"));
	  EventPhoto1.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images\\thirsty party.png");
  
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[11]/button[1]")).click();
	  Thread.sleep(5000);
	  
  }
  
  @Test(priority = 4 , description="Verify that users can delete the Event or not")
  public void Delete_Event() throws InterruptedException {
	Thread.sleep(1000);  
	  
	dr.findElement(By.xpath("//div[contains(text(),'Events')]")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
	
  
  
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
