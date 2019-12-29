package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNGAnnotation {
  ChromeDriver chrome;
  @Test(priority=1)
  public void openBrowser()
  {   
	  System.setProperty("webdriver.chrome.driver", 
			  "D:\\group12Testing\\chromedriver_win32\\chromedriver.exe");
      chrome=new ChromeDriver();
	  chrome.navigate().to("https://opensource-demo.orangehrmlive.com");
	  chrome.manage().window().maximize();
  }
  @Test(priority=2)
  public void loginTest() 
  {
	   
	    chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click(); 
		
  }
  @Test(priority=3)
  public void adminTest() throws InterruptedException 
  {
	  WebElement admin = chrome.findElement(By.linkText("Admin"));
	  Actions mouseHover = new Actions(chrome);
	  mouseHover.moveToElement(admin).build().perform();
	  chrome.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]").click();
	  WebElement job = chrome.findElement(By.linkText("Job"));
	  mouseHover.moveToElement(job).build().perform();
	  chrome.findElementByXPath("//*[@id=\"menu_admin_viewJobTitleList\"]").click();
	  Thread.sleep(3000);
  }

  @Test(priority=4)
  public void isDisplayed() 
  {
	  String ad ="Admin";
	  WebElement Admin = chrome.findElement(By.linkText("Admin"));
	  String admin_link =Admin.getText();
	  if(ad.equals(admin_link))
	  {
		  System.out.println("Admin available");
	  }
	  else
	  {
		  System.out.println("Admin not available");
	  }
  }
  @Test(priority=4)
  public void Displayed() 
  {
	  //String ad ="Admin";
	  WebElement Admin = chrome.findElement(By.linkText("Admin"));
	  //String admin_link =Admin.getText();
	  if(Admin.isDisplayed())
	  {
		  System.out.println("Admin available");
	  }
	  else
	  {
		  System.out.println("Admin not available");
	  }
  }
//  @Test(priority=4)
//  public void pimTest() 
//  {
//	  WebElement PIM = chrome.findElement(By.linkText("PIM"));
//	  Actions mouseHover = new Actions(chrome);
//	  mouseHover.moveToElement(PIM).build().perform();
//	  chrome.findElementByXPath("//*[@id=\"menu_pim_viewEmployeeList\"]").click();
//	  
//  }
  
//  @Test(priority=5)
//  public void leaveTest() 
//  {
//	  WebElement leave = chrome.findElement(By.linkText("leave"));
//	  Actions mouseHover = new Actions(chrome);
//	  mouseHover.moveToElement(leave).build().perform();
//  }

//  @Test(priority=6)
//  public void logoutTest() throws InterruptedException 
//  {
//	  chrome.findElementByXPath("//*[@id=\"welcome\"]").click();
//	  Thread.sleep(3000);
//	  chrome.findElementByXPath("//*[@id=\"welcome-menu\"]/ul/li[2]/a").click(); 
//  }
//  @Test(priority=7)
//  public void closeBrowser() 
//  {
//	  //Thread.sleep(2000);
//	  chrome.close();
//  }
  
}
////*[@id="menu_admin_viewAdminModule"]