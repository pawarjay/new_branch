package com.orangehrmlive;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogTest {
ChromeDriver chrome;

	
	@DataProvider(name="credentials")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
					{"linda.anderson","linda.anderso"},
					{"linda.anderson","linda.anderso"}
				};
	}
	

  @Parameters({"chKey"})
	@BeforeTest
  public void openBrowser(String key) {
	  System.setProperty(key, "D:\\group12Testing\\chromedriver_win32\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com");
		
  }

  @Test(dataProvider="credentials")
  public void loginTest(String un,String pwd) throws Exception
  {
	  chrome.findElement(By.name("txtUsername")).sendKeys(un);
		chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
		chrome.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		String url=chrome.getCurrentUrl();
		System.out.println("URL is"+url);
		System.out.println("Invalid Credentials");
  }
 
  
  @AfterTest
  public void closeBrowser()
  {
	  chrome.close();
  }


}
