package pl.mystore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_MainPage {

    @FindBy(xpath = "//*[@id='_desktop_user_info']/div/a/span")
    private WebElement signInBtn;

    public MS_MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void signIn() {
        signInBtn.click();
   /*
   public MS_AuthPage signIn() {
        signInBtn.click();
        return new MS_AuthPage(driver);
   */
    }
}
