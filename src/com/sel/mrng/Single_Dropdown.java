package com.sel.mrng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Single_Dropdown {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
driver.get("https://en-gb.facebook.com/");

driver.manage().window().maximize();
WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]")); btn.click();
Thread.sleep(3000);
WebElement day = driver.findElement(By.id("day"));

   Select s = new Select(day);
s.selectByValue("15");


WebElement mnth = driver.findElement(By.id("month"));
Select s1 = new Select(mnth);

s1.selectByVisibleText("Apr");



WebElement year = driver.findElement(By.id("year"));

Select s2= new Select(year);

s2.selectByValue("2000");

WebElement radio_Btn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

radio_Btn.click();



driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebDriverWait wait = new WebDriverWait(driver, 20);

wait.until(ExpectedConditions.visibilityOf(radio_Btn)).click();

}
}
