package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name=q]")).sendKeys("selenium");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul[class=erkvQe]")));
		
		List<WebElement> search_list=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		System.out.println(search_list.size());
		
		
for (WebElement search_values : search_list) 
{
	System.out.println( search_values.getText());
}

//leave space after text method otherwise you will get error
driver.findElement(By.xpath("//div[@class='sbl1']/span/b[text()=' benefits']")).click();
Thread.sleep(2000);
	}
	
	
}
