package com.cg.PagesBeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageBean {
		
	@FindBy(how=How.NAME, id="txtFirstName")
	private WebElement FirstName;
	
	@FindBy(how = How.NAME, id = "txtLastName")
	private WebElement LastName;
	
	@FindBy(how=How.NAME, id="txtEmail")
	private WebElement Email;
	
	@FindBy(how = How.NAME,id = "txtPhone")
	private WebElement ContactNo;
	
	@FindBy(how=How.NAME, xpath="//select[@name='size']")
	private WebElement No_of_people_Att;
	
	@FindBy(how = How.NAME, xpath = "//input[@id='txtAddress1']")
	private WebElement AddLine1;
	
	@FindBy(how = How.NAME, xpath = "//input[@id='txtAddress2']")
	private WebElement AddLine2;
	
	@FindBy(how = How.NAME, xpath = "//select[@name='city']")
	private WebElement City;
	
	@FindBy(how = How.NAME, xpath = "//select[@name='state']")
	private WebElement State;
	
	@FindBy(how = How.NAME, xpath = "(//input[@name='memberStatus'])[1]")
	private WebElement Con_access_1000Rs;
	
	@FindBy(how = How.NAME, name = "(//input[@name='memberStatus'])[2]")
	private WebElement Con_access_1500Rs;
	
	@FindBy(how = How.NAME, linkText= "Next")
	private WebElement Next;
	
	

	//@FindBy(how = How.XPATH, xpath = "/html/body/div[3]/main/div/div[2]/div/div")
	//private WebElement errorMsg;

	//@FindBy(how = How.NAME, name = "commit")
	//private WebElement commit;
	
	public void setFirstName(String firstname) {
		
		this.FirstName.sendKeys(firstname);	
	}
	
	public String getFirstName() {
		return FirstName.getText();
	}
	
	public String getLastName() {
		return LastName.getText();
	}
	public void setLastName(String lastName) {
		this.LastName.sendKeys(lastName);
	}
	public String getEmail() {
		return Email.getText();
	}
	public void setEmail(String email) {
		this.Email.sendKeys(email);
	}
	public WebElement getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		this.ContactNo.sendKeys(contactNo);
	}
	public WebElement getNo_of_people_Att() {
		return No_of_people_Att;
	}
	public void setNo_of_people_Att(String att_people) {
		
		Select sel=new Select(No_of_people_Att);
		sel.selectByVisibleText(att_people);
		
	}
	public String getAddLine1() {
		return AddLine1.getText();
	}
	public void setAddLine1(String addLine1) {
		this.AddLine1.sendKeys(addLine1);
	}
	public String getAddLine2() {
		return AddLine2.getText();
	}
	public void setAddLine2(String addLine2) {
		this.AddLine2.sendKeys(addLine2);
	}
	public void setCity(String city) {

		Select sel=new Select(City);
		sel.selectByVisibleText(city);
	}
	
	
	public void setState(String state) {
		Select sel=new Select(State);
		sel.selectByVisibleText(state);
	}
	public void getCon_access_1000Rs() {
		Con_access_1000Rs.click();
	}
	
	public void getCon_access_1500Rs() {
		Con_access_1500Rs.click();
	}
	
	public void Next_click() {
		Next.click();
	}
	
	public void Alert() {
		
		
	
	}
	

}

	

