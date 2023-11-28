package Admin_Panel;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Clubs {
	WebDriver dr;

	
  @Test(priority = 0)
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
	  
	  //dr.switchTo().alert().dismiss();
	  //Alert alert= dr.switchTo().alert();
	  //alert.dismiss(); 
	  }
  
  @Test(priority =1)
  public void Add_Club() throws InterruptedException, IOException {
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//div[contains(text(),'clubs')]")).click();
	  Thread.sleep(1000);
	  
	 String c=dr.getTitle();
	 String d="Party One - Admin Panel";
	 Assert.assertEquals(c, d);
	 System.out.println("Clubs Listing");
	dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/a[1]")).click();
	Thread.sleep(1000);
	
	FileInputStream f=new FileInputStream("C:\\Selenium\\TestNG\\Dnyaneshwar\\src\\Admin_Panel\\Admin_Panel_Credentials\\credential.properties");
	Properties p=new Properties();
	p.load(f);
	
	dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(p.getProperty("clubname"));
	Thread.sleep(1000);
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(p.getProperty("phonenumber"));
	dr.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//input[@name='enterManagerName']")).sendKeys(p.getProperty("clubmanagername"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys(p.getProperty("managerphonenumber"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//input[@name='enterEmailId']")).sendKeys(p.getProperty("email"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//input[@name='websiteName']")).sendKeys(p.getProperty("websitename"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//input[@name='dresscode']")).sendKeys(p.getProperty("dresscode"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	WebElement clublogo= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[10]/div[1]/div[1]/input[1]"));
	clublogo.sendKeys(p.getProperty("clublogo"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	WebElement clubcoverimage= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[11]/div[1]/div[1]/input[1]"));
	clubcoverimage.sendKeys(p.getProperty("clubcoverimage"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	WebElement clubphoto= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[12]/div[1]/input[1]"));
	clubphoto.sendKeys(p.getProperty("clubphoto"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[15]/textarea[1]")).sendKeys(p.getProperty("clubdescription"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	dr.findElement(By.xpath("//input[@name='mondayTitle']")).sendKeys("Monday Nightlife");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Tuesday");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).sendKeys("Wednsday");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/input[1]")).sendKeys("Thursday");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Friday");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Saturday");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/input[1]")).sendKeys("Sunday");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	Select Country=new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/select[1]")));
	Country.selectByVisibleText("India");
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	Select State= new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[2]/select[1]")));
	State.selectByVisibleText("Maharashtra");
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	Select City= new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[1]/select[1]")));
	City.selectByVisibleText("Pune");
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[2]/input[1]")).sendKeys(p.getProperty("Address"));
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys("2100PM");
	dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	dr.findElement(By.xpath("//button[contains(text(),'Add Table Entity')]")).click();
	
	
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[5]/pre[1]")).sendKeys("Terms");
	
	//WebElement Terms1=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[5]/pre[1]"));
	//Terms1.sendKeys("Terms");
	//Thread.sleep(2000);
	dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[5]/div[2]/div[1]/button[1]")).click();
	Thread.sleep(3000);
	//dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[6]/a[1]/div[1]/div[2]")).click();
	//Thread.sleep(3000);
  }
  
  @Test(priority = 2)
  
  public void edit_club() throws InterruptedException {
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]")).click();
	  dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  dr.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	  dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  
	  WebElement clubname=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"));
	  Thread.sleep(1000);
	  clubname.clear();
	  Thread.sleep(2000);
	  clubname.sendKeys("Asilo");
	  
	  WebElement phonenumber=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/input[1]"));
	  Thread.sleep(2000);
	  phonenumber.clear();
	  Thread.sleep(2000);
	  phonenumber.sendKeys("9359289830");
	  
	  WebElement clubmanagername=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[4]/input[1]"));
	  clubmanagername.clear();
	  Thread.sleep(1000);
	  clubmanagername.sendKeys("David");
	  
	  WebElement managerphonenumber=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/input[1]"));
	  Thread.sleep(1000);
	  managerphonenumber.clear();
	  Thread.sleep(1000);
	  managerphonenumber.sendKeys("9359289830");
	  
	  WebElement email=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[6]/input[1]"));
	  Thread.sleep(1000);
	  email.clear();
	  Thread.sleep(1000);
	  email.sendKeys("dnyaneshwar@exdera.com");
	  
	  WebElement website=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[7]/input[1]"));
	  website.clear();
	  website.sendKeys("www.google.com");
	  
	  WebElement dresscode=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[8]/input[1]"));
	  dresscode.clear();
	  dresscode.sendKeys("Smart Casual");
	  
	  WebElement clublogo= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[10]/div[1]/div[1]/input[1]"));
	  clublogo.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images");
	  dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		WebElement clubcoverimage= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[10]/div[1]/div[1]/input[1]"));
		clubcoverimage.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		WebElement clubphoto= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[12]/div[1]/div[1]/input[1]"));
		clubphoto.sendKeys("C:\\Users\\DESKTOP-VGEOHOV\\Desktop\\Automation Images");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	 WebElement description = dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[15]/textarea[1]"));
	 description.clear();
	 description.sendKeys("Top-floor cocktail lounge featuring a long bar & menu of small plates, plus DJ shows & city views.");
	 dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	 WebElement mondaytitle=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
	 mondaytitle.clear();
	 Thread.sleep(1000);
	 mondaytitle.sendKeys("DJ Night");
	 
	 dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Tuesday");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).sendKeys("Wednsday");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/input[1]")).sendKeys("Thursday");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Friday");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Saturday");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/input[1]")).sendKeys("Sunday");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]/input[1]")).sendKeys("2000PM");
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[3]/input[1]")).sendKeys("0200AM");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		Select Country=new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/select[1]")));
		Country.selectByVisibleText("India");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		Select State= new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[2]/select[1]")));
		State.selectByVisibleText("Maharashtra");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		Select City= new Select(dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[1]/select[1]")));
		City.selectByVisibleText("Mumbai");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[2]/input[1]")).sendKeys("Mumbai");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys("2200PM");
		dr.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[contains(text(),'Add Table Entity')]")).click();
		
		WebElement Terms=dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[2]/div[6]"));
		Terms.sendKeys("Terms and Conditions");
		
		dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/div[5]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
  }
  
  @Test(priority = 3)
  public void delete_club() throws InterruptedException {
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/aside[1]/ul[1]/li[6]/a[1]/div[1]/div[2]")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	  Thread.sleep(2000);
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
