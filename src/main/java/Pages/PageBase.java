package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    protected static WebDriver driver;
    public Select select;
    public Alert alert;



    public PageBase(WebDriver driver)
    {
        this.driver = driver;

    }

    protected static void setText(By element, String value)
    {
        driver.findElement(element).sendKeys(value);
    }
}
