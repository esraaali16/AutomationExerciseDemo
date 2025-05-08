package Tests;


import Data.JsonReader;
import Pages.HomePage;
import Pages.SignupPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignupTest extends TestBase{

    HomePage homeObject;
    SignupPage signupObject;

    @Test
    public void Signup() throws IOException, ParseException {
        JsonReader jsonReader = new JsonReader();
        jsonReader.ReadJsonFile();

        homeObject = new HomePage(driver);
        homeObject.clickOnSignupAndLoginLink();
        signupObject = new SignupPage(driver);
        signupObject.SignupSteps(jsonReader.Name,jsonReader.Email,jsonReader.Password,jsonReader.FirstName
        ,jsonReader.LastName, jsonReader.Address, jsonReader.State, jsonReader.City, jsonReader.ZipCode, jsonReader.MobileNumber);
        Assert.assertTrue(signupObject.successMessageIsDisplayed());


    }


}
