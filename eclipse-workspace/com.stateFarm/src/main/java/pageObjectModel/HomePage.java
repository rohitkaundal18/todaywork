package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stateFarm.com.stateFarm.InterFace.ActionClass;
import com.stateFarm.com.stateFarm.InterFace.AlertsAction;
import com.stateFarm.com.stateFarm.InterFace.IwebDriver;
import com.stateFarm.com.stateFarm.InterFace.PropertyReader;
import com.stateFarm.com.stateFarm.InterFace.TextBoxAction;
import com.stateFarm.com.stateFarm.InterFace.WebElementClass;
import com.stateFarm.com.stateFarm.helper.BaseClass;

public class HomePage {
	

	
	PropertyReader prop;
	
	WebElementClass webElement;
	
	@FindBy(name="q")
	private WebElement homeButton;
	
	
	
	public HomePage(WebDriver driver) {
	
		
		PageFactory.initElements(driver, this);
		
		
		prop = new PropertyReader();
		
		
		
	}

	
	public void clickingHomeButton() throws Exception  {
		System.out.println("i am clicking  home ");

		homeButton.sendKeys("i love u janu");;		
	}
}
