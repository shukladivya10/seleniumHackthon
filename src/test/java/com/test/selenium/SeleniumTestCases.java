package com.test.selenium;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestCases {

		private Properties newTab;


		public void testCaseOne(String url, String userId, String passId, String emailId, String submitId){
			WebDriver driver = null;
			try {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://teckarch-dev-ed.my.salesforce.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
			driver.findElement(By.id("password")).sendKeys("admin123");
			driver.findElement(By.id("Login")).click();
			}catch(Exception e) {
				System.out.println("Exception: " + e);
			}  finally{
			//	driver.quit();
			}
		}
public void testCaseTwo() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseThree() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.id("userNav")).click();
	driver.findElement(By.linkText("Logout")).click();  
	driver.findElement(By.id("rememberUn")).click();
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}
public void testCaseFourA() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
    driver.findElement(By.id("forgot_password_link")).click();
    driver.findElement(By.id("un")).sendKeys("divyass@abc.com");
    driver.findElement(By.id("continue")).click();
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseFourB() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("123");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("22131");
	driver.findElement(By.id("Login")).click();
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseFive() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseSix() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.id("userNav")).click();
	driver.findElement(By.linkText("My Profile")).click(); 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")).click();
	Thread.sleep(2000);
	 driver.switchTo().window((String) newTab.get(0));
	    assertAdvertisingBlog();

	
			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

private void assertAdvertisingBlog() {
	// TODO Auto-generated method stub
	
}
public void testCaseSeven() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.id("userNav")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("My Settings")).click(); 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/div[2]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(" //span[@id='EmailSettings_font']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("sender_name")).clear();
	driver.findElement(By.id("sender_name")).sendKeys("Divya Shukla");
	Thread.sleep(2000);
	driver.findElement(By.id("sender_email")).clear();
	driver.findElement(By.id("sender_email")).sendKeys("divyashukla.mba@gmail.com");
	Thread.sleep(2000);
	/*List <WebElement> radio_button = extracted(driver);
	boolean bValue;
	bValue = radio_button.get(1).isSelected();
	if (bValue==false) 
	{
	radio_button.get(1).click();	
	}
	else
	{
		System.out.println("it is already selected");
		
	}
	Thread.sleep(2000);*/
	driver.findElement(By.xpath("//input[@title='Save']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
	Thread.sleep(2000);
	Select customApp = new Select(driver.findElement(By.id("p4")));
	customApp.selectByVisibleText("Salesforce Chatter");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='report']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@title='Add']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Save']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('CalendarAndReminders');\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
	
	driver.findElement(By.xpath("//input[@id='testbtn']")).click();
	//  driver.quit();
 
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
		
	}
	
}

public void testCaseEight() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.id("userNav")).click();
	driver.findElement(By.linkText("Developer Console")).click(); 
	driver.switchTo().activeElement();
	
			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseNine() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.id("userNav")).click();
	driver.findElement(By.linkText("Logout")).click(); 

			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseTen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
	driver.findElement(By.xpath("//input[@title='New']")).click();
	

			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseEleven() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
	driver.findElement(By.xpath("//input[@title='New']")).click();
	

			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseTwelve() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("dialogClose")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@title='New']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.className("dialogClose")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
	Select view = new Select(driver.findElement(By.id("fcf")));
	view.selectByVisibleText("All Accounts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Go!']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Edit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fname")).clear();
    driver.findElement(By.id("fname")).sendKeys("All Accounts 2021");
    Thread.sleep(2000);
    Select field = new Select(driver.findElement(By.id("fcol1")));
	field.selectByVisibleText("Account Name");
	Thread.sleep(2000);
	 Select opr = new Select(driver.findElement(By.id("fop1")));
	opr.selectByVisibleText("contains");
		Thread.sleep(2000);
  //  driver.findElement(By.id("fval1-components")).sendKeys("abcd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
    Thread.sleep(2000);
    
    
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseThirteen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@title='New']")).click();
	driver.findElement(By.className("dialogClose")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Merge Accounts']")).click();
	driver.findElement(By.id("srch")).clear();
	driver.findElement(By.id("srch")).sendKeys("RSSBank");
	driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
	driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Next']")).click();
	driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Merge']")).click();
	Thread.sleep(2000);
	
	

			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseFourteen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@title='New']")).click();
	driver.findElement(By.className("dialogClose")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Accounts with last activity > 30 days']")).click();
	Thread.sleep(2000);
	// Select field = new Select(driver.findElement(By.id("ext-gen150")));
	//field.selectByVisibleText("All Time");
	driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Today']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ext-comp-1045")).clear();
	driver.findElement(By.id("ext-comp-1045")).sendKeys("1/20/2021");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
	driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("TestReport1");
	driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Save and Run Report']")).click();

			
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseFifteen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//select[@id='fcf']")).click();	
	
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}

