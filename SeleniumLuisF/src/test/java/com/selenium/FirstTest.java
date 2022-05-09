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
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ACE");
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
		String a = driver.findElement(By.xpath("//tbody//tr[1]//td[1]/a")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "ACE");
		driver.close();
		
  }
}
