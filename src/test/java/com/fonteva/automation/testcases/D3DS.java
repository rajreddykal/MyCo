package com.fonteva.automation.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.fonteva.automation.base.baseTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class D3DS<webelement> extends baseTest {
	/*
	@Test
	public void configurePaymentGatewayWith_3DS_Enabled() throws MalformedURLException, InterruptedException  {
		
		init();
		login();
		//select_Contact();
		try {
			
			test = rep.startTest("configurePaymentGatewayWith_3DS_Enabled");
			test.log(LogStatus.INFO, "click on all tabs");
			driver.findElement(By.id("AllTab_Tab")).click();;
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "select the business group");
			driver.findElement(By.xpath("//*[text()='Business Groups']")).click();
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "select the 3ds Business Group");
			driver.findElement(By.linkText("3ds Business Group")).click();
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1500)", "");
			test.log(LogStatus.INFO, "click edit in New Payment Gateway");
			//driver.findElement(By.xpath("//*[@title = 'New Payment Gateway']")).click();
			driver.findElement(By.xpath(".//*[@id='a0q6A000000lmWH_00N6A000000ZafF_body']/table/tbody/tr[2]/td[1]/a[1]")).click();
			Thread.sleep(5000);
			test.log(LogStatus.INFO, "check the Attempt 3DS checkbox");
			if (!driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/span[1]/label/span[1]")).isEnabled())
			{
				driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/span[1]/label/span[1]")).click();
			}
			Thread.sleep(5000);
			test.log(LogStatus.INFO, "click on Save&Close");
			driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[1]/div/div/span[2]/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(".//*[@id='topButtonRow']/input")).click();
			Thread.sleep(2000);
			takeScreenShot();
		}
		
   catch( Exception e){
			   
			   test.log(LogStatus.FAIL, "test case failed");
			   test.log(LogStatus.INFO,e.getMessage());
			   takeScreenShot();
		   }
	}*/
		@Test
	public void enable_3DS_ForPaymentGatewaySupports_3DS() throws MalformedURLException, InterruptedException {
		
		init();
		login();
		
	try{
			test = rep.startTest("enable_3DS_ForPaymentGatewaySupports_3DS");
			test.log(LogStatus.INFO, "click on all tabs");
			driver.findElement(By.id("AllTab_Tab")).click();;
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "select the business group");
			driver.findElement(By.xpath("//*[text()='Business Groups']")).click();
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "select the 3ds Business Group");
			driver.findElement(By.linkText("3ds Business Group")).click();
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1500)", "");
			Thread.sleep(1500);
			test.log(LogStatus.INFO, "click on New Payment Gateway in Payment Gateways");
			driver.findElement(By.xpath("//*[@title = 'New Payment Gateway']")).click();
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "enter a Payment Gateway name");
			driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div/input")).sendKeys("Raj Test");
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "select Gateway Type as Cardstream");
			List <WebElement> ls= driver.findElements(By.xpath(".//*[@id='lightning']/div/div/div/div[2]/div[1]/div[4]/div/div[2]/div[2]/div/div/div/div/div[1]/input")).click();
			Thread.sleep(2500);
			//driver.findElement(By.xpath(".//*[@id='lightning']/div/div/div/div[2]/div[1]/div[4]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[12]")).sendKeys(Keys.ENTER);
			ls.getvalue
			Thread.sleep(4000);
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("window.scrollBy(0,1500)", "");
			Thread.sleep(1500);
			test.log(LogStatus.INFO, "check the Attempt 3DS checkbox");
			if (!driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/span[1]/label/span[1]")).isEnabled())
			{
				driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/span[1]/label/span[1]")).click();
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='topButtonRow']/input")).click();
			Thread.sleep(2000);
			takeScreenShot();
		}
	  catch( Exception e){
		   
		   test.log(LogStatus.FAIL, "test case failed");
		   test.log(LogStatus.INFO,e.getMessage());
		   takeScreenShot();
	   }	
			
		}
			
	 /*  public void enable_3DS_ForPaymentGatewayThaDoesNotSupport_3DS() {
		   

			init();
			login();
			
		try{
				test = rep.startTest("enable_3DS_ForPaymentGatewaySupports_3DS");
				test.log(LogStatus.INFO, "click on all tabs");
				driver.findElement(By.id("AllTab_Tab")).click();;
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "select the business group");
				driver.findElement(By.xpath("//*[text()='Business Groups']")).click();
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "select the 3ds Business Group");
				driver.findElement(By.linkText("3ds Business Group")).click();
				Thread.sleep(4000);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,1500)", "");
				Thread.sleep(1500);
				test.log(LogStatus.INFO, "click on New Payment Gateway in Payment Gateways");
				driver.findElement(By.xpath("//*[@title = 'New Payment Gateway']")).click();
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "enter a Payment Gateway name");
				driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div/input")).sendKeys("Raj Test");
				Thread.sleep(4000);
				test.log(LogStatus.INFO, "select Gateway Type as Cardstream");
				driver.findElement(By.xpath(".//*[@id='lightning']/div/div/div/div[2]/div[1]/div[4]/div/div[2]/div[2]/div/div/div/div/div[1]/input")).click();
				Thread.sleep(2500);
	//change    driver.findElement(By.xpath(".//*[@id='lightning']/div/div/div/div[2]/div[1]/div[4]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]")).click();
				Thread.sleep(4000);
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse2.executeScript("window.scrollBy(0,1500)", "");
				Thread.sleep(1500);
	//change    test.log(LogStatus.INFO, "check the Attempt 3DS checkbox");
				if (!driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/span[1]/label/span[1]")).isEnabled())
				{
					driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/span[1]/label/span[1]")).click();
				}
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='topButtonRow']/input")).click();
				Thread.sleep(2000);
				takeScreenShot();
			}
		  catch( Exception e){
			   
			   test.log(LogStatus.FAIL, "test case failed");
			   test.log(LogStatus.INFO,e.getMessage());
			   takeScreenShot();
		   }	
				
			}
		   
	   */
	
    @AfterMethod
    public void exit(){
    	driver.close();
    	rep.endTest(test);
		rep.flush();
    }
}
	   
		
	

