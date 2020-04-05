package com.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMtesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		//Sign button having same xpath(id)in multiple places on the same web page
		//if an element xpath is matching with more than one nodes,
		//to select a matching first element and perform a click operation use the following code
		
		List<WebElement> list=driver.findElements(By.xpath("//a[text()='Sign Up']"));
		
		System.out.println(list.size());
		
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		
		if(list.size()==1)
		{
			System.out.println(list.get(i));
			
		}
		list.get(i).click();
		break;
	}
	
	}

}
