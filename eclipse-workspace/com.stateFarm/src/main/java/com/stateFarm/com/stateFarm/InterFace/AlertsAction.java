package com.stateFarm.com.stateFarm.InterFace;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.stateFarm.com.stateFarm.InterFaceLib.IAlert;

public class AlertsAction implements IAlert{

	private WebDriver driver;
	
	public AlertsAction(WebDriver driver) {
		this.driver = driver;
	}
	
	


	@Override
	public void alertAccept() {
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}

	@Override
	public void alertDissmiss() {
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
	}

	@Override
	public String getAlertText() {
		Alert alert= driver.switchTo().alert();
		String getAlert=alert.getText();
		return getAlert;
		
	}

	
}


