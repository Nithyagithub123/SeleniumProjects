package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();  
		
        driver.get("http://test1.absofttrainings.com/how-to-use/");
        
        String cellValue3by2=driver.findElement(By.cssSelector("table[id=testaccounts] tbody tr:nth-child(3) td:nth-child(2)")).getText();
	
        System.out.println("cellValue3by2 "+ cellValue3by2);
        
        String cellValue4by2=driver.findElement(By.cssSelector("table[id=testaccounts] tbody tr:nth-child(4) td:nth-child(2)")).getText();
    	
        System.out.println("cellValue4by2 "+ cellValue4by2);
        
        
      List<WebElement> alllinkspage=  driver.findElements(By.cssSelector("div[class=entry-content]"));
      System.out.println("No of links : "+alllinkspage.size() );
      
      for(WebElement link:alllinkspage)
      {
      	System.out.println(" Link " + link.getText());
      }

	}
}
