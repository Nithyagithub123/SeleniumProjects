package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWeblements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		//search for womens dresses
		
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).sendKeys("Womens Dresses");
		
		//type and click
       
		driver.findElement(By.cssSelector("input[class=nav-input]")).click();
		
		
		//store search result links in a list
		
		List<WebElement> search_results=driver.
				findElements(By.cssSelector("div[class='a-section a-spacing-none a-spacing-top-small']  a"));
		
		//Extract the title from the links
		
		for (WebElement producttitle : search_results) 
		{
			System.out.println(producttitle.findElement(By.tagName("span")).getText());
			
		}
	}
	
	

}
