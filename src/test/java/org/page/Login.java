package org.page;

import org.base.BaseClassCreation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClassCreation {
	public void hello()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id ="password")
	private WebElement txtUserPwd;
	
	
	@FindBy (id="login")
	private WebElement btnLogin;


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtUserPwd() {
		return txtUserPwd;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}


	
}
