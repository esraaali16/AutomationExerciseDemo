package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageBase{

    public CheckoutPage(WebDriver driver)
    {
        super(driver);
    }

    private final By ProceedToCheckoutButton = By.xpath("//a[@class='btn btn-default check_out']");
    private final By PlaceOrderButton = By.linkText("Place Order");
    private final By NameOnCardTextBox = By.name("name_on_card");
    private final By CardNumberTextBox = By.name("card_number");
    private final By CVCTextBox = By.name("cvc");
    private final By ExpirationTextBox = By.name("expiry_month");
    private final By YearTextBox = By.name("expiry_year");
    private final By PlaceAndConfirmOrderButton = By.xpath("//button[@class='form-control btn btn-primary submit-button']");
    private final By SuccessMessage = By.xpath("//h2[@class='title text-center']");
    private final By DownloadInvoiceButton = By.xpath("//a[@class='btn btn-default check_out']");

    public void ClickOnProceedToCheckoutButton()
    {
        driver.findElement(ProceedToCheckoutButton).click();
    }

    public void ClickOnPlaceOrderButton()
    {
        driver.findElement(PlaceOrderButton).click();
    }
    public void fillCardInfo(String NameOnCart,String CardNumber,String CVC,String ExpiryMonth,String ExpiryYear)
    {
        setText(NameOnCardTextBox,NameOnCart);
        setText(CardNumberTextBox,CardNumber);
        setText(CVCTextBox,CVC);
        setText(ExpirationTextBox,ExpiryMonth);
        setText(YearTextBox,ExpiryYear);
    }
    public void ClickOnPlaceAndConfirmOrderButton()
    {
        driver.findElement(PlaceAndConfirmOrderButton).click();
    }
    public boolean SuccessMessageIsDisplayed()
    {
        return driver.findElement(SuccessMessage).isDisplayed();
    }
    public void ClickOnDownloadInvoice()
    {
        driver.findElement(DownloadInvoiceButton).click();
    }

    public void CheckoutSteps(String NameOnCart,String CardNumber,String CVC,String ExpiryMonth,String ExpiryYear)
    {
        ClickOnProceedToCheckoutButton();
        ClickOnPlaceOrderButton();
        fillCardInfo(NameOnCart,CardNumber,CVC,ExpiryMonth,ExpiryYear);
        ClickOnPlaceAndConfirmOrderButton();
    }

}
