package com.snippets;

import com.basepackage.BaseClass;
import com.pageelements.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageExe extends LoginPage {

	@Given("Launch browser and launch the url {string}")
	public void launch_browser_and_launch_the_url(String string) {
		BaseClass.launchBrowser();
		BaseClass.launchUrl(string);

	}

	@When("click SignIn")
	public void click_sign_in() {
		LoginPageExe lp = new LoginPageExe();
		BaseClass.click(lp.signIn);
	}

	@When("Enter {string} , {string}")
	public void enter(String email, String pass) {
		LoginPageExe lp = new LoginPageExe();
		BaseClass.textBox(lp.email, email);
		BaseClass.textBox(lp.password, pass);
	}

	@When("Click LogIn")
	public void click_log_in() {
		LoginPageExe lp = new LoginPageExe();
		BaseClass.click(lp.signInButton);
	}

	@Then("Validate the process")
	public void validate_the_process() {
		LoginPageExe lp = new LoginPageExe();
		String exp = "Welcome, Ajith Kumar!";
		System.out.println(BaseClass.getText(lp.validate));
		Wait(5);
		BaseClass.expWait(lp.validate, exp);
		String actual = BaseClass.getText(lp.validate);
		if(true){
			Assert.assertEquals(exp, actual);
			BaseClass.log.info("Login succesfull");
		}else {
		BaseClass.log.info("Login failed");
	}
	}
}