public void testCaseSixteen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='createNewButton']")).click();
	driver.findElement(By.xpath("//a[@class='opportunityMru menuButtonMenuLink']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("opp3")).sendKeys("Opportunity jan 2020");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='opp4_lkwgt']")).click();
	driver.findElement(By.xpath("This element is in iframe - //a[normalize-space()='abcd account']")).click();
	Thread.sleep(2000);
	
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}
public void testCaseSeventeen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Opportunity Pipeline']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}
	
public void testCaseEighteen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Stuck Opportunities']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}
public void testCaseNineteen() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(3000);
	Select interval = new Select(driver.findElement(By.id("quarter_q")));
	interval.selectByVisibleText("Next FQ");
	Thread.sleep(2000);
	Select include = new Select(driver.findElement(By.id("open")));
	include.selectByVisibleText("Open Opportunities");
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwenty() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentyone() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='fcf']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	
public void testCaseTwentytwo() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	Select view1 = new Select(driver.findElement(By.id("fcf")));
	view1.selectByVisibleText("My Unread Leads");
	//driver.findElement(By.xpath("//select[@id='fcf']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("userNav")).click();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Go!']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	
public void testCaseTwentythree() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	Select view1 = new Select(driver.findElement(By.id("fcf")));
	view1.selectByVisibleText("Today's Leads");
	Thread.sleep(2000);
	
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentyfour() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='New']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
	driver.findElement(By.id("lea3")).sendKeys("ABCD");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentyfive() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='New']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("name_lastcon2")).sendKeys("Shukla");
	driver.findElement(By.id("con4")).sendKeys("abcd account");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentysix() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fname")).sendKeys("Niharika");
	driver.findElement(By.id("devname")).sendKeys("Niharika");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentyseven() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	Select recent = new Select(driver.findElement(By.id("hotlist_mode")));
	recent.selectByVisibleText("Recently Created");
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentyeight() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	Select view2 = new Select(driver.findElement(By.id("fcf")));
	view2.selectByVisibleText("My Contacts");
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseTwentynine() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	Select view2 = new Select(driver.findElement(By.id("fcf")));
	view2.selectByVisibleText("My Contacts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Shukla, Anil']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseThirty() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("devname")).sendKeys("EFGH");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseThirtyone() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fname")).sendKeys("ABCD");
	driver.findElement(By.id("devname")).sendKeys("EFGH");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public void testCaseThirtytwo() {
	WebDriver driver = null;
	try {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://teckarch-dev-ed.my.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("tryLexDialogX")).click();
    driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='New']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
	driver.findElement(By.id("con4")).sendKeys("Global Media");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']")).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Exception: " + e);
	}  finally{
	//	driver.quit();
	}
	
}	

public Properties getPropValues() throws IOException {
			InputStream inputStream = null; 
			Properties prop = null;
			try {
			    prop = new Properties();
				String propFileName = "input.properties";
	 
			    inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	 
				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
				}
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				inputStream.close();
			}
			return prop;
		}

}
