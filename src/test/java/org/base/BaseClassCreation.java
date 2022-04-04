package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassCreation {
	public static WebDriver driver;
	public WebDriver launchBrowser() {

		WebDriverManager.firefoxdriver().setup();
	 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public void loadUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public String CurrUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String tittle(WebDriver driver) {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void wHandles(WebDriver driver) {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
	}

	public void wHandless(WebDriver driver) {
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

	}

	public void manageMinimize(WebDriver driver) {
		driver.manage().window().minimize();

	}

	public void manageMaximixe(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void navigate(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

	public void rFresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void navigateTo(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public void alertAccept(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void alertDismis(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public void alertSendKeys(WebDriver driver, String value) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(value);
	}

	// WebElement: I

	public void isDisplay(WebElement e) {

		boolean displayed = e.isDisplayed();
		System.out.println(displayed);
	}

	public void isEnable(WebElement e) {

		boolean Enable = e.isEnabled();
		System.out.println(Enable);
	}

	public void sendKeys(WebElement e, String string) {
		
e.sendKeys(string);
		//driver.sendKeys(string);

	}

	public String getAttribute(WebElement e) {

		String attribute = e.getAttribute("value");
		return attribute;

		//System.out.println(attribute);
	}

	 

	public void click(WebElement e) {
		e.click();

	}

	public void isSelect(WebElement e) {

		boolean selected = e.isSelected();
		System.out.println(selected);
	}

	// Select: Class

	public void selectUsingindex(WebElement e, int value) {
		Select s = new Select(e);
		s.selectByIndex(value);
	}

	public void selectUsingtext(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public void listOptions(WebElement e) {
		Select s = new Select(e);

		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

	public String getDataFromExcel(String Sheet, int rownum, int cellnum) throws IOException {
		String Value = null;
		File excelLoc = new File(
				"C:\\Users\\Francis Eliza\\eclipse-workspace\\Frameword-BaseClass\\Exce\\Data Driven.xlsx");

		FileInputStream Stream = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(Stream);

		Sheet s = w.getSheet(Sheet);
System.out.println(s);
		Row r = s.getRow(rownum);
		System.out.println(r);
		Cell c = r.getCell(cellnum);
		System.out.println(c);
		int type = c.getCellType();
		
		System.out.println(type);

		if (type == 1) {

			Value = c.getStringCellValue();
		}
		if (type == 0) {

			if (DateUtil.isCellDateFormatted(c)) {
				java.util.Date d = c.getDateCellValue();

				SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");

				Value = dateformat.format(d);

			}

			else {

				double d = c.getNumericCellValue();
				long l = (long) d;

				Value = String.valueOf(l);

			}

		}

		return Value;

	}

}
