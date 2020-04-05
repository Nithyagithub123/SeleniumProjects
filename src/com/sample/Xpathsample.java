package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpathsample {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
				
        driver.get("https://www.freecrm.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit' and @value='Login']"))).click();
		
		

	}

}
