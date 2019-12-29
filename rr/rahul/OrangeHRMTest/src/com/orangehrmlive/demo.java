package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\rahul\\chromedriver_win32\\chromedriver.exe");
		//opens the browser window
		ChromeDriver chrome = new ChromeDriver();
		//Enters thr url
		chrome.get("https://opensource-demo.orangehrmlive.com");
		//Locates the username field and pass the data
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		chrome.findElement(By.linkText("Leave")).click();
		WebElement userdd = chrome.findElement(By.id("leaveList_cmbSubunit"));
		
		Select userType = new Select(userdd);
		//userType.selectByIndex(2);
		//usertype.selectByVisibleText"Finance";
		//usertype.selectByValue("");
		/*Thread.sleep(2000);
		chrome.findElement(By.linkText("Admin")).click();
		WebElement userdd = chrome.findElement(By.id("searchSystemUser_userType"));
		
		Select userType = new Select(userdd);
		userType.selectByIndex(2);*/
		
		chrome.findElement(By.id("welcome")).click();
		Thread.sleep(5000);
		chrome.findElementByXPath("//*[@id=\"welcome-menu\"]/ul/li[2]/a").click();

		
	}

}
