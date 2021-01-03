package com.test.selenium;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		SeleniumTestCases stc = new SeleniumTestCases();
		Properties prop = stc.getPropValues();
		String url = prop.getProperty("sf.url");
		String userId = prop.getProperty("sf.userId");
		String emailId = prop.getProperty("sf.emailId");
		String passId = prop.getProperty("sf.passId");
		String submitId = prop.getProperty("sf.submitId");

		System.out.println("url"+url+"user"+userId+"email"+emailId+"password"+passId);
	//	stc.testCaseOne(url, userId, passId, emailId, submitId);
	//	stc.testCaseTwo();
		// stc.testCaseThree();
	//	stc.testCaseFourA();
	//	stc.testCaseFourB();
		// stc.testCaseFive();
		stc.testCaseSix();
		
		
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://teckarch-dev-ed.my.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
		driver.findElement(By.id("password")).clear();
		// driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("Login")).click();
		*/
	}
}






















/*
//html/body/div[1]/input[2]Absolute path
//input[@ placeholder="Password..." ]
//input[@ id = "password_field"]
// input[@ type = "password"]

driver.findElement(By.xpath("//input[@ placeholder=\"Password...\" ]")).clear();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@ placeholder=\"Password...\" ]")).sendKeys("123");
Thread.sleep(3000);
driver.findElement(By.xpath("// input[@ id = \"password_field\"]")).clear();
Thread.sleep(3000);
driver.findElement(By.xpath("// input[@ id = \"password_field\"]")).sendKeys("123");
Thread.sleep(3000);
driver.findElement(By.xpath(" // input[@ type = \"password\"]")).clear();
Thread.sleep(3000);
driver.findElement(By.xpath(" // input[@ type = \"password\"]")).sendKeys("admin123");
Thread.sleep(3000);
//div[@id=login_div]/h3
System.out.println(driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText());
System.out.println(driver.findElement(By.xpath("//h3")).getText());
driver.findElement(By.xpath("// button[contains(text(),'Login to Account')]")).click();
Thread.sleep(3000);
*/
