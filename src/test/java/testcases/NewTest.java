package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("rad")).sendKeys("20");
	 // driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	  driver.findElement(By.id("btnp1")).click();
	 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.navigate().back();
   }
   //TestNG
  @Test
  public void h() {
	  driver.findElement(By.id("btna2")).click();
	// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.navigate().back();
  }
  @Test
  public void i() {
	  driver.findElement(By.id("btnd3")).click();
	 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.navigate().back();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost:8082/Sample/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
