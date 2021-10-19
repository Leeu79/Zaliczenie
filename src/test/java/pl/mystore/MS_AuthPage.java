package pl.mystore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_AuthPage {

    @FindBy(name = "email")
    private WebElement eMailBtn;
    @FindBy(name = "password")
    private WebElement passwordBtn;
    @FindBy(id = "submit-login")
    private WebElement submitBtn;

    public MS_AuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterEmailAndPasswordAndSubmit(String email, String password) {
        eMailBtn.clear();
        eMailBtn.sendKeys(email);
        passwordBtn.clear();
        passwordBtn.sendKeys(password);
        submitBtn.click();
      /*
      public MS_AddressPage enterEmailAndPasswordAndSubmit(String email, String password) {
      eMailBtn.clear();
      eMailBtn.sendKeys(email);
      passwordBtn.clear();
      passwordBtn.sendKeys(password);
      submitBtn.click();
      return new MS_AddressPage(driver);
       */
    }
}
