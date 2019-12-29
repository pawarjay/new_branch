package com.orangehrmlive;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\group12Testing\\chromedriver_win32\\chromedriver.exe");
		//opens the browser window
		ChromeDriver chrome = new ChromeDriver();
		//Enter the url
		chrome.navigate().to("https://opensource-demo.orangehrmlive.com");
		chrome.manage().window().maximize();
		//Locates the username field and pass the data
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		WebElement admin = chrome.findElement(By.linkText("Admin"));
		
		
		Actions mouseHover = new Actions(chrome);
		mouseHover.moveToElement(admin).build().perform();
		
		WebElement job = chrome.findElement(By.linkText("Job"));
		mouseHover.moveToElement(job).build().perform();
		
		
		Thread.sleep(2000);
		chrome.close();
	}

}
