package stepDefinations;

import org.junit.Assert;

import Core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.utils;

public class LaptopNoteBooksSD extends Base{
LaptopNoteBooksSD laptopNotebooksPage = new LaptopNoteBooksSD();
	
//	1 
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNotebooksPage.clickOnLaptopsAndNotebooks();
		logger.info("User clicked on Laptop & NoteBook tab");
	}
	
private void clickOnLaptopsAndNotebooks() {
	// TODO Auto-generated method stub
	
}

	@And("User click on Show all Laptop & NoteBook option")
	public void user_clickon_show_all_laptop_note_book_option() {
		laptopNotebooksPage.clickOnShowAllLaptopsAndNotebooksTab();
		logger.info("User clicked on Show all Laptop & NoteBook option");
	}
	
	private void clickOnShowAllLaptopsAndNotebooksTab() {
		// TODO Auto-generated method stub
		
	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNotebooksPage.clickOnMacBook();
		logger.info("User clicked on MacBook item");
	}
	
	private void clickOnMacBook() {
		// TODO Auto-generated method stub
		
	}

	@And("User click add to Cart button2")
	public void user_click_add_to_cart_button() {
		laptopNotebooksPage.clickOnAddToCartButton();
		logger.info("User clicked add to Cart button");
	}
	
	private void clickOnAddToCartButton() {
		// TODO Auto-generated method stub
		
	}

	@Then("User should see a message4 {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(laptopNotebooksPage.successMessage(), expectedSuccessMessage);
		Assert.assertTrue(laptopNotebooksPage.isMacBookSuccessMessagePresent());
		logger.info("User should see a message: " + expectedSuccessMessage + " equals to " + laptopNotebooksPage.successMessage());
	}
	
	private boolean isMacBookSuccessMessagePresent() {
		// TODO Auto-generated method stub
		return false;
	}

	private Object successMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_items_showed_to_the_cart(String expectedTotal) {
		Assert.assertEquals(laptopNotebooksPage.cartTotalValue(), expectedTotal);
		Assert.assertTrue(laptopNotebooksPage.isCartTotalIsPresent());
		logger.info("User should see: " + expectedTotal + " equals to " + laptopNotebooksPage.cartTotalValue() + " - showed to the cart");
	}
	
	private boolean isCartTotalIsPresent() {
		// TODO Auto-generated method stub
		return false;
	}

	private Object cartTotalValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
	  laptopNotebooksPage.clickOnCartButton();
	  logger.info("User clicked on cart option");
	}
	
	private void clickOnCartButton() {
		// TODO Auto-generated method stub
		
	}

	@And("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNotebooksPage.clickOnCartButton();
		logger.info("User clicked on red X button to remove the item from cart");
		utils.hardWait();
	}
	
	@Then("Item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String total) {
		Assert.assertEquals(laptopNotebooksPage.cartTotalValue(), total);
		Assert.assertTrue(laptopNotebooksPage.isCartTotalIsPresent());
		logger.info("Item should be removed and cart should show: " + total + " equals to " + laptopNotebooksPage.cartTotalValue());
		utils.takeScreenShot();
		utils.hardWait();
	}
	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String sonyVaioMessage) {
	laptopNotebooksPage.clickOnsonyVaioAddToWishButton();
	logger.info("User clicked on heart icon to add " + sonyVaioMessage + " laptop to wish list");
	}
	
	private void clickOnsonyVaioAddToWishButton() {
		// TODO Auto-generated method stub
		
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedMessageWishList) {
		Assert.assertEquals(laptopNotebooksPage.messageWishList(), expectedMessageWishList);
		Assert.assertTrue(laptopNotebooksPage.isWishListMessagePresent());
		logger.info("User should get a message: " + expectedMessageWishList + " equals to " + laptopNotebooksPage.messageWishList());
		utils.takeScreenShot();
		utils.hardWait();
	}
	
	private boolean isWishListMessagePresent() {
		// TODO Auto-generated method stub
		return false;
	}

	private Object messageWishList() {
		// TODO Auto-generated method stub
		return null;
	}

	// 4
	@And("User click on {string} item")
	public void user_click_on_item(String macBookProItem) {
		laptopNotebooksPage.clickOnMacBookProItem();
		logger.info("User clicked on MacBook Pro item");
	}
	
	private void clickOnMacBookProItem() {
		// TODO Auto-generated method stub
		
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String expectesMacBookProMessage) {
		Assert.assertEquals(laptopNotebooksPage.macBookProPriceTotal(), expectesMacBookProMessage);
		Assert.assertTrue(laptopNotebooksPage.isMacBookProPriceTotalCorrect());
		logger.info("User should see " + expectesMacBookProMessage + " equals to " + laptopNotebooksPage.macBookProPriceTotal() + " price tag is present on UI.");
		utils.takeScreenShot();
		utils.hardWait();
	}

	private boolean isMacBookProPriceTotalCorrect() {
		// TODO Auto-generated method stub
		return false;
	}

	private Object macBookProPriceTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void clickOnCompareMacBook() {
		// TODO Auto-generated method stub
		
	}
	
	

}
