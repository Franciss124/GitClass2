package org.base2;

import java.io.IOException;

import org.base.BaseClassCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClassCreation bs = new BaseClassCreation();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");

		WebElement txtusername = driver.findElement(By.id("username"));

		bs.sendKeys(txtusername, bs.getDataFromExcel("Sheet1", 1, 0));

		WebElement txtuserpwd = driver.findElement(By.id("password"));
		bs.sendKeys(txtuserpwd, bs.getDataFromExcel("Sheet1", 1, 1));
		Thread.sleep(3000);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.id("location"));
		bs.selectUsingtext(location, bs.getDataFromExcel("Sheet1", 1, 2));

		WebElement txtHotel = driver.findElement(By.id("hotels"));
		bs.selectUsingtext(txtHotel, bs.getDataFromExcel("Sheet1", 1, 3));

		WebElement txtType = driver.findElement(By.id("room_type"));
		bs.selectUsingtext(txtType, bs.getDataFromExcel("Sheet1", 1, 4));

		WebElement txtRooms = driver.findElement(By.id("room_nos"));
		bs.selectUsingtext(txtRooms, bs.getDataFromExcel("Sheet1", 1, 5));

		WebElement checkDate = driver.findElement(By.id("datepick_in"));
		bs.sendKeys(checkDate, bs.getDataFromExcel("Sheet1", 1, 6));

		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		bs.sendKeys(checkOutDate, bs.getDataFromExcel("Sheet1", 1, 7));

		WebElement adultRooms = driver.findElement(By.id("adult_room"));
		bs.sendKeys(adultRooms, bs.getDataFromExcel("Sheet1", 1, 8));

		WebElement childRoom = driver.findElement(By.id("child_room"));
		bs.sendKeys(childRoom, bs.getDataFromExcel("Sheet1", 1, 9));

		WebElement btnSearch = driver.findElement(By.id("Submit"));
		bs.click(btnSearch);

		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		bs.click(radiobtn);

		WebElement btnContinue = driver.findElement(By.id("continue"));
		bs.click(btnContinue);

		WebElement first_name = driver.findElement(By.id("first_name"));
		bs.sendKeys(first_name, bs.getDataFromExcel("Sheet1", 1, 10));

		WebElement last_name = driver.findElement(By.id("last_name"));
		bs.sendKeys(last_name, bs.getDataFromExcel("Sheet1", 1, 11));

		WebElement address = driver.findElement(By.id("address"));
		bs.sendKeys(address, bs.getDataFromExcel("Sheet1", 1, 12));

		WebElement cc_num = driver.findElement(By.id("cc_num"));
		bs.sendKeys(cc_num, bs.getDataFromExcel("Sheet1", 1, 13));

		WebElement cc_type = driver.findElement(By.id("cc_type"));
		bs.selectUsingtext(cc_type, bs.getDataFromExcel("Sheet1", 1, 14));

		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		bs.selectUsingtext(cc_exp_month, bs.getDataFromExcel("Sheet1", 1, 15));

		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		bs.selectUsingtext(cc_exp_year, bs.getDataFromExcel("Sheet1", 1, 16));

		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		bs.sendKeys(cc_cvv, bs.getDataFromExcel("Sheet1", 1, 17));

		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		bs.click(btnBookNow);

	}

}
