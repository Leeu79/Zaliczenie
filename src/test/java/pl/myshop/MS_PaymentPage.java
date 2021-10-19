package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_PaymentPage {
    @FindBy(xpath = "//*[@id=\"payment-option-1-container\"]/label")
    private WebElement paymentMethodCheck;

    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement agreeToTermsCheck;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement continueBtn;

    public MS_PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void pickPaymentAndContinue() {
        paymentMethodCheck.click();
        agreeToTermsCheck.click();
        continueBtn.click();
    }



}
