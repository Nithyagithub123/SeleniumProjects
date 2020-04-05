package com.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GglSrch {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
				driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//store all the dropdown search values in a list and iterate to find the matching search keyword

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));

		System.out.println("list of elements  " + list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(" list of search values  " + list.get(i).getText());

			if (list.get(i).getText().contains("selenium")) {
				list.get(i).click();
				break;

			}

		}
		boolean verifyTitle = driver.getTitle().contains("selenium - Google Search");

		if (verifyTitle == true) {
			System.out.println(" test passed");
		} else {

			System.out.println(" test failed");
		}

	}
}
