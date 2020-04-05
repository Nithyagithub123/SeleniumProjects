package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertBoxes {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		
		driver.findElement(By.cssSelector("button[id=prompt]")).click();
	
	     Alert alertobj=driver.switchTo().alert();
	     
	     	     
	     alertobj.sendKeys("Nithya");
	     
	     alertobj.accept();
	     
	     driver.switchTo().defaultContent();
	     
	     
	     System.out.println(driver.findElement(By.cssSelector("p[id=msg]")).getText());
	     
	     
	
	
	}
	
				

		

}
