package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("http://test1.absofttrainings.com/my-account/");
		driver.manage().window().maximize();
		
		boolean staus=driver.findElement(By.tagName("iframe")).isDisplayed();
		
		boolean staus1=driver.findElement(By.tagName("iframe")).isEnabled();
		System.out.println(staus);
		
		System.out.println(staus1);
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		driver.switchTo().frame("fb_xdm_frame_https");
		

	}

}
