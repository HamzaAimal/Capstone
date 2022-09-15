package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class HomePageObjectA extends Base {
	
	
	private static final WebElement ShoppingCart = null;

	//***************elements********************************************************
	public HomePageObjectA()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//----------------- xpaths and objects---------------------------
	
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")
		private WebElement CurrencyTab;
	
	
	@FindBy(xpath = "//button[text()='€ Euro']")
		private WebElement euro;
	
	@FindBy(xpath = "//p[@class='text-center']")
		private static WebElement infoAboutShoppingCart;
	
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@FindBy(xpath = "//p[@class='text-center']")
	private WebElement infoAboutShoppingCart1;
	
	public void ClickOnCurrency()
	{
		CurrencyTab.click();
	}
	
	public void clickOnEuro1()
	{
		euro.click();
	}
	
	public String cartTtalCurrency()
	{
		String actualResult = infoAboutShoppingCart.getText();
			return actualResult;
	}
	
	public boolean iscartTotalCurrenceyCorrect()
	{
		if (infoAboutShoppingCart.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	//===============methods============================

	public static void clickOnShoppingCart() {
		ShoppingCart.click();
		
	}

	public static Object shoppingCartText() {
		String actualResult = infoAboutShoppingCart.getText();
		return actualResult;
	}

	public static boolean isInfoAboutShoppingCartCorrect() {
		if (infoAboutShoppingCart.isDisplayed())
			return true;
		else
			return false;
	}

}