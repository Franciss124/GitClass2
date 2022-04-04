package org.base2;

import java.util.List;

import org.base.BaseClassCreation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Employee {

	public static void main(String[] args) throws InterruptedException {

		BaseClassCreation bs = new BaseClassCreation();
		WebDriver driver = bs.launchBrowser();

		/*
		 * /bs.loadUrl(driver, "http://demo.automationtesting.in/Alerts.html");
		 * Thread.sleep(3000); WebElement okAndCancel =
		 * driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		 * okAndCancel.click(); WebElement btnClick =
		 * driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		 * 
		 * btnClick.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * bs.alertSendKeys(driver, "FrancisLavanya"); bs.alertAccept(driver);
		 * 
		 * Thread.sleep(4000);
		 */

		/*bs.loadUrl(driver, "https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));

		bs.sendKeys(txtUserName, "Francis");
		bs.getAttribute(txtUserName);
		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));

		bs.getText(text);
		bs.isSelect(text);
		WebElement btnLogin = driver.findElement(By.name("login"));
		bs.click(btnLogin);
		Thread.sleep(4000);*/
		
		// Select: Class
		bs.loadUrl(driver, "https://www.facebook.com/");
	
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		bs.click(createAccount);
		Thread.sleep(3000);
		WebElement ddMonth = driver.findElement(By.id("month"));
		bs.listOptions(ddMonth);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
