package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLoginTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\rahul\\chromedriver_win32\\chromedriver.exe");
		//opens the browser window
		ChromeDriver chrome = new ChromeDriver();
		//Enters thr url
		chrome.get("https://opensource-demo.orangehrmlive.com");
		//Locates the username field and pass the data
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.name("Submit")).click();
		chrome.findElement(By.id("welcome")).click();
		//Thread.sleep(3000);
		chrome.findElement(By.xpath("/index.php/auth/logout\">Logout")).click();
	
	}

}
