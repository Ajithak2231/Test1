package com.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Select ss;
	public static TakesScreenshot tkscr;
	public static JavascriptExecutor js;
	public static WebDriverWait w;
	
	
	public static Logger log = LogManager.getLogger(BaseClass.class);

	public static void launchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void scrollDown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public static void jsClick(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", target);
	}
	
	

	public static WebElement elementClickable(WebElement element) {
		return w.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void screenShot(String fileName) throws IOException {
		tkscr = ((TakesScreenshot) driver);
		File from = tkscr.getScreenshotAs(OutputType.FILE);
		File to = new File(
				"C:\\Users\\AK\\eclipse-workspace\\Adacitin\\src\\test\\resources\\Screenshots\\" + fileName + ".jpg");
		FileUtils.copyFile(from, to);
		;
	}

	public static void expWait(WebElement element) {
		w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOf(element));
	}

	public static void selectingDropdownValue(WebElement location, String value) {
		ss = new Select(location);
		ss.selectByValue(value);
	}

	public static void close() {
		driver.quit();
	}

	public static void textBox(WebElement target, String txt) {
		target.sendKeys(txt);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static boolean isDisplay(WebElement element) {
		return element.isDisplayed();
	}

	public static void Wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static String gettingAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}

	public static String getText(WebElement element) {
		return element.getText();

	}

	public static void expWait(WebElement element, String text) {
		w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

}
