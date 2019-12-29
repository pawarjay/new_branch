package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class kapoor {

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
	  
		@BeforeTest
	  public void openBrowser() {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\rahul\\chromedriver_win32\\chromedriver.exe");
			chrome = new ChromeDriver();
			chrome.get("https://opensource-demo.orangehrmlive.com");
			
	  }
		@Test(dataProvider="credentials")
		public void verify(String un,String pwd) throws InterruptedException {
			chrome.findElement(By.name("txtUsername")).sendKeys(un);
			chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
			chrome.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			try
			{
			WebElement error=chrome.findElement(By.id("spamMessage"));
			boolean err=error.isDisplayed();
			if(err)
			{
				System.out.println("invalid!!!!");
			}
			}
	       catch(Exception e)
			{
				chrome.findElement(By.id("welcome")).click();
				Thread.sleep(3000);
				chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
			}
			 chrome.close();
		} 
	 
	
		
}
