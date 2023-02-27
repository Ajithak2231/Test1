package com.pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class MenPage extends BaseClass{

	public MenPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[@id='ui-id-5'])")
	public WebElement menTag;
	
	@FindBy(xpath="//a[contains(text(),'Tops')]")
	public WebElement tops;
			
	@FindBy(xpath="(//select[@id='sorter'])[1]")
	public WebElement sortBy;
	
	@FindBy(xpath="(//img[@class='product-image-photo'])[1]")
	public WebElement fistProdcut;
	
	@FindBy(xpath="//div[@option-id='167']")
	public WebElement size;
	
	@FindBy(xpath="//div[@option-label='Blue']")
	public WebElement color;
	
	@FindBy(id="product-addtocart-button")
	public WebElement addToCart;
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement validate;
	
	@FindBy (xpath="//a[contains(text(),'Bottoms')]")
	public WebElement bottoms;
	
	@FindBy(xpath="(//img[@class='product-image-photo'])[1]")
	public WebElement firstproduct;
	
	@FindBy(xpath="//div[@option-id='176']")
	public WebElement trackSize;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-50']")
	public WebElement blackColor;
	
	@FindBy(id="product-addtocart-button")
	public WebElement bottomAddToCart;
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement bottomValidate;
	
}
