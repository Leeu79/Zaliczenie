package pl.mystore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MS_AddressPage {

    @FindBy(xpath = "//*[@id=\"address-link\"]")
    WebElement addressBtn;

    @FindBy(xpath = "//*[@id='content']/div[2]/a")
    WebElement createNewAddressBtn;

    @FindBy(name = "alias")
    WebElement aliasBtn;

    @FindBy(name = "address1")
    WebElement newAddressBtn;

    @FindBy(name = "postcode")
    WebElement postCodeBtn;

    @FindBy(name = "city")
    WebElement cityBtn;

    @FindBy(name = "id_country")
    WebElement countryBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    WebElement phoneBtn;

    @FindBy(xpath = "//*[@id='content']/div/div/form/footer/button")
    WebElement saveBtn;

    public MS_AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }




    public void enterCreateNewAddress () {
        addressBtn.click();
//        this.initElements(driver);
//        createNewAddressBtn.click();
//        this.initElements(driver);
    }
    public void enterAliasAddressZipCityCountryPhoneAndSave(String alias, String address, String city, String zip, String country, String phone) {
        aliasBtn.click();
        aliasBtn.clear();
        aliasBtn.sendKeys(alias);
        newAddressBtn.click();
        newAddressBtn.clear();
        newAddressBtn.sendKeys(address);
        cityBtn.click();
        cityBtn.clear();
        cityBtn.sendKeys(city);
        postCodeBtn.click();
        postCodeBtn.clear();
        postCodeBtn.sendKeys(zip);
        Select countrySelect = new Select(countryBtn);
        countrySelect.selectByVisibleText("United Kingdom");
        countryBtn.click();
        phoneBtn.click();
        phoneBtn.clear();
        phoneBtn.sendKeys(phone);
    }

   /* public MS_RegisteredSuccessfully register() {
        saveBtn.click();
        return new MS_RegisteredSuccessfully(driver);
    */
    public void register () {saveBtn.click();}
    }



