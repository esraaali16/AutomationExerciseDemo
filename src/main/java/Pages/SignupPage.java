package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends PageBase{

    public SignupPage(WebDriver driver)
    {
        super(driver);
    }


    private final By NameTextBox = By.name("name");
    private final By EmailAddressTextBox = By.xpath("//input[@data-qa='signup-email']");
    private final By SignupButton = By.cssSelector("button[data-qa='signup-button']");
    private final By TitleCheckBox = By.id("id_gender2");
    private final By PasswordTextBox = By.id("password");
    private final By Day = By.id("days");
    private final By month = By.id("months");
    private final By year = By.id("years");
    private final By SignupCheckBox = By.id("newsletter");
    private final By ReceiveCheckBox = By.id("optin");
    private final By FirstNameTextBox = By.id("first_name");
    private final By LastNameTextBox = By.id("last_name");
    private final By AddressTextBox = By.id("address1");
    private final By Country = By.id("country");
    private final By StateTextBox = By.id("state");
    private final By CityTextBox = By.id("city");
    private final By ZipCodeTextBox = By.id("zipcode");
    private final By MobileNumberTextBox = By.id("mobile_number");
    private final By CreateAccountButton = By.xpath("//button[@class='btn btn-default']");
    public final By successMessage = By.xpath("//h2[@class='title text-center']");



    public void fillNameAndEmail(String Name,String Email)
    {
        setText(NameTextBox,Name);
        setText(EmailAddressTextBox,Email);
    }

    public void clickOnSignupButton()
    {
        driver.findElement(SignupButton).click();
    }

    public void clickOnTitleCheckBox()
    {
        driver.findElement(TitleCheckBox).click();
    }

    public void fillPassword(String password)
    {
        setText(PasswordTextBox,password);
    }

    public void SelectDateOfBirth()
    {
        select = new Select(driver.findElement(Day));
        select.selectByVisibleText("10");
        select = new Select(driver.findElement(month));
        select.selectByVisibleText("May");
        select = new Select(driver.findElement(year));
        select.selectByVisibleText("2021");
    }

    public void clickOnSignUpCheckBox()
    {
        driver.findElement(SignupCheckBox).click();
    }

    public void clickOnReceiveCheckBox()
    {
        driver.findElement(ReceiveCheckBox).click();
    }

    public void fillFirstNameAndLastNameAndAddress(String firstname, String lastname, String address)
    {
        setText(FirstNameTextBox, firstname);
        setText(LastNameTextBox, lastname);
        setText(AddressTextBox, address);

    }

    public void SelectCountry()
    {
        select = new Select(driver.findElement(Country));
        select.selectByVisibleText("Canada");
    }

    public void fillSignupInfo(String state, String city,String zipcode, String mobilenumber){
        setText(StateTextBox,state);
        setText(CityTextBox,city);
        setText(ZipCodeTextBox,zipcode);
        setText(MobileNumberTextBox,mobilenumber);
    }



    public void clickOnCreateAccountButton()
    {
        driver.findElement(CreateAccountButton).click();
    }

    public void SignupSteps(String Name,String Email,String password,String firstname, String lastname, String address
            , String state, String city,String zipcode, String mobilenumber)
    {
        fillNameAndEmail(Name,Email);
        clickOnSignupButton();
        clickOnTitleCheckBox();
        fillPassword(password);
        SelectDateOfBirth();
        clickOnSignUpCheckBox();
        clickOnReceiveCheckBox();
        fillFirstNameAndLastNameAndAddress(firstname,lastname,address);
        fillSignupInfo(state,city,zipcode,mobilenumber);
        SelectCountry();
        clickOnCreateAccountButton();
    }

    public boolean successMessageIsDisplayed()
    {
        return driver.findElement(successMessage).isDisplayed();
    }

}
