package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Core.Base;
import PageObject.LaptopNoteBooksPageObjectA;
import PageObject.RetailPageObjectA;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.utils;

public class RetailStepDefinitaion extends Base{
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		logger.info("User is on Retail website");
		utils.hardWait();
	}

	@When("User click on MyAccount")
	public void user_click_on_my_account() {
		RetailPageObjectA.clickOnMyAccount();
		logger.info("User clicked on MyAccount");

	}

	@And("User click on Login")
	public void user_click_on_login_option() {
		RetailPageObjectA.clickOnLogin();
		logger.info("User clicked on Login");

	}

	@And("User enter username {string} and password {string}")
	public void user_enter_user_name_and_password(String email, String pass) {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.enterEmail(email);
		logger.info("User entered the userName: " + email);
		retailPageObjectA.enterPassword(pass);
		logger.info("User entered the password:  " + pass);

	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickOnLoginButton();
		logger.info("User clicked on Login button");

	}

	@Then("User should be logged into MyAccount dashboard")
	public void user_should_be_logged_into_my_account_page() {
		Assert.assertTrue(RetailPageObjectA.myAccountTextIsPresent());
		logger.info("User logged into MyAccount dashboard");
	}

//1 

	@When("User click on {string} link1")
	public void user_click_on_link(String registerAffilateLink) {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickOnRegister();
		logger.info("User clicked on the link");
	}
	

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		
List<Map<String, String>> rewiewInformation = dataTable.asMaps(String.class, String.class);
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.enterCompany(rewiewInformation.get(0).get("company"));
		retailPageObjectA.enterWebSite(rewiewInformation.get(0).get("website"));
		RetailPageObjectA retailPageObjectA2 = new RetailPageObjectA();
		retailPageObjectA2.enteraxId(rewiewInformation.get(0).get("taxID"));
		RetailPageObjectA retailPageObjectA3 = new RetailPageObjectA();
		retailPageObjectA3.selectPayment();
		retailPageObjectA.enterCheckPayee(rewiewInformation.get(0).get("paymentMethod"));
		logger.info("User filled affiliate form and selected payment");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickCheckBoxAboutUs();
		logger.info("User checked on About us check box");

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickOnContinueButton();
		logger.info("User clicked on Continue button");

	}

	@Then("User should see a success message1 {string}")
	public void user_should_see_a_success_message1(String expectedSuccessMessage) {
		Assert.assertEquals(RetailPageObjectA.successMessageRegisterAffilateText(), expectedSuccessMessage);
		Assert.assertTrue(RetailPageObjectA.isSuccessMessagePresentRegisterAffilate());
		logger.info("User see a success message: " + expectedSuccessMessage + " equals to " + RetailPageObjectA.successMessageRegisterAffilateText());
	
		utils.takeScreenShot();
		utils.hardWait();

	}
// 2
	@When("User click on {string} link2")
	public void user_click_on_link_2(String string) {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickOnEditYourAffilateInformationLink();
		logger.info("User clicked on Edit My Affilate Account link");

	}

	@And("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickOnBankTransfer();
		logger.info("User clicked on Bank Transfer radio button");

	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTableBank) {
		List<Map<String, String>> rewiewInformation = dataTableBank.asMaps(String.class, String.class);
		RetailPageObjectA retailPageObjectA5 = new RetailPageObjectA();
		retailPageObjectA5.enterBankName(rewiewInformation.get(0).get("bankName"));
		RetailPageObjectA retailPageObjectA4 = new RetailPageObjectA();
		retailPageObjectA4.enterAbaNumber(rewiewInformation.get(0).get("abaNumber"));
		RetailPageObjectA retailPageObjectA3 = new RetailPageObjectA();
		retailPageObjectA3.enterSwiftCode(rewiewInformation.get(0).get("swiftCode"));
		RetailPageObjectA retailPageObjectA2 = new RetailPageObjectA();
		retailPageObjectA2.enterAccountName(rewiewInformation.get(0).get("accountName"));
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.enterAccountNumber(rewiewInformation.get(0).get("accountNumber"));
		logger.info("User filled Bank information with information");
	}
	
	// 3
	
	@When("User click on {string} link3")
	public void user_click_on_link_3(String string) {
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.clickOnEditYourAccountInformationLink();
		logger.info("User clicked on the link");

	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTableInfo) {
		List<Map<String, String>> rewiewInformations = dataTableInfo.asMaps(String.class, String.class);
		RetailPageObjectA retailPageObjectA = new RetailPageObjectA();
		retailPageObjectA.enterFirstName(rewiewInformations.get(0).get("firstname"));
		RetailPageObjectA retailPageObjectA2 = new RetailPageObjectA();
		retailPageObjectA2.enterLastName(rewiewInformations.get(0).get("lastName"));
		RetailPageObjectA retailPageObjectA3 = new RetailPageObjectA();
		retailPageObjectA3.enterYourEmail(rewiewInformations.get(0).get("email"));
		RetailPageObjectA retailPageObjectA4 = new RetailPageObjectA();
		retailPageObjectA4.enterYourTelephone(rewiewInformations.get(0).get("telephone"));
		logger.info("User modified information");

	}
	
	@Then("User should see this message3 {string}")
	public void user_should_see_this_success_message3(String expectedSuccessMessageAccount) {
		Assert.assertEquals(RetailPageObjectA.successMessageAccount(), expectedSuccessMessageAccount);
		Assert.assertTrue(RetailPageObjectA.isAccountSuccessMessagePresent());
		logger.info("User should see a success message: " + expectedSuccessMessageAccount + " equals to " + RetailPageObjectA.successMessageAccount());
		utils.takeScreenShot();
		utils.hardWait();
		
	}
	//==========================================================================================
	
	@And("User click on product comparison icon on1 {string}")
	public void user_click_on_product_comparison_icon_on1(String compareMacBookIcon) {
		LaptopNoteBooksSD.clickOnCompareMacBook();
		logger.info("User clicked on product comparison icon on MacBook" );
	}
	
	@And("User click on product comparison icon on2 {string}")
	public void user_click_on_product_comparison_icon_on2(String compareMacBookAirIcon) {
		LaptopNoteBooksPageObjectA.clickOnCompareMacBookAir();
		logger.info("User clicked on product comparison icon on MacBook Air");
	}
	
	@Then("User should see a message5 {string}")
	public void user_should_see_a_message5(String expectedCompareSuccessMessage) {
		Assert.assertEquals(LaptopNoteBooksPageObjectA.successMessageCompare(), expectedCompareSuccessMessage);
		Assert.assertTrue(LaptopNoteBooksPageObjectA.isCompareSuccessMessagePresent());
		logger.info("User should see a message: " + expectedCompareSuccessMessage + " equals to " + LaptopNoteBooksPageObjectA.successMessageCompare());
	}
	
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		LaptopNoteBooksPageObjectA.clickOnComparisonLink();
		logger.info("User clicked on Product comparison link");
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(LaptopNoteBooksPageObjectA.isCompareTablePresent());
		logger.info("User see Product Comparison Chart: " + LaptopNoteBooksPageObjectA.comparisonTableName());
		utils.takeScreenShot();
		utils.hardWait();
	}
}