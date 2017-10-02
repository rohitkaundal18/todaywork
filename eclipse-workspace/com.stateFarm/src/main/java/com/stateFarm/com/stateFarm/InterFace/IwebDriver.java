package com.stateFarm.com.stateFarm.InterFace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.stateFarm.com.stateFarm.InterFaceLib.IWebDriver;

public class IwebDriver implements IWebDriver{
	
	private WebDriver driver;
	private long pageLoadTimeOut;
	private long elementDetection;
	
	
	public IwebDriver(String browserType) {
		
		
		try {
			setPageLoadTimeOut(20l);
			setElementDetection(40l);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		browserType= browserType.trim();
		
		switch (browserType.toLowerCase()) {
						case "chrome":
								driver = new ChromeDriver();	
							break;
									
						case "ff":
							driver = new FirefoxDriver();
							break;
							
						case "ie":
							driver = new InternetExplorerDriver();
							break;
							
	

		default:
			break;
		}
	}
	
	
	
	public WebDriver getdriver() throws Exception{
		return driver;
	}

	@Override
	public void openBrowser(String Url) throws Exception {
		
		//driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(elementDetection, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(Url);
	}

	@Override
	public void closeBrowser() throws Exception {
		if(driver!=null) {
			driver.close();
		}
	}

	@Override
	public void quitBrowser() throws Exception {
		if(driver!=null) {
			driver.quit();
		}
	}

	

	@Override
	public void navigateTo(String Url) throws Exception {
		driver.navigate().to(Url);
	}

	@Override
	public void navigateBack() throws Exception {
		driver.navigate().back();
	}

	@Override
	public void navigateForward() throws Exception {
		driver.navigate().forward();
	}

	@Override
	public void setPageLoadTimeOut(long pageLoadTimeOut) throws Exception {
		this.pageLoadTimeOut=pageLoadTimeOut;
	}

	@Override
	public void setElementDetection(long elementDetection) throws Exception {
		this.elementDetection=elementDetection;
	}

	@Override
	public void navigateRefresh() throws Exception {
		driver.navigate().refresh();
	}



	

	

	
}
