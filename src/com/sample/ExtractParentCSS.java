package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractParentCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/product/test-product2/");

		
		driver.findElement(By.cssSelector("form[id=cart] input[name=quantity]")).clear();
		
		driver.findElement(By.cssSelector("form[id=cart] input[name=quantity]")).sendKeys("5");
		
	}

}
