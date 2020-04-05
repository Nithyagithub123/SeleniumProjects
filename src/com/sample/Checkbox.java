package com.sample;

import org.openqa.selenium.WebElement;

//Checkbox helper class to check and and uncheck the state of the checkbox

public class Checkbox {
	
	
	private WebElement _checkbox;
	
	
	public Checkbox(WebElement checkbox)
	{
		_checkbox=checkbox;
	}
	
	public WebElement getCheckbox()
	{
		return _checkbox;
	}
	public boolean isSelected()
	{
		return _checkbox.isSelected();
	}
	public void check()
	{
		if(!(_checkbox.isSelected()))
			
		{
			_checkbox.click();
		}
	}
	public void uncheck()
	{
		if((_checkbox.isSelected()))
			
		{
			_checkbox.click();
		}
	}

}
