package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    private final By SignupAndLoginLink = By.cssSelector("a[href='/login']");
    private final By ProductsLink = By.xpath("//i[@class='material-icons card_travel']");
    private final By ContactUsLink = By.xpath("//i[@class='fa fa-envelope']");
    private final By LogoutLink = By.xpath("//i[@class='fa fa-lock']");
    private final By DeleteAccountLink = By.xpath("//i[@class='fa fa-trash-o']");
    private final By DeleteMessage = By.xpath("//h2[@class='title text-center']");
            




    public void clickOnSignupAndLoginLink()
    {
        driver.findElement(SignupAndLoginLink).click();
    }

    public void clickOnProductsLink()
    {
        driver.findElement(ProductsLink).click();
    }

    public void clickOnContactUsLink()
    {
        driver.findElement(ContactUsLink).click();
    }

    public void clickOnLogoutLink()
    {
        driver.findElement(LogoutLink).click();
    }

    public void clickOnDeleteLink()
    {
        driver.findElement(DeleteAccountLink).click();
    }

    public boolean DeleteMessageIsDisplayed()
    {
        return driver.findElement(DeleteMessage).isDisplayed();
    }

}
