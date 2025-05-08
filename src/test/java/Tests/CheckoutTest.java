package Tests;

import Data.JsonReader;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckoutTest extends TestBase{

    HomePage homeObject;
    LoginPage loginObject;
    SearchPage searchObject;
    AddToCartPage cartObject;
    CheckoutPage checkoutObject;

    @Test
    public void Checkout() throws IOException, ParseException {


        JsonReader jsonReader = new JsonReader();
        jsonReader.ReadJsonFile();

        homeObject = new HomePage(driver);
        homeObject.clickOnSignupAndLoginLink();
        loginObject = new LoginPage(driver);
        loginObject.LoginSteps(jsonReader.Email, jsonReader.Password);

        homeObject.clickOnProductsLink();

        searchObject = new SearchPage(driver);
        searchObject.SearchSteps(jsonReader.ProductName);

        cartObject = new AddToCartPage(driver);
        cartObject.AddToCartSteps();

        checkoutObject = new CheckoutPage(driver);
        checkoutObject.CheckoutSteps(jsonReader.Name, jsonReader.CardNumber, jsonReader.CVC
                , jsonReader.Month,jsonReader.Year);
        Assert.assertTrue(checkoutObject.SuccessMessageIsDisplayed());
        checkoutObject.ClickOnDownloadInvoice();

    }
}
