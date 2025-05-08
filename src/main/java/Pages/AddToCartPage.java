package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends PageBase{

    public AddToCartPage(WebDriver driver)
    {
        super(driver);
    }


    private final By ViewProduct = By.xpath("//i[@class='fa fa-plus-square']");
    private final By AddToCartButton = By.xpath("//button[@class='btn btn-default cart']");
    private final By ViewCartLink = By.linkText("View Cart");
    private final By ShoppingCart = By.xpath("//li[@class='active']");


    private final By YourNameCheckBox = By.id("name");
    private final By EmailAddressCheckBox = By.id("email");
    private final By ReviewMessage = By.id("review");
    private final By SubmitButton =By.xpath("//button[@class='btn btn-default pull-right']");

    private final By ProcessToCheckoutButton = By.xpath("//a[@class='btn btn-default check_out']");




    public void ClickOnViewProduct()
    {
        driver.findElement(ViewProduct).click();
    }

    public void ClickOnAddToCartButton()
    {
        driver.findElement(AddToCartButton).click();
    }

    public void ClickOnViewCartLink()
    {
        driver.findElement(ViewCartLink).click();
    }

    public boolean ShoppingCartIsDisplayed()
    {
        return driver.findElement(ShoppingCart).isDisplayed();
    }


    public void AddToCartSteps()
    {
        ClickOnViewProduct();
        ClickOnAddToCartButton();
        ClickOnViewCartLink();
    }


    public void fillReviewInfo(String Name,String Email, String Message)
    {
        setText(YourNameCheckBox, Name);
        setText(EmailAddressCheckBox,Email);
        setText(ReviewMessage,Message);
    }
    public void ClickOnSubmitButton()
    {
        driver.findElement(SubmitButton).click();
    }



    public void AddReviewSteps(String Name,String Email, String Message)
    {
        fillReviewInfo(Name,Email,Message);
        ClickOnSubmitButton();
    }
}
