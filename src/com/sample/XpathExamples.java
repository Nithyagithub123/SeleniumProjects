package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/	");
		
				
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveen");
		
	
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		


	//WebDriverWait wait = new WebDriverWait (driver, 30);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit' and @value='Login']"))).click();

		/*WebElement ele = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		*/
	
	}

}
