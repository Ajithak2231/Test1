package com.pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class CheckOutPage extends BaseClass{

	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//span[@class='counter qty'])[1]")
	public WebElement itemCount;
	
	@FindBy(xpath="//a[@class='action showcart']")
	public WebElement cartLogo;
	
	@FindBy(xpath="//a[@class='action viewcart']")
	public WebElement proceed;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	public WebElement proceed_CheckOut;
	
	@FindBy(xpath="//button[@class='action action-show-popup']")
	public WebElement address;
	
	@FindBy(xpath="(//input[@class='input-text'])[8]")
	public WebElement company;
	
	@FindBy(xpath="(//input[@class='input-text'])[9]")
	public WebElement doorNo;
	
	@FindBy(xpath="(//input[@class='input-text'])[10]")
	public WebElement street;
	
	@FindBy(xpath="(//input[@class='input-text'])[11]")
	public WebElement area;
	
	@FindBy(xpath="(//input[@class='input-text'])[12]")
	public WebElement city;
	
	@FindBy(xpath="(//select[@class='select'])[2]")
	public WebElement country;
	
	@FindBy(xpath="(//select[@class='select'])[1]")
	public WebElement state;
	
	@FindBy(xpath="(//input[@class='input-text'])[14]")
	public WebElement zip;
	
	@FindBy(xpath="(//input[@class='input-text'])[15]")
	public WebElement mobno;
	
	@FindBy(xpath="//span[contains(text(),'Ship here')]")
	public WebElement ship; 
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement finalNext; 
	
	@FindBy(xpath="//span[text()='Ship here']")
			public WebElement next;
	
	@FindBy(xpath="(//div[@class='shipping-information-content'])[1]")
	public WebElement verifyAddress;
	
	@FindBy(xpath="//button[@class='action primary checkout']")
	public WebElement placeOrder;
	
	@FindBy(xpath="(//div[@class='checkout-success']/p)[1]")
	public WebElement orderNum;
	
}
