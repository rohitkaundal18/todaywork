package com.stateFarm.com.stateFarm.InterFace;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.stateFarm.com.stateFarm.InterFaceLib.ICaptureScreenShots;
import com.sun.jna.platform.FileUtils;

public class CaptureScreenShots implements ICaptureScreenShots{

	private WebDriver driver;
	
	public CaptureScreenShots() {
		this.driver=driver;
	}
	
	
	@Override
	public void captureScreenShots(String fileName) {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}

	
}
