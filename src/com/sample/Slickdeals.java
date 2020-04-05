package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slickdeals {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();  
		
		
		  driver.get("https://slickdeals.net/");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().deleteAllCookies();

			
			driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
			
			driver.findElement(By.xpath("//button[@class='googleSignUp large']/span")).click();
			
			driver.switchTo().frame("-1");
	
           WebElement email= driver.findElement(By.xpath("//input[@id='identifierId']"));
	 
           email.sendKeys("srinithy");
	
            //JavascriptExecutor js = (JavascriptExecutor) driver;

    		//js.executeScript("arguments[0].value='srinithy';", email);

    		
	
	}
	

}
