package Tests;

import Utilities.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {

    protected WebDriver driver;


    @BeforeMethod
    @Parameters({"BrowserName"})
    public void Setup(@Optional("Chrome Driver") String BrowserName)
    {
        if (BrowserName.equalsIgnoreCase("Chrome Driver"))
        {
            driver = new ChromeDriver();
        } else if (BrowserName.equalsIgnoreCase("FireFox"))
        {
            driver = new FirefoxDriver();
        } else if(BrowserName.equalsIgnoreCase("ie")) {

            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.automationexercise.com/");


    }


    @AfterMethod
    public void tearDown(Method method) throws IOException {
        Util.TakeScreenshot(driver,method.getName());
        driver.quit();
    }

}
