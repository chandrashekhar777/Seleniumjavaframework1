package com.firstproject.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
public String baseUrl="http://www.facebook.com";
public String username="123456789";
public String password="123456789";
public static WebDriver driver;


@BeforeClass
public void setup()
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}

  @AfterClass
  public void tearDown()
  {
	  driver.quit();
  }

}
