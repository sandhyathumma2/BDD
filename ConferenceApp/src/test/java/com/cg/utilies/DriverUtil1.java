package com.cg.utilies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DriverUtil1 {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static WebDriver getDriver1() {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		return driver;
		
		}
	
	public static Alert alert(WebDriver driver) {
		
		wait=new WebDriverWait(driver, 10);
	    return driver.switchTo().alert();
	    
	     
	
	}
	}
