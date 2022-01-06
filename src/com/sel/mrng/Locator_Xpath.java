package com.sel.mrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://twitter.com/login?lang=en-gb");
driver.manage().window().maximize();
	
	
	
	WebElement email = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[1]"));
	
	email.sendKeys("arun123@gmail.com");
	
	WebElement pswrd = driver.findElement(By.xpath("//input[@type='password']"));
	pswrd.sendKeys("223233234233");

	
	WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
	String text2 = text.getText();
	System.out.println(text2);
	
	
	
	
}
}
