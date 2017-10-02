package com.stateFarm.com.stateFarm.helper;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.stateFarm.com.stateFarm.InterFace.ActionClass;
import com.stateFarm.com.stateFarm.InterFace.AlertsAction;
import com.stateFarm.com.stateFarm.InterFace.IwebDriver;
import com.stateFarm.com.stateFarm.InterFace.PropertyReader;
import com.stateFarm.com.stateFarm.InterFace.TextBoxAction;
import com.stateFarm.com.stateFarm.InterFace.WebElementClass;

public class BaseClass {

	private WebDriver driver=null;
	
	PropertyReader prop = new PropertyReader();
//	ActionClass action = new ActionClass(driver);
//	AlertsAction alerts =new AlertsAction(driver);
//	WebElementClass webAction = new WebElementClass(driver);
	protected IwebDriver commonDriver ;
//	TextBoxAction textBox = new TextBoxAction();
//	WebElementClass webElement=new WebElementClass(driver);
	
	
	
	@BeforeClass
	public void setup() throws Exception {
		try {
			
			//IwebDriver commonDriver = new IwebDriver(prop.getBrowser());
			 
			commonDriver = new IwebDriver(prop.getBrowser());
			commonDriver.setPageLoadTimeOut(40l);
			commonDriver.setElementDetection(60l);
			commonDriver.openBrowser(prop.getUrl());
			System.out.println("i am from baseclass");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	//@AfterClass
	public void closeBrowser() throws Exception {
		commonDriver.closeBrowser();
	}
	
	
	
	
	
	
}
