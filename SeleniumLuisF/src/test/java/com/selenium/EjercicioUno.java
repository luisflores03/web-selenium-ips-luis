package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EjercicioUno {
  @Test
  public void TestUno() {
		//Test of the first selenium exercise
	  //Creation of the chrome driver
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		//Target URL of the test
		driver.get("https://computer-database.gatling.io/computers");
		//Search the inputs in the url by Xpath
		driver.findElement(By.xpath("//a[@id='add']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='introduced']")).sendKeys("2021-05-04");
		driver.findElement(By.xpath("//input[@id='discontinued']")).sendKeys("2022-05-04");
		//Creation of the Select field to seect an option from the dropdown
		Select Company = new Select( driver.findElement(By.xpath("//select[@id='company']")));
		Company.selectByVisibleText("RCA");
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		//Creation of the assert for the test
		String alert_message = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		Assert.assertEquals(alert_message, "Done ! Computer "+"test"+" has been created");
		driver.close();
  }
}
