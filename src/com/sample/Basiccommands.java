package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiccommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.get("http://test1.absofttrainings.com/my-account/");
		
		
		Checkbox cb=new Checkbox(driver.findElement(By.xpath("//input[@name='rememberme']")));
		
		
		cb.isSelected();
		
		cb.check();
		cb.check();//status will not change even if you perform twice bcoz of helper class methods
		cb.uncheck();
		cb.uncheck();
	
	}

}
