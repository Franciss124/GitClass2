package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel {
	
	@FindBy (id="radiobutton_0")
	
	private WebElement radioBtn;
	
	
	@FindBy (id="continue")
	
	private WebElement continueBtn;


	public WebElement getRadioBtn() {
		return radioBtn;
	}


	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
	

}
