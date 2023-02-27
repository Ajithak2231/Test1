package com.snippets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;

import com.basepackage.BaseClass;
import com.pageelements.CheckOutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOut extends CheckOutPage {
	
	
	
	
	
	@Given("Check Cart contains any product")
	public void check_cart_contains_any_product() {
		CheckOut co = new CheckOut();
//		if (BaseClass.isDisplay(co.itemCount)) {
//			System.out.println("items found");
//		} else {
//			System.out.println("No items found");
//		}

	}

	@When("Click cart")
	public void click_cart() {
		CheckOut co = new CheckOut();
		BaseClass.click(co.cartLogo);
		BaseClass.log.info("Entering into the check section");
	}

	@When("Proceed to Checkout")
	public void proceed_to_checkout() throws InterruptedException {
		CheckOut co = new CheckOut();
		BaseClass.Wait(25);
		BaseClass.elementClickable(co.proceed).click();
		BaseClass.elementClickable(co.proceed_CheckOut).click();
		Wait(12);
//		BaseClass.jsClick(co.proceed);
	}

	@When("Give delivery address")
	public void give_delivery_address() {
		CheckOut co = new CheckOut();
		Wait(25);
		BaseClass.jsClick(BaseClass.elementClickable(co.address));
//		BaseClass.click(co.address);
		BaseClass.textBox(co.company, "Aiite");
		BaseClass.textBox(co.doorNo, "60a");
		BaseClass.textBox(co.street, "10th cross street");
		BaseClass.textBox(co.area, "Egmore");
		BaseClass.textBox(co.city, "chennai");
		BaseClass.selectingDropdownValue(co.country, "IN");
		BaseClass.selectingDropdownValue(co.state, "563");
		BaseClass.textBox(co.zip, "600008");
		BaseClass.textBox(co.mobno, "7010162277");
		BaseClass.click(BaseClass.elementClickable(co.next));
		Wait(12);
		
	}

	@When("click proceed")
	public void click_proceed() {
		CheckOut co = new CheckOut();
		BaseClass.click(BaseClass.elementClickable(co.finalNext));
	}

	@Then("Verify the given address")
	public void verify_the_given_address() {
		CheckOut co = new CheckOut();
		try{
			BaseClass.expWait(co.verifyAddress, BaseClass.getText(co.verifyAddress));
			System.out.println(BaseClass.getText(co.verifyAddress));
		}catch (NoSuchElementException ns) {
			System.out.println(ns.getMessage());
		}finally {
			System.out.println("**********");
		}
		
	}

	@Then("Place Order")
	public void place_order() {
		CheckOut co = new CheckOut();
		Wait(5);
		BaseClass.jsClick(co.placeOrder);
		System.out.println("Orderplaced");
	}

	@Then("Get the Order number")
	public void get_the_order_number() {
		CheckOut co = new CheckOut();
		String text = BaseClass.getText(co.orderNum);
		BaseClass.log.info("Order successful your order num is "+ text);
	}
}