package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\software\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).sendKeys("Womens Dresses");
       
		driver.findElement(By.cssSelector("input[class=nav-input]")).click();
		
		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']")).click();
		
		Select dropdownmenu=new Select(driver.findElement(By.cssSelector("select[name=dropdown_selected_size_name]")));
		
		System.out.println("Default selected option"+dropdownmenu.getFirstSelectedOption().getText());
		
		 dropdownmenu=new Select(driver.findElement(By.cssSelector("select[name=dropdown_selected_size_name]")));
		 //dropdownmenu.selectByIndex(6);
		driver.findElement(By.cssSelector("select[name=dropdown_selected_size_name]"));
		
		 dropdownmenu=new Select(driver.findElement(By.cssSelector("select[name=dropdown_selected_size_name]")));
		dropdownmenu.selectByVisibleText("Medium");
		 dropdownmenu=new Select(driver.findElement(By.cssSelector("select[name=dropdown_selected_size_name]")));
		
		List<WebElement> alloptions=dropdownmenu.getOptions(); 
		
		System.out.println("size "+alloptions.size());
		for(WebElement options: alloptions)
		{
			System.out.println(options.getText());
		}
		
		
		//dropdownmenu.selectByVisibleText("");
		
		
		
	}
	

}
