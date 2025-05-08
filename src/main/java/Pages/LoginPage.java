package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    private final By EmailTextBox = By.xpath("//input[@data-qa='login-email']");
    private final By PasswordTextBox = By.name("password");
    private final By LoginButton = By.cssSelector("button[data-qa='login-button']");
    public final By LoggedIn = By.xpath("//i[@class='fa fa-user']");



    public void fillLoginInfo(String Email,String Password)
    {
        setText(EmailTextBox,Email);
        setText(PasswordTextBox,Password);
    }

    public void clickOnLoinButton()
    {
        driver.findElement(LoginButton).click();
    }

    public boolean loggedInIsDisplayed()
    {
        return driver.findElement(LoggedIn).isDisplayed();
    }


    public void LoginSteps(String Email,String Password)
    {
        fillLoginInfo(Email,Password);
        clickOnLoinButton();
    }
}
