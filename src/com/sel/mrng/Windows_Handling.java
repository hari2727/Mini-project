package com.sel.mrng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\best\\eclipse-workspace\\Selenium_Sept\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));

		Actions act = new Actions(driver);

		act.contextClick(mobiles).build().perform();
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		WebElement bstseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));

		act.contextClick(bstseller).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));

		act.contextClick(fashion).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		Set<String> windowHandles = driver.getWindowHandles();

		for (String allwindow : windowHandles) {
			String title = driver.switchTo().window(allwindow).getTitle();

			System.out.println(title);
		}

		String actual = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

		for (String allwindows : windowHandles) {
			if (driver.switchTo().window(allwindows).getTitle().equals(actual)) {
				break;
			}
		}

	}
}
