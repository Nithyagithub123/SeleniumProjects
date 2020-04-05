package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://test1.absofttrainings.com/frames-practice-page/");
		
		driver.switchTo().frame(2);
		
		
		String verified_malware_date=driver.findElement(By.cssSelector("table[id='inner-table'] tbody tr:nth-child(5)  td:nth-child(2)")).getText();
		
		System.out.println(verified_malware_date);

		String Last_deep_scan=driver.findElement(By.cssSelector("table[id='inner-table'] tbody tr:nth-child(6)  td:nth-child(2)")).getText();
		
		System.out.println(Last_deep_scan);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.id("absoftfbpage")));
		
		driver.findElement(By.cssSelector("a[class='see_more_link'] span")).click();
		
		
	}

}
