package com.sel.mrng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.Driver", "C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Driver\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	
	
	
	
	
	
	
	
}}
