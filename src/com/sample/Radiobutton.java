package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://test1.absofttrainings.com/shop/");
		
		driver.findElement(By.xpath("//h3[text()='Samsung Phone']x")).click();
		
		driver.findElement(By.xpath("//button[@id='addtocart']")).click();
		
		driver.findElement(By.partialLinkText("View Cart")).click();
		
		driver.findElement(By.partialLinkText("Proceed to Checkout")).click();
		
		driver.findElement(By.xpath("//input[@id='payment_method_paypal']")).isSelected();
				
	}

}
