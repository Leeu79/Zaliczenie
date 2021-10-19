package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MS_CheckPage {
    @FindBy(xpath = "//*[@id=\"group_1\"]/option[1]")
    private WebElement sizeText;

    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    private WebElement qtyText;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedBtn;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement goToCheckoutBtn;

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement addressContinueBtn;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement paymentMethodContinueBtn;


    public MS_CheckPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

////    public String getSizeText() {
////        String text = sizeText.getText();
////        return text;
////    }
////
////    public String getQtyText() {
////        String text = qtyText.getText();
////        return text;
//    }

    public void proceed() {
        proceedBtn.click();
        goToCheckoutBtn.click();
        addressContinueBtn.click();
        paymentMethodContinueBtn.click();
    }

}
