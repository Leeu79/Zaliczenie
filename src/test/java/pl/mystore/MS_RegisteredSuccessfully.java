package pl.mystore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_RegisteredSuccessfully {

    @FindBy (xpath = "//*[@id='notifications']/div/article/ul/li")
    WebElement addressSuccessfullyAddedBtn;

    @FindBy (xpath = "//*[@id='_desktop_user_info']/div/a[2]/span")
    WebElement userNameBtn;

    public MS_RegisteredSuccessfully(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public String getAddressSuccessfullyAdded() {
        return addressSuccessfullyAddedBtn.getText();
    }
    public String getUserName () {
        return userNameBtn.getText();
    }
}
