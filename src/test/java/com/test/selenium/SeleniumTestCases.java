package com.test.selenium;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestCases {

		public void testCaseOne(String url, String userId, String passId, String emailId, String submitId){
			WebDriver driver = null;
			try {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://teckarch-dev-ed.my.salesforce.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("divyass@abc.com");
			driver.findElement(By.id("password")).sendKeys("admin123");
			driver.findElement(By.id("password")).clear();
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
