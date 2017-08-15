package com.fonteva.automation.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class baseTest {
	public ExtentReports rep;
	public ExtentTest test;
	public static WebDriver driver;
	public static Properties prop;

    public void init() throws MalformedURLException{
    	if(prop ==null)
		{
			prop = new Properties();
			try {
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//Configuration//config.properties");
				try {
					prop.load(fs);
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			rep = ExtentManager.getInstance();
		}
    	//setting up the default firefox profile and initializing the chrome.
	    // System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers/geckodriver");
	     System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers/geckodriver.exe");
	     //driver = new ChromeDriver();
	      driver = new FirefoxDriver();   
	    //setting the configuration
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		}
    
     public void login() throws MalformedURLException, InterruptedException{		   

		   driver.get("https://login.salesforce.com/");
		   driver.findElement(By.xpath("//*[@id='username']")).sendKeys(prop.getProperty("username_3DS"));
		   driver.findElement(By.xpath("//*[@id='password']")).sendKeys(prop.getProperty("password_3DS"));
		   driver.findElement(By.xpath("//*[@id='Login']")).click();
		   Thread.sleep(5000);		
	  }
	
	 public void select_Contact() throws InterruptedException{
		   driver.findElement(By.xpath("//*[text()='Contacts']")).click();
		   //driver.findElement(By.xpath("//*[text()='Kamandula, Avinash']")).click();    /* change the name of the user */
		  
		   driver.findElement(By.xpath("//*[@id='workWithPortalLabel']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id='workWithPortalMenu']/a[4]")).click();
		   Thread.sleep(7000);
	   }
       
    public void takeScreenShot(){
		Date d = new Date();
		String filename = d.toString().replace(":","_").replace(" ","_")+".png";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//"+filename));
		}
		catch(Exception e)
		{
			
		}
		
		test.log(LogStatus.INFO,"Screenshot->"+test.addScreenCapture(System.getProperty("user.dir")+"//screenshots//"+filename));
    }	
    
    
	
}
