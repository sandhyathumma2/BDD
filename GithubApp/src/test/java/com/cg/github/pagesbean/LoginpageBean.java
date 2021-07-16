package com.cg.github.pagesbean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginpageBean {
	
	@FindBy(how=How.NAME, name="login")
	private WebElement user;
	@FindBy(how = How.NAME, name = "password")
	private WebElement password;

	@FindBy(how = How.XPATH, xpath = "/html/body/div[3]/main/div/div[2]/div/div")
	private WebElement errorMsg;

	@FindBy(how = How.NAME, name = "commit")
	private WebElement commit;

	public String getUser() {
		return user.getText();
	}

	public void setUser(String user) {
		this.user.sendKeys(user);
	}

	public String getPassword() {
		return password.getText();
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public String getErrorMsg() {
		return errorMsg.getText();
	}
	
	public void signIn() {
		commit.submit();
	}
}

