package Tests;

import Data.JsonReader;
import Pages.ContactusPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContactusTest extends TestBase{

    HomePage homeObject;
    LoginPage loginObject;
    ContactusPage contactusObject;

    @Test
    public void Contactus() throws IOException, ParseException {
        JsonReader jsonReader = new JsonReader();
        jsonReader.ReadJsonFile();

        homeObject = new HomePage(driver);
        homeObject.clickOnSignupAndLoginLink();

        loginObject = new LoginPage(driver);
        loginObject.LoginSteps(jsonReader.Email, jsonReader.Password);

        homeObject.clickOnContactUsLink();

        contactusObject = new ContactusPage(driver);
        contactusObject.fillContactusInfo(jsonReader.Name, jsonReader.Email, jsonReader.Subject
                , jsonReader.Message);
        contactusObject.ClickOnSubmitButton();
        Assert.assertTrue(contactusObject.SuccessMessage());


    }
}
