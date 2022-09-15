package stepDefinations;
import java.io.IOException;
import Core.Base;
import PageObject.DesktopPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.utils;

public class DeskTopStepDefination extends Base {
	DesktopPageObject desktopObject = new DesktopPageObject ();
	
//--------------First Scenario----------------------
//	@Given("User is on Retail website")
//	public void user_is_on_retail_website () throws IOException
//	{
//		DesktopPageObject.validateHomePageObjecgt();
//		logger.info("User is on test envioment!!!");
//		utils.takeScreenShot();
//		
//	}
	
	
	@When("User click on Desktops tabb")
	public void user_click_on_desktops_tabb()
	{
		desktopObject.ClickOnDesktopOnNav();
		logger.info("User has click on desktop navigatoin");
	}
	
	
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops()  {
		desktopObject.ClickOnShowAllDesktop();
		logger.info("user clicked on Show all Desktops");
		
	}
	@Then("User should see all items are present in Desktop pagee")
	public void user_should_see_all_items_are_present_in_desktop_pagee() throws IOException
	{
		desktopObject.confirmAllItemArePresent();
		logger.info("Verified All ithem are presented on the desktop page. ");
		utils.takeScreenShot("show all items");
	}
		//==========================================================================
		
		@And("User click  ADD TO CART option on â€˜HP LP3065â€™ item")
		public void user_click_add_to_cart_option_on_HPLP3064_item()
		{
			desktopObject.AddHPLPtoCart();
			logger.info("User lciked on the cart optioin for HP LP3065");
		}
		
		@And("User select quantity 1")
		public void user_select_quantity1()
		{
			desktopObject.selectQuantity();
			logger.info("user has selected 1 as quantity for HP labtop. ");
		}
		
		@And("User click add to Cart button")
		public void user_click_add_to_cart_button()
		{
			desktopObject.addToCartFinal();
			logger.info("verified! user clicked on cart button. ");
		}
				
		@Then("User should see a message â€˜Success: you have added HP LP 3065 to your Shopping cart!â€™")
		public void user_should_see_a_message_success() throws IOException
		{
			desktopObject.successMessageHPLP();
			logger.info("Success message has successfully apperead. ");
			
		}
		//**************************************************************************************
			
			@And("User click  ADD TO CART option on â€˜Canon EOS 5Dâ€™ item")
			public void user_click_add_to_cart_option_for_cannon()
			{
				desktopObject.addCanonEOS5DtoCart();
				logger.info("User add cannon to cart");
			}
			
			@And("User select color from dropdown â€˜Redâ€™")
			public void user_select_color_from_dropdown_red()
			{
				desktopObject.selectCanonColor();
				logger.info("user selected canon color");
			}
			
			@And("User select quantity 1 canon")
			public void user_select_canon_quantity()
			{
				desktopObject.selectCanonQty();
				logger.info("user seleconted quantity");
			}
			
			@And("User click add to Cart button canon")
			public void user_add_to_cart_button_cannon()
			{
				desktopObject.canonAddToCartBtn();
				logger.info("user add to cart labtop");
			}
			
			@Then("User should see a message â€˜Success: You have added Canon EOS 5D to your shopping cart!â€™")
			public void user_should_see_message_cannon_add_to_shopping_success_message() throws IOException
			{
				desktopObject.canonSuccessMessage();
				logger.info("success message on screen");
				utils.takeScreenShot("ScreenshotDesktop");
			}
		//________________________________________________________________________________________
				
				@And("User click on Canon EOS 5D item")
				public void user_click_on_canon_d_item()
				{
					desktopObject.clickOnCanonToAddReview();
					logger.info("user lcik on cannon to add revviowe");
				}
				
				@And("User click on write a review link")
				public void user_click_on_write_a_review_link()
				{
					desktopObject.clickOnWriteAReview();
					logger.info("user lcik on wriete a revioew link");
				}
				
				@And("User fill the review information with below information")
				public void user_fill_the_review_information_with_below_information_review() 
				{
					desktopObject.inputName();
					desktopObject.inputReviewBox();
					desktopObject.inputRating();
					logger.info("Name, reviewo and rating has filled successfullly. ");
				}
				
				@And("User click on Continue Button Review")
				public void user_click_on_continue_buton_add_review()
				{
					desktopObject.reviewContinueButton();
					logger.info("Verified user hit conityen button ");
				}
				
				@Then("User should see a message with â€˜Thank you for your review. It has been submitted to the webmaster for approval.'")
				public void user_should_see_success_message_to_add_revewio_for_cannon() throws IOException
				{
					
					desktopObject.thankYouMessageCanon();
					logger.info("Verified result is mathcing. ");
					utils.takeScreenShot("ScreenshotReview");

				}
}