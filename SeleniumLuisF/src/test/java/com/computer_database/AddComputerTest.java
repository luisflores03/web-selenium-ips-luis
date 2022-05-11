package com.computer_database;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.base.GlobalVariables;
import com.pom.poc.AddComputerPage;

public class AddComputerTest {
	WebDriver driver;
	Base base;
	AddComputerPage computerPage;
	//Instancias
	String name,introduced,discontinued,company,alert,updateName,updateCompany,updateAlert;
	  @BeforeTest
	  public void beforeTest() throws FileNotFoundException{
		  base = new Base(driver);
		  driver = base.setupChromeDriver();
		  computerPage = new AddComputerPage(driver);
		  //Setup data
		  this.name = base.getJSONValue("testdata", "name");
		  this.introduced = base.getJSONValue("testdata", "introduced");
		  this.discontinued = base.getJSONValue("testdata", "discontinued");
		  this.company = base.getJSONValue("testdata", "company");
		  this.alert = base.getJSONValue("testdata", "AlertMessage");
		  this.updateName = base.getJSONValue("testdata", "updateName");
		  this.updateCompany = base.getJSONValue("testdata", "updateCompany");
		  this.updateAlert = base.getJSONValue("testdata", "alertMessageUpdate");
	  }
	  @Test
	  public void TC001() throws InterruptedException{
		  base.launchBrowser(GlobalVariables.URL);
		  String alertMessage=computerPage.addComputer(name, introduced, discontinued, company);
		  Assert.assertEquals(alertMessage, alert);
	  }
	  @Test
	  public void TC002() throws InterruptedException{
		  base.launchBrowser(GlobalVariables.URL);
		  String alertMessage =computerPage.updateComputer(updateName, updateCompany); 
		  Assert.assertEquals(alertMessage, updateAlert);
		  
	  }
	  @AfterTest
	  public void afterTest() {
	  	driver.close();
	  }

}
