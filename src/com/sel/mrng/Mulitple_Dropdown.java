package com.sel.mrng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mulitple_Dropdown {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\best\\eclipse-workspace\\June_Eveng\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	driver.manage().window().maximize();
	WebElement multiselect = driver.findElement(By.id("multi-select"));
	
	Select s = new Select(multiselect);
	
	boolean multiple = s.isMultiple();
	
	System.out.println(multiple);
	
	
	List<WebElement> options = s.getOptions();
	
	for (WebElement all_options: options) {
		String text = all_options.getText();
	
	System.out.println(text);
	
	}
	
	int size = options.size();
	
	System.out.println("size:"+size);
	
	
//	s.selectByIndex(2);
//	s.selectByIndex(0);
//	s.selectByIndex(7);
	
	for (int i = 0; i <size; i++) {
		if (i==2||i==0||i==7) {
			s.selectByIndex(i);
		}
	}
	
	s.deselectAll();
	
	
	
	
	
	
	
	
}
}
