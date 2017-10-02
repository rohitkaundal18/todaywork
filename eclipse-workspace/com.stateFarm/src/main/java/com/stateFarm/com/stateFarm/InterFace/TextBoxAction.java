package com.stateFarm.com.stateFarm.InterFace;

import org.openqa.selenium.WebElement;

import com.stateFarm.com.stateFarm.InterFaceLib.ITextBox;

public class TextBoxAction implements ITextBox{

	@Override
	public void setTextBoxInput(WebElement ele,String inputText) {
		 ele.sendKeys(inputText);
	}

	@Override
	public void clearTextBox(WebElement ele) {
		ele.clear();
	}

	

}
