package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogintest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\group12Testing\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("https://opensource-demo.orangehrmlive.com");
		
		//chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElementByXPath("//*[@id=\"txtUsername\"]").sendKeys("Admin");
		//chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElementByXPath("//*[@id=\"txtPassword\"]").sendKeys("admin123");
		//chrome.findElement(By.name("Submit")).click();
		chrome.findElementByXPath("//*[@id=\"btnLogin\"]").click();
		chrome.findElementByXPath("//*[@id=\"welcome\"]").click();
		
		Thread.sleep(3000);
		
		chrome.findElementByXPath("//*[@id=\"welcome-menu\"]/ul/li[2]/a").click();
    }

}////*[@id="welcome"]
////*[@id="txtUsername"] ////*[@id="txtPassword"] ////*[@id="btnLogin"] ////*[@id="welcome-menu"]/ul/li[2]/a ////*[@id="welcome-menu"]/ul/li[2]/a