package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	 
	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\group015\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	       WebDriver driver = new ChromeDriver();
	  
	       driver.manage().window().maximize();
	  
	       driver.get("https://accounts.google.com/SignUp");
	  
	       driver.findElement(By.id("firstName")).sendKeys("Selenium");
	       driver.findElement(By.id("lastName")).sendKeys("group015");
	       driver.findElement(By.id("username")).sendKeys("saurabh");
	       driver.findElement(By.name("Passwd")).sendKeys("DemoPassword");
	       driver.findElement(By.name("ConfirmPasswd")).sendKeys("DemoPassword");
	       /*driver.findElement(By.cssSelector("div[title='Birthday']")).sendKeys("March");
	       driver.findElement(By.id("BirthDay")).sendKeys("12");
	       driver.findElement(By.id("BirthYear")).sendKeys("1990");
	       driver.findElement(By.cssSelector(" div[title='Gender']")).sendKeys("Male");
	       driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9123455432");
	       driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("seleniumtraining11292017@gmail.com");
	       driver.findElement(By.cssSelector("#CountryCode div[title='Location']")).sendKeys("India");
	  */
	 }

	}
