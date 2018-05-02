package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OhrmLogin_Xpath {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		// open browser
		WebDriver driver = new ChromeDriver();
		//navigate to url
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		//enter text on user name
		WebElement elmUser = driver.findElement(By.id("txtUsername"));
		elmUser.sendKeys("admin");
		
		//enter text on password
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		//click on login
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//click on PIM link
		driver.findElement(By.linkText("PIM")).click();
		
		//click on Add Employee
		driver.findElement(By.partialLinkText("Add Emp")).click();
		
		//enter text on first name
		driver.findElement(By.name("firstName")).sendKeys("web");
		
		//enter text on last name
		driver.findElement(By.id("lastName")).sendKeys("driver");
		
		//click on save
		driver.findElement(By.id("btnSave")).click();
		
		driver.quit();
	}

}










