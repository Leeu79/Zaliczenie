package pl.myshop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MS_BySweterSteps {

    private WebDriver driver;

    @Given("^User is on the MyStore Web$")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?");
    }

    @When("^User logged in by email (.*) and password (.*) MyStore Website$")
    public void loggedIn(String email, String password) {
        MS_MainPage mainPage = new MS_MainPage(driver);
        mainPage.signIn();
        MS_AuthPage authPage = new MS_AuthPage(driver);
        authPage.enterEmailAndPasswordAndSubmit(email, password);
    }

    @And("^User goes to store and choose sweter$")
    public void goToStore() {
        MS_AccountPage accountPage = new MS_AccountPage(driver);
        accountPage.goToStore();
    }

    @And("^User defines sweter quantity (.*) and size (.*) and adds to cart$")
    public void addSweter(String quantity, String size) {
        MS_SweterPage sweterPage = new MS_SweterPage(driver);
        sweterPage.chooseQty(quantity);
        sweterPage.chooseSize(size);
        sweterPage.addToCart();
    }

    @And("^Check if (.*) and (.*) are correctly added$")
    public void checkQtyAndSize(String quantity, String size) {
        MS_CheckPage checkPage = new MS_CheckPage(driver);
//        Assert.assertEquals("&nbsp;"+quantity,checkPage.getQtyText());
//        Assert.assertEquals(": "+size,checkPage.getSizeText());
    }

    @And("^Proceed to checkout page$")
    public void proceed() {
        MS_CheckPage checkPage = new MS_CheckPage(driver);
        checkPage.proceed();
    }

    @And("^Pick payment method and proceed$")
    public void pickPaymentAndContinue() {
        MS_PaymentPage paymentPage = new MS_PaymentPage(driver);
        paymentPage.pickPaymentAndContinue();
    }
    @And("^User takes a screen of the order$")
    public void screenShot() {

    }

    @And("^The user goes to the order history$")
    public void goesToOrderHistory (){
        MS_OrderHistoryPage orderHistory = new MS_OrderHistoryPage(driver);
        orderHistory.orderHistoryDetails();
    }

    @Then("^User check order price (.*) and information (.*)$")
    public void checkOrder (String price, String information) {
        MS_CheckOrder checkOrder = new MS_CheckOrder(driver);
        Assert.assertEquals(price,checkOrder.checkPrice());
        Assert.assertEquals(information,checkOrder.checkInformation());
    }
    @And("^close shop browser$")
    public void tearDown() {
        driver.quit();
    }
}

