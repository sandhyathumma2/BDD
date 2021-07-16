package com.cg.PagesBeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetails {
	
	@FindBy(how=How.NAME, name="txtFN")
	private WebElement FirstName;
	
	@FindBy(how = How.NAME, name = "txtLN")
	private WebElement LastName;
	
	@FindBy(how=How.NAME, id="txtDebit")
	private WebElement DebitCardNo;
	
	@FindBy(how = How.NAME,id = "txtCvv")
	private WebElement CVV;
	
	@FindBy(how=How.NAME, id="txtMonth")
	private WebElement Exp_Month;
	
	@FindBy(how=How.NAME, id="txtYear")
	private WebElement Exp_Year;
	
	@FindBy(how=How.NAME, xpath="//input[@type='button']")
	private WebElement RegisterButton;
	
	
	public void SetFirstName(String FirstName) {
		this.FirstName.sendKeys(FirstName);
	}
	public void SeLasttName(String LastName) {
		this.LastName.sendKeys(LastName);
	}
	public void SetDebitCardNo(String DebitCardNo) {
		this.DebitCardNo.sendKeys(DebitCardNo);
	}
	public void SetCVV(String CVV) {
		this.CVV.sendKeys(CVV);
	}
	public void SetExpirationMonth(String Exp_Month) {
		this.Exp_Month.sendKeys(Exp_Month);
	}
	public void SetExpirationYear(String Exp_Year) {
		this.Exp_Year.sendKeys(Exp_Year);
	}
	public void RegisterButton() {
		this.RegisterButton.click();
	}
	
	

}
