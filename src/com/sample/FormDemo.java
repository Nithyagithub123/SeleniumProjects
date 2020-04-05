package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jotform.com/form-templates/conference-online-registration-form");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	int size = driver.findElements(By.tagName("iframe")).size();
	
	System.out.println(size);
	//driver.switchTo().frame("ssIFrame_google");
	Thread.sleep(3000);
	 WebElement Element = driver.findElement(By.id("first_1"));
	
	js.executeScript("arguments[0].scrollIntoView();", Element);
	boolean staus=driver.findElement(By.id("first_1")).isDisplayed();
	System.out.println(staus);
	
	//driver.findElement(By.id("first_1")).sendKeys("nithya");

		

	}

}
