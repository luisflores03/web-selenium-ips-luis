package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	private WebDriver driver;
	
	/**
	 * Constructor SeleniumWrapper Class 
	 * @author Luis Flores 
	 * @param driver
	 * @return N/A
	 * @throws N/A
	 * @date 08/05/2022
	 */
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Creation of the chrome driver
	 * @author Luis Flores 
	 * @param N/A
	 * @return driver
	 * @throws N/A
	 * @date 08/05/2022
	 */
	public WebDriver setupChromeDriver(){
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}
	
	/*
	 * Launch browser
	 * @author Luis Flores
	 * @param URL
	 * @return
	 * @throws
	 * @date 08/05/2022
	 */
	public void launchBrowser(String url) {
		driver.get(url);
		driver.manage().window().fullscreen();
	}

	/*
	 * Type text into text box object
	 * @author Luis Flores
	 * @param locator
	 * @param inputText
	 * @return
	 * @throws
	 * @date 08/05/2022
	 */
	public void type(By locator, String inputText) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/*
	 * Select option in Select element
	 * @author Luis Flores
	 * @param locator
	 * @param inputText
	 * @return
	 * @throws
	 * @date 08/05/2022
	 */
	public void dropdown(By locator, String inputText) {
		Select select = new Select( driver.findElement(locator));
		select.selectByVisibleText(inputText);
	}
	
	/*
	 * Click object
	 * @author Luis Flores
	 * @param locator
	 * @return
	 * @throws
	 * @date 08/05/2022
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/*
	 * Read object
	 * @author Luis Flores
	 * @param locator
	 * @return
	 * @throws
	 * @date 08/05/2022
	 */
	public String read(By locator) {
		String alertMessage = driver.findElement(locator).getText();
		return alertMessage;
	}
	
	/*
	 * close driver
	 * @author Luis Flores
	 * @param
	 * @return
	 * @throws
	 * @date 08/05/2022
	 */
	public void closeDriver() {
		driver.close();
	}
	
	/**
	 * Get Data from JSON file
	 * @author Luis Flores
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 * @date 08/05/2022
	 */
	public String getJSONValue(String JSONFile, String JSONKey) throws FileNotFoundException {
		try {
			//JSON object creation
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + JSONFile + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			//JSON data extraction
			String jsonValue = (String) jsonObject.get(JSONKey);
			return jsonValue;
		}catch(FileNotFoundException e) {
			Assert.fail("Fail.JSON file not found");
			return null;
		}
	}
	
	/**
	 * Implicitly await
	 * @author Luis Flores
	 * @param seconds
	 * @return 
	 * @throws 
	 * @date 08/05/2022
	 */
	public void implicitlyWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch(TimeoutException e) {
			e.printStackTrace();
	}
		}
	/**
	 * Explicitly await
	 * @author Luis Flores
	 * @param locator
	 * @return 
	 * @throws Timeout Exception
	 * @date 08/05/2022
	 */
	public void waitForElementPresent(By locator) throws TimeoutException{
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e){
			e.printStackTrace();
		}
	}
}
