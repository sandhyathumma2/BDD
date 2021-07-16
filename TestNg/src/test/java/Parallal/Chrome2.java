package Parallal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Chrome2 {
	public WebDriver driver;
	  @BeforeClass
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void fblogin() {
		  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys("sandhya1279@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("9948130484");
		  driver.findElement(By.xpath("//button[@name='login']")).click();
	  }
	  
	  @AfterClass
	  public void tearDown() throws Exception {
		  
		  Thread.sleep(5000);
		  driver.close();
	  }
	  
}
