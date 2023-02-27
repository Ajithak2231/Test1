package com.pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class LoginPage extends BaseClass{

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
	public WebElement signIn;
	
	@FindBy(name="login[username]")
	public WebElement email;
			
	@FindBy(name="login[password]")
	public WebElement password;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	public WebElement signInButton;
	
	@FindBy(xpath="(//span[@class='logged-in'])[1]")
	public WebElement validate;
}
