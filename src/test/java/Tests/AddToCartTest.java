package Tests;

import Data.JsonReader;
import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartTest extends TestBase{

    HomePage homeObject;
    LoginPage loginObject;
    SearchPage searchObject;
    AddToCartPage cartObject;

    @Test
    public void AddToCart() throws IOException, ParseException {
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
        Assert.assertTrue(cartObject.ShoppingCartIsDisplayed());
    }
}
