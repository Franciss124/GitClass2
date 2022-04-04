package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel {

	@FindBy(id = "location")

	private WebElement txtLocation;

	@FindBy(id = "hotels")

	private WebElement txtHotel;

	@FindBy(id = "room_type")

	private WebElement txtRoomType;

	@FindBy(id = "room_nos")

	private WebElement noRooms;

	@FindBy(id = "datepick_in")

	private WebElement checkDate;

	@FindBy(id = "datepick_out")

	private WebElement checkOut;

	@FindBy(id = "adult_room")

	private WebElement adultRoom;

	@FindBy(id = "child_room")

	private WebElement childRoom;

	@FindBy(id = "Submit")

	private WebElement serarchBtn;

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotel() {
		return txtHotel;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getNoRooms() {
		return noRooms;
	}

	public WebElement getCheckDate() {
		return checkDate;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSerarchBtn() {
		return serarchBtn;
	}

}
