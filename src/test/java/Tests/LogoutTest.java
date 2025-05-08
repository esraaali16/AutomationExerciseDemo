package Tests;

import Data.JsonReader;
import Pages.HomePage;
import Pages.LoginPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LogoutTest extends TestBase{

    HomePage homeObject;
    LoginPage loginObject;


    @Test
    public void Logout() throws IOException, ParseException {
        JsonReader jsonReader = new JsonReader();
        jsonReader.ReadJsonFile();

        homeObject = new HomePage(driver);
        homeObject.clickOnSignupAndLoginLink();

        loginObject = new LoginPage(driver);
        loginObject.LoginSteps(jsonReader.Email, jsonReader.Password);

        homeObject.clickOnLogoutLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/login");
    }
}
