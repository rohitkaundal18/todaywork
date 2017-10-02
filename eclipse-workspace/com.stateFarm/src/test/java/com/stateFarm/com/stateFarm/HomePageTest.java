package com.stateFarm.com.stateFarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.stateFarm.com.stateFarm.InterFace.IwebDriver;
import com.stateFarm.com.stateFarm.InterFace.PropertyReader;
import com.stateFarm.com.stateFarm.helper.BaseClass;

import pageObjectModel.HomePage;

public class HomePageTest extends BaseClass{
	
	
	
	
	//private WebDriver driver=null;
	
	PropertyReader prop=new PropertyReader();
	HomePage home;

	@Test
	public void tc_1() throws Exception {
		//IwebDriver browser = new IwebDriver(prop.getBrowser());
//		browser.setPageLoadTimeOut(30l);
//		browser.setElementDetection(80l);
////		browser.openBrowser("https://google.com");
		
		 home=new HomePage(commonDriver.getdriver());
		home.clickingHomeButton();
		
	}

}
