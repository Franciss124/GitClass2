package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookConfirm {

	
	@FindBy (id="order_no")
	
	private WebElement bookConfirm;

	public WebElement getBookConfirm() {
		return bookConfirm;
	}
	
	
}
