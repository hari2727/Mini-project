package com.sel.mrng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.instagram.com/?nocaa=1");
	
	WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
	
	email.sendKeys("abc123@gmail.com");
	
	
	
	WebElement passwrd = driver.findElement(By.xpath("//input[@name='password']"));
	
	passwrd.sendKeys("12345677");
	
	WebElement btn = driver.findElement(By.xpath("//div[text()='Log In']"));
	btn.click();
	
	Thread.sleep(3000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File ("C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Screenshot\\Picture.png");
	
	FileUtils.copyFile(source, destination);
	
	
	
	
	
	
	
}
}
