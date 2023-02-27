package com.snippets;

import org.junit.Assert;

import com.basepackage.BaseClass;
import com.pageelements.MenPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MensPageExe extends MenPage {

	@Given("Click on the Mens")
	public void click_on_the_mens() {
		MenPage mp = new MenPage();
		BaseClass.click(mp.menTag);
	}

	@Given("Choose Tops")
	public void choose_tops() {
		MenPage mp = new MenPage();
		BaseClass.click(mp.tops);
	}

	@When("Filter by price low to high")
	public void filter_by_price_low_to_high() {
		MenPage mp = new MenPage();
		BaseClass.selectingDropdownValue(mp.sortBy, "price");
	}

	@When("Click the first top & Choose size as S & Choose Blue")
	public void click_the_first_top_choose_size_as_s() {
		MenPage mp = new MenPage();
		BaseClass.jsClick(elementClickable(mp.fistProdcut));
		BaseClass.click(elementClickable(mp.size));
		BaseClass.click(mp.color);
	}

	@Then("Click Add to Cart")
	public void click_add_to_cartt() {
		MenPage mp = new MenPage();
		BaseClass.click(mp.addToCart);
	}

	@Then("Validate the Process")
	public void validate_the_process() {
		MenPage mp = new MenPage();
		BaseClass.expWait(mp.validate);
		if (BaseClass.isDisplay(mp.validate)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Given("Choose Bottoms")
	public void choose_bottoms() {
		MenPage mp = new MenPage();
		BaseClass.click(mp.menTag);
		mp.click(mp.bottoms);
	}

	@When("Filter by product name")
	public void filter_by_product_name() {
		MenPage mp = new MenPage();
		BaseClass.selectingDropdownValue(mp.sortBy, "name");
	}

	@When("Click any product")
	public void click_any_product() {
		MenPage mp = new MenPage();
		BaseClass.jsClick(BaseClass.elementClickable(mp.firstproduct));

	}

	@Then("Choose any Size & Choose any color")
	public void choose_size_as_choose_any_color() {
		MenPage mp = new MenPage();
		BaseClass.click(elementClickable(mp.trackSize));
		BaseClass.click(mp.blackColor);
	}

	@Then("Click add to cart")
	public void click_add_to_cart() {
		MenPage mp = new MenPage();
		BaseClass.click(mp.bottomAddToCart);
		BaseClass.expWait(mp.validate);
		if (BaseClass.isDisplay(mp.validate)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
