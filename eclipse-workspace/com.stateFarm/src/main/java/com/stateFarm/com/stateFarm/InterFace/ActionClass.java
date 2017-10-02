package com.stateFarm.com.stateFarm.InterFace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

import com.stateFarm.com.stateFarm.InterFaceLib.IAction;

public class ActionClass implements IAction{

		private WebDriver driver;
	
	public ActionClass(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@Override
	public void dragAndDropAction(WebElement ele1, WebElement ele2) {
		Actions action= new Actions(driver);
		action.dragAndDrop(ele1, ele2).build().perform();
		
	}

	@Override
	public void moveToElementAction(WebElement ele1, WebElement ele2) {
		Actions action= new Actions(driver);
		Actions element = action.moveToElement(ele1).clickAndHold();
		element.release(ele2).build().perform();
		
		
	}


	@Override
	public void clickToContext(WebElement ele1) throws Exception {
		Actions action= new Actions(driver);
		action.contextClick(ele1).click().build().perform();
	}


	@Override
	public void doubleClick(WebElement ele1) throws Exception {
		Actions action= new Actions(driver);
		action.doubleClick(ele1).click().build().perform();
	}


	@Override
	public void keyBoardAction(WebElement ele,CharSequence key) throws Exception {
		Actions action= new Actions(driver);
		action.keyDown(ele, key);
		action.release(ele).build().perform();
	}

}
