package com.stateFarm.com.stateFarm.InterFace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.stateFarm.com.stateFarm.InterFaceLib.IwebElement;

public class WebElementClass implements IwebElement{

	private WebDriver driver=null;
	
	
	public WebElementClass(WebDriver driver) {
		this.driver=driver;
		System.out.println("i am from webEelement class");
	}
	
	

	@Override
	public boolean isElementPresent(WebElement ele1) throws Exception {
		
		return ele1.isDisplayed();
	}

	@Override
	public boolean isEnabled(WebElement ele1) throws Exception {
		
		return ele1.isEnabled();
		
	}

	@Override
	public boolean isSelected(WebElement ele1) throws Exception {
		
		return ele1.isSelected();
		
	}

	@Override
	public String getAttribute(WebElement ele1,String attributeTag) throws Exception {
		
		return ele1.getAttribute(attributeTag);
		
	}



	@Override
	public String getText(WebElement ele) throws Exception {
		return ele.getText();
	}



	@Override
	public String getCssValue(WebElement ele, String cssValue) throws Exception {
		return ele.getCssValue(cssValue);
	}



	@Override
	public void clear(WebElement ele) throws Exception {
		ele.clear();
	}



	@Override
	public void click(WebElement ele) throws Exception {
		ele.click();
	}



	@Override
	public String getTagName(WebElement ele) throws Exception {
		return ele.getTagName();
	}



	@Override
	public void submit(WebElement ele) throws Exception {
		ele.submit();
	}







}
