package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_OrderHistoryPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]")
    WebElement userNameBtn;

    @FindBy(xpath = "//*[@id=\"history-link\"]")
    WebElement orderHistoryAndDetailsCheckobox;


    public MS_OrderHistoryPage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void orderHistoryDetails() {
        userNameBtn.click();
        orderHistoryAndDetailsCheckobox.click();
    }
}