package com.facebook;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.base.GlobalVariables;
import com.pom.poc.FacebookLoginPage;

public class FacebookLoginTest {
	WebDriver driver;
	Base base;
	FacebookLoginPage facebookLogin;
	// Instancias
	String username, pwd;
	  @BeforeTest
	  public void beforeTest() throws FileNotFoundException {
		  base = new Base(driver);
		  driver = base.setupChromeDriver();
		  facebookLogin = new FacebookLoginPage(driver);
		  //Setup Data
		  this.username = base.getJSONValue("Credentials", "username");
		  this.pwd = base.getJSONValue("Credentials", "password");
	  }

	@Test
	public void tc001() throws InterruptedException {
			
		base.launchBrowser(GlobalVariables.URL);
			
		facebookLogin.loginFacebook(username, pwd);
			
		Assert.assertEquals("Hello", "Hello");
	}

	@Test
	public void tc002() throws InterruptedException {
			
		base.launchBrowser(GlobalVariables.URL);
			
		facebookLogin.loginFacebook(username, pwd);
	}

	@Test
	public void tc003() {
			System.out.println("TC003");
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
