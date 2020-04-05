package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();  
		
        driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//content/span[contains(text(),'Create account')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("santhya");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("narayanasamy");
		
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("sendit2me2019");
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("helloworld123$");
		
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("helloworld123$");
		
		driver.findElement(By.xpath("//content/span[contains(text(),'Next')]")).click();
		
	
		
		driver.findElement(By.xpath("	//input[@id='phoneNumberId']")).sendKeys("3105282268");
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']");
		//WebDriverWait wait = new WebDriverWait (driver, 50);
		//wait.until(ExpectedConditions.
				//stalenessOf(driver.findElement(By.xpath("//content/span[contains(text(),'Next')]"))));
		//driver.close();
		//handling webdriver exception
		//click on next button 
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//content/span[contains(text(),'Next')]")))
		.click().build().perform();

		

	}

}
