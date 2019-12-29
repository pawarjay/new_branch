package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class shahid {

ChromeDriver chrome;
	
	@DataProvider(name="credentials")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
					{"Ad","admin"},
					{"linda.anderson","linda.anderson"}
				};
	}
	

  @org.testng.annotations.Parameters({"chkey"})
	@BeforeTest
  public void openBrowser(String key) {
	  System.setProperty(key, "E:\\rahul\\chromedriver_win32\\chromedriver.exe");
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
  }
  @Test
  public void logoutTest() throws InterruptedException {
	  chrome.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		//chrome.findElement(By.linkText("Logout")).click();
		//chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
  }
  
  @AfterTest
  public void closeBrowser()
  {
	 chrome.close();
  }
}
