package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 {
	ChromeDriver chrome;
  @Test(priority = 1)
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\rahul\\chromedriver_win32\\chromedriver.exe");
		//opens the browser window
		 chrome = new ChromeDriver();
		//Enters thr url
		chrome.get("https://opensource-demo.orangehrmlive.com");
		chrome.manage().window().maximize();// for maximize the url window
  }
  
  @Test(priority = 2)
  public void loginTest() {
		//Locates the username field and pass the data
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
	
  }
  @Test(priority = 3)
  public void isDisplayed() {
	     String ad="Admin";
	     String p="PIM";
	     String l="Lea";
	     String t="Time";
	   //  String r="Recruitement";
	    // String pr="Performance";
	    // String d="Dashboard";
	   //  String dr="Directory";
	    // String m="Maintainance";
		 WebElement admin= chrome.findElement(By.linkText("Admin"));
		 if(admin.isDisplayed())
		 {
		  
			 String ad_link = admin.getText();
		 
		 
		
		// WebElement rec= chrome.findElement(By.linkText("Recruitement"));
		// String r_link = rec.getText();
		// WebElement per= chrome.findElement(By.linkText("Performance"));
		// String pr_link = per.getText();
		// WebElement das= chrome.findElement(By.linkText("Dashboard"));
		// String d_link = das.getText();
		// WebElement dir= chrome.findElement(By.linkText("Directory"));
		// String dr_link = dir.getText();
		// WebElement main= chrome.findElement(By.linkText("Maintainance"));
		// String m_link = main.getText();
		 if(ad.equals(ad_link))
		 {System.out.println("displayed");
			 System.out.println("Admin is Available.!!!");
		 }
		 else {
			 System.out.println("Admin is not Available.!!!");
		 }
		 }
		 else
		 {
			 System.out.println("not displayed");
		 }
		 WebElement pim= chrome.findElement(By.linkText("PIM"));
		 String p_link = pim.getText();
		 if(p.equals(p_link))
		 {
			 System.out.println("PIM is Available.!!!");
		 }
		 else {
			 System.out.println("PIM is not Available.!!!");
		 }
		 WebElement leave= chrome.findElement(By.linkText("Leave"));
		 if(leave.isDisplayed())
		 {
		  
		 String l_link = leave.getText();
		 if(l.equals(l_link))
		 {
			 System.out.println("displayed");
			 System.out.println("Leave is Available.!!!");
			 
		 }
		 else {
			 System.out.println("Leave is not Available.!!!");
			 
		 }
		 }
		 else
		 {
			 System.out.println(" leave not displayed");
		 }
		 WebElement time= chrome.findElement(By.linkText("Time"));
		 String t_link = time.getText();
		 if(t.equals(t_link))
		 {
			 System.out.println("Time is Available.!!!");
		 }
		 else {
			 System.out.println("Time is not Available.!!!");
		 }
		 
	  }
  @Test(priority = 4)
  public void adminTest() {
	  WebElement admin = chrome.findElement(By.linkText("Admin"));
		
		
		Actions mouseHover = new Actions(chrome);
		mouseHover.moveToElement(admin).build().perform();
		
		WebElement job = chrome.findElement(By.linkText("Job"));
		mouseHover.moveToElement(job).build().perform();
  }
  @Test(priority = 5)
  public void pimTest() {
	  WebElement pim = chrome.findElement(By.linkText("PIM"));
		
	  
		Actions mouseHover = new Actions(chrome);
		mouseHover.moveToElement(pim).build().perform();
  }

  @Test(priority = 6)
  public void logoutTest() throws InterruptedException {
	  chrome.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		//chrome.findElement(By.linkText("Logout")).click();
		//chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
  }
  @Test(priority = 7)
  public void closeBrowser() {
	 chrome.close();
  }
  
}
