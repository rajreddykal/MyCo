/* Direct Debit payments automation scripts 
 * -Akash
 */
package com.fonteva.automation.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.fonteva.automation.base.baseTest;
import com.relevantcodes.extentreports.LogStatus;


public class directDebit extends baseTest {
		   
	   /* Purchase dd item using existing mandate */
	   @Test
	   public void selectItemWithDD_Existingmandate() throws InterruptedException, MalformedURLException{
		   init();
		   login();
		   select_Contact();
		   try{
		   test = rep.startTest("selectItemWithDD_Existingmandate");
		   test.log(LogStatus.INFO, "Test Scenario - Pay for item by using an existing mandate");
		   test.log(LogStatus.INFO, "goto - store");
		   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "select - direct debit item");
		   driver.findElement(By.xpath("//*[contains(text(),'SM DD Mug')]")).click();  /* change the name of the item */
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "click - add to cart");
		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
		   Thread.sleep(10000);
		   test.log(LogStatus.INFO, "click - check out");
		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		   Thread.sleep(10000);
		   test.log(LogStatus.INFO, "select -  Direct debit payment method");
		   //driver.findElement(By.xpath("//*[text()='Direct Debit']")).click();
		   Thread.sleep(5000);
		   test.log(LogStatus.INFO, "select - setup direct debit");
		   driver.findElement(By.xpath("//*[@class='btn btn-success btn-block additional-payment-btn']")).click();
		   Thread.sleep(5000);
		   test.log(LogStatus.INFO, "enter - date: " + prop.getProperty("Date"));
		   Select date = new Select(driver.findElement(By.xpath("html/body//div[1]/div/div[2]/div/div[2]/div[2]/div/div/select")));
		   date.selectByValue(prop.getProperty("Date"));	
		   Thread.sleep(5000);
		   test.log(LogStatus.INFO, "enter - mandate " + prop.getProperty("Mandate"));
		   Select mandate = new Select(driver.findElement(By.xpath("html/body//div[2]/div/div[2]/div/div[2]/div[2]/div/div/select")));
		   mandate.selectByValue(prop.getProperty("Mandate"));	
		   Thread.sleep(5000);
		   test.log(LogStatus.INFO, "click - use existing mandate");
		   driver.findElement(By.xpath("//*[@class='slds-button slds-button--success FrameworkButton']")).click();		  
		   Thread.sleep(10000);
		   takeScreenShot();
		   test.log(LogStatus.PASS, "test case passed");
		   }
		   catch( Exception e){
			   
			   test.log(LogStatus.FAIL, "test case failed");
			   test.log(LogStatus.INFO,e.getMessage());
			   takeScreenShot();
		   }
	   }
	   
	   /* Purchase dd item using new mandate */
	   @Test
	   public void selectItemWithDD_Newmandate() throws InterruptedException, MalformedURLException{
		   init();
		   login();
		   select_Contact();
		   try{
		   test = rep.startTest("selectItemWithDD_Newmandate");
		   test.log(LogStatus.INFO, "Test Scenario - Pay for item by using a new mandate");
		   test.log(LogStatus.INFO, "goto - store");
		   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "select - direct debit item");
		   driver.findElement(By.xpath("//*[contains(text(),'SM DD Mug')]")).click();  /* change the name of the item */
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "click - add to cart");
		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
		   Thread.sleep(10000);
		   test.log(LogStatus.INFO, "click - check out");
		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		   Thread.sleep(10000);
		   test.log(LogStatus.INFO, "select -  Direct debit payment method");
		   driver.findElement(By.xpath("//*[text()='Direct Debit']")).click();
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "select - setup direct debit");
		   driver.findElement(By.xpath("//*[@class='btn btn-success btn-block additional-payment-btn']")).click();
		   Thread.sleep(3000);
		   test.log(LogStatus.INFO, "switch - setup new mandate");
		   driver.findElement(By.xpath("//label[@class='slds-radio--button__label' and @for='Setup New Mandate']")).click(); 
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "select - setup new mandate");
		   driver.findElement(By.xpath("//*[@class='slds-button slds-button--success FrameworkButton' and contains(text(),'Setup New Mandate')]")).click();
		   Thread.sleep(4000);
		   test.log(LogStatus.INFO, "enter - branchcode:  " + prop.getProperty("BranchCode"));
		   driver.findElement(By.xpath("//*[@id='customer_bank_accounts_branch_code']")).sendKeys(prop.getProperty("BranchCode"));
		   Thread.sleep(2000);
		   test.log(LogStatus.INFO, "enter - accountnumber: " + prop.getProperty("AccountNumber"));
		   driver.findElement(By.xpath("//*[@id='customer_bank_accounts_account_number']")).sendKeys(prop.getProperty("AccountNumber"));
		   Thread.sleep(2000);
		   test.log(LogStatus.INFO, "select - confirm");
		   driver.findElement(By.xpath("//*[@class='btn btn--primary btn--large']")).click();
		   Thread.sleep(3000);
		   test.log(LogStatus.INFO, "select - confirm");
		   driver.findElement(By.xpath("//*[@id='confirm-limit']")).click();
		   Thread.sleep(3000);
		   test.log(LogStatus.INFO, "enter - date: "+ prop.getProperty("Date"));
		   Select date = new Select(driver.findElement(By.xpath("html/body//div[1]/div/div[2]/div/div[2]/div[2]/div/div/select")));
		   date.selectByValue(prop.getProperty("Date"));	
		   Thread.sleep(2000);
		   test.log(LogStatus.INFO, "select - confirm");
		   driver.findElement(By.xpath("//*[text()='Confirm']")).click();
		   Thread.sleep(10000);	
		   takeScreenShot();
		   }
		   catch(Exception e){
			  test.log(LogStatus.FAIL, "test case failed");
			  test.log(LogStatus.INFO, e.getMessage());
			  takeScreenShot();
		   }
	   }
	       
	    /* Purchase dd subscription item using existing mandate */
	    @Test(dependsOnMethods = { "select_Contact" })
        public void selectSubscriptionWithDD_Existingmandate() throws InterruptedException{
	    	   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[contains(text(),'AR Membership-1')]")).click();  /* change the name of the Membership */
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
			   Thread.sleep(10000);
			   driver.findElement(By.xpath("//*[@id='a1R6A000000hid8UAA']")).click();   /* change subscription plan */
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[@id='nextTabButton']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[@id='nextTabButton']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[text()='Direct Debit']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@class='btn btn-success btn-block additional-payment-btn']")).click();
			   Thread.sleep(2000);
			   Select date = new Select(driver.findElement(By.xpath("html/body//div[1]/div/div[2]/div/div[2]/div[2]/div/div/select")));
			   date.selectByValue(prop.getProperty("Date"));	
			   Thread.sleep(2000);
			   Select mandate = new Select(driver.findElement(By.xpath("html/body//div[2]/div/div[2]/div/div[2]/div[2]/div/div/select")));
			   mandate.selectByValue(prop.getProperty("Mandate"));	
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@class='slds-button slds-button--success FrameworkButton']")).click();		  
			   Thread.sleep(10000);	   
	       }
	       
	    /* Purchase dd subscription item using new mandate */
	    @Test(dependsOnMethods = { "select_Contact" })
	    public void selectSubscriptionWithDD_Newmandate() throws InterruptedException{
	    	   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[contains(text(),'AR Membership-1')]")).click();  /* change the name of the Membership */
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
			   Thread.sleep(10000);
			   driver.findElement(By.xpath("//*[@id='a1R6A000000hid8UAA']")).click();   /* change subscription plan */
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[@id='nextTabButton']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[@id='nextTabButton']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[text()='Direct Debit']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@class='btn btn-success btn-block additional-payment-btn']")).click();
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//label[@class='slds-radio--button__label' and @for='Setup New Mandate']")).click(); 
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[@class='slds-button slds-button--success FrameworkButton' and contains(text(),'Setup New Mandate')]")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.xpath("//*[@id='customer_bank_accounts_branch_code']")).sendKeys(prop.getProperty("BranchCode"));
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id='customer_bank_accounts_account_number']")).sendKeys(prop.getProperty("AccountNumber"));
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@class='btn btn--primary btn--large']")).click();
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//*[@id='confirm-limit']")).click();
			   Thread.sleep(3000);
			   Select date = new Select(driver.findElement(By.xpath("html/body//div[1]/div/div[2]/div/div[2]/div[2]/div/div/select")));
			   date.selectByValue(prop.getProperty("Date"));	
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[text()='Confirm']")).click();
			   Thread.sleep(10000);    	   
	       }
	           
	       /* Purchase dd item and non dd item using credit card */
           @Test(dependsOnMethods = { "select_Contact" })
           public void selectDDItems_Creditcard() throws InterruptedException{
            	   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[contains(text(),'SM DD Mug')]")).click();  /* change the name of the item */
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[contains(text(),'Hat')]")).click();  /* change the name of the item */
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Credit Card']")).click();
        		   Thread.sleep(5000);
        		   driver.findElement(By.xpath("//*[@id='credit_card_number']")).sendKeys(prop.getProperty("CreditcardNumber"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='credit_card_month']")).sendKeys(prop.getProperty("Month"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='credit_card_year']")).sendKeys(prop.getProperty("Year"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='submit']")).click();
        		   Thread.sleep(7000);    		 
               }
               
           /* Purchase dd item and non dd item using Echeck */
               @Test
               public void selectItems_Echeck() throws InterruptedException{
            	   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[contains(text(),'SM DD Mug')]")).click();  /* change the name of the item */
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[contains(text(),'Hat')]")).click();  /* change the name of the item */
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='eCheck']")).click();
        		   Thread.sleep(5000);
        		   driver.findElement(By.xpath("//*[@id='bank_name']")).sendKeys(prop.getProperty("BankName"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='bank_routing_number']")).sendKeys(prop.getProperty("RountingNumber"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='bank_account_number']")).sendKeys(prop.getProperty("Accountnumber"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='submit']")).click();
        		   Thread.sleep(7000);
            	   
               }
                
               /* Check payment receipt opening new tab*/ 
               @Test(dependsOnMethods = { "select_Contact" })
               public void click_Receipt() throws InterruptedException{
            	   driver.findElement(By.xpath("//*[text()='Direct Debit Payment Methods']")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[text()='0000000084']")).click();  /* change the number of the receipt */
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[text()='0000000033']")).click();
        		   Thread.sleep(10000);
               }
               
               
               /* purchasing item with dd enabled and non dd item using new mandate and credit card */
               @Test(dependsOnMethods = { "select_Contact" })
               public void selectItems_NewMandate() throws InterruptedException{
            	   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[contains(text(),'SM DD Mug')]")).click();  /* change the name of the item */
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[contains(text(),'Store')]")).click();
        		   Thread.sleep(4000);
        		   driver.findElement(By.xpath("//*[contains(text(),'Hat')]")).click();  /* change the name of the item */
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Direct Debit']")).click();
    			   Thread.sleep(2000);
    			   driver.findElement(By.xpath("//*[@class='btn btn-success btn-block additional-payment-btn']")).click();
    			   Thread.sleep(3000);
    			   driver.findElement(By.xpath("//label[@class='slds-radio--button__label' and @for='Setup New Mandate']")).click(); 
    			   Thread.sleep(4000);
    			   driver.findElement(By.xpath("//*[@class='slds-button slds-button--success FrameworkButton' and contains(text(),'Setup New Mandate')]")).click();
    			   Thread.sleep(4000);
    			   driver.findElement(By.xpath("//*[@id='customer_bank_accounts_branch_code']")).sendKeys(prop.getProperty("BranchCode"));
    			   Thread.sleep(2000);
    			   driver.findElement(By.xpath("//*[@id='customer_bank_accounts_account_number']")).sendKeys(prop.getProperty("AccountNumber"));
    			   Thread.sleep(2000);
    			   driver.findElement(By.xpath("//*[@class='btn btn--primary btn--large']")).click();
    			   Thread.sleep(3000);
    			   driver.findElement(By.xpath("//*[@id='confirm-limit']")).click();
    			   Thread.sleep(3000);
    			   Select date = new Select(driver.findElement(By.xpath("html/body//div[1]/div/div[2]/div/div[2]/div[2]/div/div/select")));
    			   date.selectByValue(prop.getProperty("Date"));	
    			   Thread.sleep(2000);
    			   driver.findElement(By.xpath("//*[text()='Confirm']")).click();
    			   Thread.sleep(10000);
    			   driver.findElement(By.xpath("//*[@id='shoppingcart-show']")).click();
    			   Thread.sleep(4000);
    			   driver.findElement(By.xpath("//*[text()='Checkout']")).click();
        		   Thread.sleep(10000);
        		   driver.findElement(By.xpath("//*[text()='Credit Card']")).click();
        		   Thread.sleep(5000);
        		   driver.findElement(By.xpath("//*[@id='credit_card_number']")).sendKeys(prop.getProperty("CreditcardNumber"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='credit_card_month']")).sendKeys(prop.getProperty("Month"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='credit_card_year']")).sendKeys(prop.getProperty("Year"));
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("//*[@id='submit']")).click();
        		   Thread.sleep(10000);			   
               }
               
               
	       
	   
	 @AfterMethod
	    public void exit(){
	    	driver.close();
	    	rep.endTest(test);
			rep.flush();
	    }
}