package com.stateFarm.com.stateFarm.InterFaceLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;

public interface IAction {
	
	public void dragAndDropAction(WebElement ele1,WebElement ele2)throws Exception;
	public void moveToElementAction(WebElement ele1,WebElement ele2)throws Exception;
	public void clickToContext(WebElement ele1)throws Exception;
	public void doubleClick(WebElement ele1)throws Exception;
	public void keyBoardAction(WebElement ele,CharSequence key) throws Exception;


}
