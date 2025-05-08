package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends PageBase{

    public SearchPage(WebDriver driver)
    {
        super(driver);
    }


    private final By SearchTextBox = By.xpath("//input[@class='form-control input-lg']");
    private final By SearchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
    private final By Product = By.xpath("//div[@class='productinfo text-center']");


    public void EnterProductNameInSearchTextBox(String ProductName)
    {
        setText(SearchTextBox,ProductName);
    }
    public void ClickOnSearchButton()
    {
        driver.findElement(SearchButton).click();
    }

    public boolean ProductIsDisplayed()
    {
        return driver.findElement(Product).isDisplayed();
    }

    public void SearchSteps(String ProductName)
    {
        EnterProductNameInSearchTextBox(ProductName);
        ClickOnSearchButton();
    }
}
