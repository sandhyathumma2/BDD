package com.cg.StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.PagesBeans.PaymentDetails;
import com.cg.utilies.DriverUtil1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PaymentDetailsStepDef {
	
  private WebDriver driver;
  private PaymentDetails payment;
	
	@Before
	public void SetEnv() {
	driver=DriverUtil1.getDriver1();
	payment=PageFactory.initElements(driver, PaymentDetails.class);	
	}
	
	@Given("User is on payment Details Page")
	public void user_is_on_payment_Details_Page() throws InterruptedException {		
		driver.get("file:/C:/Users/dasar/OneDrive/Desktop/All_Notes/BDDNotes/ConferenceBooking/PaymentDetails.html");
		Thread.sleep(5000);
	}


	@When("user enter All Fields {string},{string},{string},{string},{string},{string} with valid data")
	public void user_enter_All_Fields_sandhyaRani_Thumma_with_valid_data(String FirstName, String LastName, String DebitCardNumber,
			String CVV,  String Expirationmonth , String ExpirationYear) {
		
		payment.SetFirstName(FirstName);
		payment.SeLasttName(LastName);
		payment.SetDebitCardNo(DebitCardNumber);
		payment.SetCVV(CVV);
		payment.SetExpirationMonth(Expirationmonth);
		payment.SetExpirationYear(ExpirationYear);
			
	   }

	@When("user click on Register Button")
	public void user_click_on_Register_Button() throws InterruptedException {	
	
		payment.RegisterButton();
	
	   
	}

	@Then("user validate {string} message should dispalyed")
	public void user_validate_message_should_dispalyed(String string) {
		
		String expected_msg=string;
		String Actual_msg=DriverUtil1.alert(driver).getText();
		//String Actual_msg=driver.switchTo().alert().getText();
		Assert.assertEquals(expected_msg, Actual_msg);
		DriverUtil1.alert(driver).accept();
	}
	
	@After
	public void tearDownEnv1() throws Throwable {

	//	Thread.sleep(5000);
		driver.quit();
		driver=null;
	}



}
