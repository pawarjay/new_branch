package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginLogoutTest {
	ChromeDriver chrome;
	@DataProvider(name="credentials")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
					{"linda.anderson","linda.anderso"},
					{"linda.anderson","linda.anderson"},
					{"linda.anderson","linda.anderso"}
				};
	}
	

	@BeforeTest
    public void openBrowser() {
	    System.setProperty("webdriver.chrome.driver", "D:\\group12Testing\\chromedriver_win32\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com");
		chrome.manage().window().maximize();
                   }

  @Test(dataProvider="credentials")
  public void loginTest(String un,String pwd) throws Exception
  {
	  chrome.findElement(By.name("txtUsername")).sendKeys(un);
	  chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
	  chrome.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  try
	  {
		  WebElement error=chrome.findElementByXPath("//*[@id=\"spanMessage\"]");
		  boolean err =error.isDisplayed();
		  if(err)
		  {
			  System.out.println("Invalid Credentials");
		  }
	  }
	  
	  catch(Exception e)
	  {
		  chrome.findElementByXPath("//*[@id=\"welcome\"]").click();
		  Thread.sleep(3000);
		  chrome.findElementByXPath("//*[@id=\"welcome-menu\"]/ul/li[2]/a").click();
		  System.out.println("Successfully Logout"); 
	  }
	  
		
  }
  @AfterTest
  public void closeBrowser()
  {
	  chrome.close();
  }
}
