package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorexamples {

	public static void main(String[] args) throws InterruptedException {
		

	
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();  
		
        driver.get("http://test1.absofttrainings.com");
        
        driver.findElement(By.linkText("My Account")).click();
        
        //css name starts with^= symbol
       // driver.findElement(By.cssSelector("input[name^=user]")).sendKeys("nithya");
        
      //css name ends with$= symbol
        
        //driver.findElement(By.cssSelector("input[name$=word]")).sendKeys("kovai123");
        
      //css name contains *= symbol
       // driver.findElement(By.cssSelector("input[name*=er]")).sendKeys("nithya");
        
        //if id is there put#id or if class is there put .id
        
        List<WebElement> alllinks=driver.findElements(By.cssSelector("div[id=text-4] a"));
        
        System.out.println("No of links : "+alllinks.size() );
        
        for(WebElement link:alllinks)
        {
        	System.out.println(" Link " + link.getText());
        }
        
        Thread.sleep(3000);
        
      
}
}