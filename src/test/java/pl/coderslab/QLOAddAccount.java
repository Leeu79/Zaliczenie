package pl.coderslab;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QLOAddAccount {
    private WebDriver driver;

    @Given("an open browser and https:\\/\\/qloapps.coderslab.pl\\/en\\/")
    public void openGoogleSearch() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        // Przejdź do strony QLO
        driver.get("https://qloapps.coderslab.pl/en/");
    }

    @When("I click sign In")
    public void clickSign() {
        driver.findElement(By.className("user_login")).click();
        // Znajdź element do logowania i kliknij
    }

    @And("^I enter email (.*)$")
    public void enterEmail(String email) {
        WebElement inputEmail = driver.findElement(By.className("is_required"));
        inputEmail.sendKeys(email);
        WebElement inputCreate = driver.findElement(By.id("Submit_Create"));
        inputCreate.click();
    }

    @And("^I enter first (.*) second (.*) password(.*)$")
    public void enterFillField(String first, String second, String password) {
        WebElement firstName = driver.findElement(By.name("customer_firstname"));
        firstName.click();
        firstName.sendKeys(first);
        // Wypełnienie pola imie
        WebElement secondName = driver.findElement(By.name("customer_lastname"));
        secondName.click();
        secondName.sendKeys(second);
        // Wypełnienie pola nazwisko
        WebElement inputPassword = driver.findElement(By.id("passwd"));
        inputPassword.click();
        inputPassword.sendKeys(password);
        // Wprowadzenie hasła
        WebElement inputRegistered = driver.findElement(By.name("submitAccount"));
        inputRegistered.click();
    }

    @Then("^see info (.*)$")
    public void accountCreated(String expectedText) {
        System.out.println(expectedText);
    }

    @And("close browsers")
    public void closeBrowser() {
        driver.quit();
    }
}

