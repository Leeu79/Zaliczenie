package pl.mystore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MS_NewAddressAddedSteps {

    private WebDriver driver;

    @Given("^User is on the MyStore Website$")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?");
    }

    @When("^User logged in by email (.*) and password (.*) MyStore Website and go to address page$")
    public void loggedIn(String email, String password) {
        MS_MainPage mainPage = new MS_MainPage(driver);
      /*
        MS_AuthPage authPage = mainPage.signIn();
       */
        mainPage.signIn();
        MS_AuthPage authPage = new MS_AuthPage(driver);
        authPage.enterEmailAndPasswordAndSubmit(email, password);
    }

    /*
    MS_AddressPage addressPage = authPage.enterEmailAndPasswordAndSubmit("maksym79@gmail.com", "kapsel");
     */
    @And("^User adds his new address data: alias (.*), address (.*) , city (.*), zip (.*), country (.*), phone (.*) and saves new address data$")
    public void addNewAddress(String alias, String address, String city, String zip, String country, String phone) {
        MS_AddressPage addressPage = new MS_AddressPage(driver);
        addressPage.enterCreateNewAddress();
        addressPage.enterAliasAddressZipCityCountryPhoneAndSave(alias, address, city, zip, country, phone);

        /*
        addressPage.enterAliasAddressZipCityCountryPhoneAndSave( "mlody", "balzaka", "01-922", "Warsaw", "Poland","501100100");

         */

        addressPage.register();
    }

    /*
    MS_RegisteredSuccessfully registeredSuccessfully = addressPage.register();
    */
    @Then("^New address data added successfully$")
    public void checkRegister() {
        MS_RegisteredSuccessfully registeredSuccessfully = new MS_RegisteredSuccessfully(driver);
        Assert.assertEquals("Address successfully added!", registeredSuccessfully.getAddressSuccessfullyAdded());
        Assert.assertEquals("piotr mak", registeredSuccessfully.getUserName());
    }

    @And("^close browser$")
    public void tearDown() {
        driver.quit();
    }
}

