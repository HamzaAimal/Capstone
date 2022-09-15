package stepDefinations;

import org.junit.Assert;

import Core.Base;
import PageObject.HomePageObjectA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.utils;

public class HomePageStepDef extends Base{
	HomePageObjectA homePage = new HomePageObjectA();

	//===============================================================
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.ClickOnCurrency();
		logger.info("User clicked on Currency");

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	   
	}
	@When("User click on Show all desktop")
	public void user_click_on_show_all_desktop() {
	   
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	   
	}




	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEuro1();
		logger.info("User Chose Euro from dropdown");

	}

	@Then("currency value should change to Euro {string}")
	public void currency_value_should_change_to_euro(String expectedCurrency) {
		Assert.assertEquals(homePage.cartTtalCurrency(), expectedCurrency);
		Assert.assertTrue(homePage.iscartTotalCurrenceyCorrect());
		logger.info("Currency value is changed to " + expectedCurrency + " equals to " + homePage.cartTtalCurrency());
		utils.takeScreenShot();
		utils.hardWait();

	}

	//-----------------------------------------------------------------------------------
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		HomePageObjectA.clickOnShoppingCart();
		logger.info("User clicked on shopping cart");

	}

	@Then("{string} message should display")
	public void message_should_display(String expectedInfo) {
		Assert.assertEquals(HomePageObjectA.shoppingCartText(), expectedInfo);
		Assert.assertTrue(HomePageObjectA.isInfoAboutShoppingCartCorrect());
		logger.info(expectedInfo + " equals to " + HomePageObjectA.shoppingCartText() + " - message is displayed");
		utils.takeScreenShot();
		utils.hardWait();

	}

}