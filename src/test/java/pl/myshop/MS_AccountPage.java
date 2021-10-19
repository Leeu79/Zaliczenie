package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_AccountPage {
    @FindBy(xpath = "//*[@id=\"category-3\"]/a")
    private WebElement storeBtn;
    @FindBy (xpath = "//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")
    private WebElement sweterBtn;

    public MS_AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void goToStore() {
        storeBtn.click();
        sweterBtn.click();
    }
}
