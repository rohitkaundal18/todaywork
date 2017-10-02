package com.stateFarm.com.stateFarm.InterFaceLib;

public interface IWebDriver {

	public void openBrowser(String Url)throws Exception;
	
	public void closeBrowser()throws Exception;
	
	public void quitBrowser()throws Exception;
	
	
	public void navigateTo(String Url)throws Exception;
	
	public void navigateBack()throws Exception;
	
	public void navigateForward()throws Exception;
	
	
	public void setPageLoadTimeOut(long pageLoadTimeOut) throws Exception;
	
	public void setElementDetection(long elementDetection) throws Exception;
	
	public void navigateRefresh() throws Exception;
	
	
	
}
