package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel {
	
	@FindBy(id="first_name")
	
	private WebElement firstName;
	
	@FindBy (id= "last_name")
	
	private WebElement lastName;
	
	@FindBy (id="address")
	private WebElement addrssUser;
	
	@FindBy (id="cc_num")
	
	private WebElement ccNum;
	
	@FindBy (id="cc_type")
	
	private WebElement ccType;
	
	@FindBy (id="cc_exp_month")
	
	private WebElement ccMonth;
	
	@FindBy (id="cc_exp_year")
	
	private WebElement ccYear;
	
	@FindBy (id="cc_cvv")
	
	private WebElement ccNumber;
	
	@FindBy (id="book_now")
	
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddrssUser() {
		return addrssUser;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	

}
