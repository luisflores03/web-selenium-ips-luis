package com.pom.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.base.Base;

public class FacebookLoginPage extends Base{
	public FacebookLoginPage(WebDriver driver) {
		super (driver);
	}
	// Objects
	By txtEmail = By.id("email");
	By txtPwd = By.id("pass");
	By btnLogin = By.xpath("//button[@name='login']");
	// Customize methods
	public void loginFacebook(String email, String pwd) throws InterruptedException {
		waitForElementPresent(btnLogin);
		type(txtEmail, email);
		type(txtPwd, pwd);
		click(btnLogin);
	}
}
