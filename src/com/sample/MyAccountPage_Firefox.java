package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyAccountPage_Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\nithya\\software\\geckodriver.exe");
       
		WebDriver driver = new FirefoxDriver();  
		

		//System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
        driver.get("http://test1.absofttrainings.com");
        
        driver.findElement(By.linkText("My Account")).click();
        
        driver.findElement(By.id("username")).sendKeys("testuser1");
        
        driver.findElement(By.id("password")).sendKeys("testpwd1");
        
        driver.findElement(By.id("login")).click();
        
        boolean testResult=driver.findElement(By.id("user_info")).getText().contains("testuser1");
                
        if(testResult==true)
        {
        	System.out.println("Login test passed");
        }
        else
        {
        	System.out.println("Login test failed");
        }
        

	}

}
