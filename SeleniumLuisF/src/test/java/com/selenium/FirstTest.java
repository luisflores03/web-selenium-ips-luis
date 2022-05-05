package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

  @Test
  public void testo() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		driver.get("https://computer-database.gatling.io/computers");
		//driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ACE");
		//driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
		//String a = driver.findElement(By.xpath("//tbody//tr[1]//td[1]/a")).getText();
		//System.out.println(a);
		//Assert.assertEquals(a, "ACE");
		
		//Test of the first selenium excersise
		//driver.findElement(By.xpath("//a[@id='add']")).click();
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("test");
		//driver.findElement(By.xpath("//input[@id='introduced']")).sendKeys("2021-05-04");
		//driver.findElement(By.xpath("//input[@id='discontinued']")).sendKeys("2022-05-04");
		//Select Company = new Select( driver.findElement(By.xpath("//select[@id='company']")));
		//Company.selectByVisibleText("RCA");
		//driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		//String alert_message = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		//Assert.assertEquals(alert_message, "Done ! Computer "+"test"+" has been created");
		
		//Test of the second selenium excersise
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ASCI Thors Hammer");
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
		driver.findElement(By.xpath("//tbody//tr[1]//td[1]/a")).click();
		Select Company = new Select( driver.findElement(By.xpath("//select[@id='company']")));
		Company.selectByVisibleText("Apple Inc.");
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		String alert_message = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		Assert.assertEquals(alert_message, "Done ! Computer "+"ASCI Thors Hammer"+" has been updated");
  }
}
