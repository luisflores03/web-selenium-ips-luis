package com.pom.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.base.Base;

public class AddComputerPage extends Base {
	public AddComputerPage(WebDriver driver) {
		super(driver);
	}
	//Objects
	By addComputer = By.xpath("//a[@id='add']");
	By txtName = By.xpath("//input[@id='name']");
	By txtIntroduced = By.xpath("//input[@id='introduced']");
	By txtDiscontinued = By.xpath("//input[@id='discontinued']");
	By drpCompany = By.xpath("//select[@id='company']");
	By btnSubmit = By.xpath("//input[@class='btn primary']");
	By alert = By.xpath("//div[@class='alert-message warning']");
	By srcComputer = By.xpath("//input[@id='searchbox']");
	By srcSubmit = By.xpath("//input[@id='searchsubmit']");
	By selectSearch = By.xpath("//tbody//tr[1]//td[1]/a");
	//customize methods
	public String addComputer(String Name, String Introduced, String Discontinued, String Company) throws InterruptedException{
		waitForElementPresent(addComputer);
		click(addComputer);
		waitForElementPresent(btnSubmit);
		type(txtName,Name);
		type(txtIntroduced,Introduced);
		type(txtDiscontinued,Discontinued);
		dropdown(drpCompany,Company);
		click(btnSubmit);
		waitForElementPresent(alert);
		String alertMessage = read(alert);
		return alertMessage;
	}
	public String updateComputer(String Name,String Company) throws InterruptedException{
		waitForElementPresent(srcComputer);
		type(srcComputer,Name);
		click(srcSubmit);
		waitForElementPresent(selectSearch);
		click(selectSearch);
		waitForElementPresent(drpCompany);
		dropdown(drpCompany,Company);
		click(btnSubmit);
		String alertMessage = read(alert);
		return alertMessage;
	}
}
