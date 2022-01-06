package com.sel.mrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Id {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Driver\\chromedriver.exe");
	

	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	
	driver.manage().window().maximize();
	
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abc123@gmail.com");
	
	
	
	
	WebElement passwrd = driver.findElement(By.id("pass"));
	
	passwrd.sendKeys("12345677655");
	
	
	
//	WebElement btn = driver.findElement(By.name("login"));
//	btn.click();
//	
	
	
WebElement text = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
//	String text2 = text.getText();
//	System.out.println(text2);
	
	String attribute = email.getAttribute("name");
	System.out.println("name:"+attribute);
	
	
	String attribute2 = passwrd.getAttribute("value");
	System.out.println("value:"+attribute2);
	
	email.clear();
	email.sendKeys("hari1213@gmail.com");
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
