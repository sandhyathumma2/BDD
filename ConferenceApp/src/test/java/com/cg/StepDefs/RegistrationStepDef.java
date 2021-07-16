package com.cg.StepDefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.PagesBeans.RegistrationPageBean;
import com.cg.utilies.DriverUtil1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegistrationStepDef {
	
	private WebDriver driver;
	private RegistrationPageBean RegBean;
	 
    @Before
	public void setupEnv1() {
	     driver= DriverUtil1.getDriver1();
	    RegBean= PageFactory.initElements(driver, RegistrationPageBean.class);
		
	}
	
	@Given("User is on Conference Registration Login Page")
	public void user_is_on_Conference_Registration_Login_Page() throws InterruptedException {
	//driver.get("https://facebook.com");
		
	 driver.get("file:/C:/Users/dasar/OneDrive/Desktop/All_Notes/BDDNotes/ConferenceBooking/ConferenceRegistartion.html");
	 Thread.sleep(5000);
	}
	
	@When("User is Click on Next Link")
	public void user_is_Click_on_Next_Link_Without_Enter_data() {
		RegBean.Next_click();
	   
	}

	@Then("{string} Error message should display")
	public void error_message_should_display1(String string) throws Exception {
		
		String expectederrormessage=string;
		Alert alert=driver.switchTo().alert();
		String Actualerrormessage=alert.getText();
		Assert.assertEquals(Actualerrormessage, expectederrormessage, Actualerrormessage);
		alert.accept(); 
		
	}

	@When("User Enter First Name {string} cick on Next Link")
	public void user_Enter_First_Name_cick_on_Next_Link(String string) {
	RegBean.setFirstName(string);  
	RegBean.Next_click();
	
	}


	@When("User Enter LastName {string} cick on Next Link")
	public void user_Enter_LastName_cick_on_Next_Link(String string) {
		RegBean.setLastName(string);  
		RegBean.Next_click(); 
	}

	

	@When("User Enter Email {string} cick on Next Link")
	public void user_Enter_Email_cick_on_Next_Link(String string) {
		RegBean.setEmail(string);  
		RegBean.Next_click(); 
	}

	
	@When("User Enter Contact No {string} cick on Next Link")
	public void user_Enter_Contact_No_cick_on_Next_Link(String string) {
		RegBean.setContactNo(string);  
		RegBean.Next_click(); 
	}

	

	@When("User Enter No.Of people attending {string} cick on Next Link")
	public void user_Enter_No_Of_people_attending_cick_on_Next_Link(String string) {
	    
		RegBean.setNo_of_people_Att(string); 
		RegBean.Next_click(); 
	}

	

	@When("User Enter AddressLine1 {string} cick on Next Link")
	public void user_Enter_AddressLine1_cick_on_Next_Link(String string) {
		RegBean.setAddLine1(string); 
		RegBean.Next_click(); 
	}

	

	@When("User Enter AddressLin2 {string} cick on Next Link")
	public void user_Enter_AddressLin2_cick_on_Next_Link(String string) {
		RegBean.setAddLine2(string); 
		RegBean.Next_click(); 
	}

	

	@When("User select city  {string} cick on Next Link")
	public void user_select_city_cick_on_Next_Link(String string) {
		RegBean.setCity(string); 
		RegBean.Next_click(); 
	}

	

	@When("User select State  {string} cick on Next Link")
	public void user_select_State_cick_on_Next_Link(String string) {
		RegBean.setState(string); 
		RegBean.Next_click();
	}

	
	@When("User select Conference full-Access\\(member){int} Rs.cick on Next Link")
	public void user_select_Conference_full_Access_member_Rs_cick_on_Next_Link(Integer int1) {
		RegBean.getCon_access_1000Rs();
		RegBean.Next_click();
	}

	@When("user sucessfully validate {string} message should display")
	public void user_sucessfully_validate_message_should_display(String string) {
		String expectederrormessage=string;
		Alert alert=driver.switchTo().alert();
		String Actualerrormessage=alert.getText();
		Assert.assertEquals(expectederrormessage,Actualerrormessage);
		alert.accept();  
	}
	
	@When("User Enter {string} FirstName")
	public void user_Enter_FirstName(String string) {
	   
	}

	@When("User Enter  {string} LastName")
	public void user_Enter_LastName(String string) {
	  
	}

	@When("User Enter  {string} Email")
	public void user_Enter_Email(String string) {
	    
	}

	@When("User Enter  {string} ContactNo")
	public void user_Enter_ContactNo(String string) {
	  
	}

	@When("User Enter  {string} No.of.people.attending")
	public void user_Enter_No_of_people_attending(String string) {
	    
	}

	@When("User Enter  {string} StreetAddressLine1")
	public void user_Enter_StreetAddressLine1(String string) {
	   
	}

	@When("User Enter  {string} StreetAddressLine2")
	public void user_Enter_StreetAddressLine2(String string) {
	   
	}

	@When("User select  {string} city")
	public void user_select_city(String string) {
	    
	}

	@When("User select  {string} state")
	public void user_select_state(String string) {
	    
	}

	@When("User select  Conferencefull-Access\\(member){int} Conferencefull-Access\\(member)")
	public void user_select_Conferencefull_Access_member_Conferencefull_Access_member(Integer int1) {
	  
	}

	@When("User click on Next link")
	public void user_click_on_Next_link() {
	    
	}



	@After
	public void tearDownEnv1() {

		driver.quit();
		driver=null;
	}



}
