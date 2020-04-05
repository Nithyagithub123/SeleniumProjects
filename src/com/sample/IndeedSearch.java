package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();


		driver.get("https://www.indeed.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys("developer");

		WebElement where_field = driver.findElement(By.xpath("//input[@id='text-input-where']"));

		//use javascript commands to unclear the text fields
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='texas';", where_field);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
