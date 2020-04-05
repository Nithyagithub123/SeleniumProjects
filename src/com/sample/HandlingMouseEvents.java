package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://test1.absofttrainings.com/my-account/");
		
		WebElement LPLink=driver.findElement(By.partialLinkText("Lost your password"));
		
		Actions builder=new Actions(driver);
		
		//perform right click
		Action contextClick=builder.contextClick(LPLink).build();
		
		contextClick.perform();
		//perform double click
		Action doubleclick=builder.doubleClick(LPLink).build();
		
		doubleclick.perform();
		

	}

}
