package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAlertBoxes {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour/");
		
		driver.findElement(By.cssSelector("input[id='wait-time']")).clear();
		
		driver.findElement(By.cssSelector("input[id='wait-time']")).sendKeys("3");
		
		driver.findElement(By.cssSelector("button[id='new-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait wbwait=new WebDriverWait(driver,20);
		
		
		
		System.out.println(driver.findElement(By.cssSelector("button[name='wait3']")).getText());

	}

}
