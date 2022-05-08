package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EjercicioDos {
  @Test
  public void TestDos() {
		//Test of the second selenium excersise
	    //Creation of the chrome driver
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		//Target URL of the test
		driver.get("https://computer-database.gatling.io/computers");
		//Search the inputs in the url by Xpath
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ASCI Thors Hammer");
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
		driver.findElement(By.xpath("//tbody//tr[1]//td[1]/a")).click();
		//Creation of the Select field to seect an option from the dropdown
		Select Company = new Select( driver.findElement(By.xpath("//select[@id='company']")));
		Company.selectByVisibleText("Apple Inc.");
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		String alert_message = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		//Creation of the assert for the test

		Assert.assertEquals(alert_message, "Done ! Computer "+"ASCI Thors Hammer"+" has been updated");
  }
}
