package com.stateFarm.com.stateFarm.InterFaceLib;

import org.openqa.selenium.WebElement;

public interface IAlert {
	
	public void alertDissmiss()throws Exception;
	public String getAlertText()throws Exception;
	public void alertAccept()throws Exception;

}
