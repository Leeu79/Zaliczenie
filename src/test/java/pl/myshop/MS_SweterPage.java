package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MS_SweterPage {
    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    private WebElement qtyInput;

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    private WebElement sizeInput;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement addToCartBtn;

    public MS_SweterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void chooseQty(String qty) {
        qtyInput.click();
        qtyInput.clear();
        qtyInput.sendKeys(qty);
    }

    public void chooseSize(String size) {
        Select sizeSelect = new Select(sizeInput);
        sizeSelect.selectByVisibleText(size);
    }

    public void addToCart() {
        addToCartBtn.click();
    }
}
