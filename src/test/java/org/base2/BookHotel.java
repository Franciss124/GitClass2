package org.base2;

import java.io.IOException;

import org.base.BaseClassCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.page.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookHotel {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClassCreation bs = new BaseClassCreation();

		WebDriver driver = bs.launchBrowser();
		
		bs.loadUrl(driver, "https://adactinhotelapp.com/");
		//driver.get("https://adactinhotelapp.com/");
	
	
		//Login l=new Login();
	
	//WebElement txtUserName = l.getTxtUserName();
	
		WebElement txtUserName = driver.findElement(By.id("username"));
		bs.sendKeys(driver, txtUserName, bs.getDataFromExcel("Sheet1", 1, 1));
		//txtUserName.sendKeys("Francis");
		Thread.sleep(3000);
		
		//bs.sendKeys(driver, txtUserName, "Francis");
		//System.out.println(txtUserName);
		//bs.sendKeys(txtUserName, bs.getDataFromExcel("Sheet1", 1, 0));
		//WebElement txtUserPwd = l.getTxtUserPwd();
		//bs.sendKeys(txtUserPwd, bs.getDataFromExcel("Sheet1", 1, 1));

	}

}
  