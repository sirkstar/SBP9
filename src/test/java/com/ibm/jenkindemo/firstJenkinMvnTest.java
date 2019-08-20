package com.ibm.jenkindemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class firstJenkinMvnTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  String pgeTitle = driver.getTitle();
	  System.out.println("The Page Title is: "+pgeTitle);
  }
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://www.google.com");
  }

  @AfterTest
  public void teardown() {
	  driver.quit();
  }

}
