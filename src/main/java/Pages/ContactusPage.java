package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactusPage extends PageBase{

    public ContactusPage(WebDriver driver)
    {
        super(driver);
    }

    private final By NameTextBox = By.name("name");
    private final By EmailTextBox = By.name("email");
    private final By SubjectTextBox = By.name("subject");
    private final By MessageTextBox = By.name("message");
    private final By SubmitButton = By.xpath("//input[@name='submit']");
    private final By SuccessMessage = By.xpath("//div[@class='status alert alert-success']");


    public void fillContactusInfo(String Name,String Email,String Subject, String Message)
    {
        setText(NameTextBox,Name);
        setText(EmailTextBox,Email);
        setText(SubjectTextBox,Subject);
        setText(MessageTextBox,Message);
    }

    public void ClickOnSubmitButton()
    {
        driver.findElement(SubmitButton).click();
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public boolean SuccessMessage()
    {
        return driver.findElement(SuccessMessage).isDisplayed();
    }

}
