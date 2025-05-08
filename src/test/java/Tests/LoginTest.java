package Tests;

import Data.JsonReader;
import Pages.HomePage;
import Pages.LoginPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase{

    HomePage homeObject;
    LoginPage loginObject;

    @Test
    public void Login() throws IOException, ParseException {
        JsonReader jsonReader = new JsonReader();
        jsonReader.ReadJsonFile();

        homeObject = new HomePage(driver);
        homeObject.clickOnSignupAndLoginLink();

        loginObject = new LoginPage(driver);
        loginObject.LoginSteps(jsonReader.Email, jsonReader.Password);
        Assert.assertTrue(loginObject.loggedInIsDisplayed());
    }
}
