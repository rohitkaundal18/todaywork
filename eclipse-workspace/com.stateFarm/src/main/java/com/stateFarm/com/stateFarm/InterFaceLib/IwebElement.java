package com.stateFarm.com.stateFarm.InterFaceLib;

import org.openqa.selenium.WebElement;

public interface IwebElement {

	public boolean isElementPresent(WebElement ele1) throws Exception;

	public boolean isEnabled(WebElement ele1) throws Exception;

	public boolean isSelected(WebElement ele1) throws Exception;

	public String getAttribute(WebElement ele1, String attributeTag) throws Exception;

	public String getText(WebElement ele) throws Exception;

	public String getCssValue(WebElement ele, String cssValue) throws Exception;

	public void clear(WebElement ele) throws Exception;

	public void click(WebElement ele) throws Exception;

	public String getTagName(WebElement ele) throws Exception;

	public void submit(WebElement ele) throws Exception;

}
