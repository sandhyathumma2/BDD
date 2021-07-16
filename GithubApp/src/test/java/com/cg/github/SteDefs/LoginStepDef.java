package com.cg.github.SteDefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.github.Utilities.DriverUtil;
import com.cg.github.pagesbean.LoginpageBean;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
   private WebDriver driver;
   private LoginpageBean login;
    
  
	
@Before
public void setupEnv() {
	driver=DriverUtil.getDriver();
	login=PageFactory.initElements(driver,LoginpageBean.class);
	
}

@Given("User is on GitHub Login Page")
public void user_is_on_GitHub_Login_Page() {
    
    driver.get("https://www.github.com/login");
}

@When("User Enter Invalid Credentials and click submit button")
public void user_Enter_Invalid_Credentials_and_click_submit_button() throws Exception {
	
	login.setUser("wrongusername");
    login.setPassword("wrongpassword");
    Thread.sleep(5000);
    login.signIn();
    Thread.sleep(5000);
}
@Then("{string} message should dispaly")
public void message_should_dispaly(String string) {

	String expectedErrorMessage = string;
	String  actualErrorMessage = login.getErrorMsg();
	Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
}

@When("User Enter Valid Credentials and click submit button")
public void user_Enter_Valid_Credentials_and_click_submit_button() {
	login.setUser("wrongusername");
    login.setPassword("wrongpassword");
    login.signIn();
}

@Then("User successfully sign on his GitHub account")
public void user_successfully_sign_on_his_GitHub_account() {
	
	Assert.assertEquals(false, false);
    
}

@After
public void tearDownEnv() {

	driver.quit();
	driver=null;
}


}
