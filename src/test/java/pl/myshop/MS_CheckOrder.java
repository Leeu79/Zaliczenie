package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_CheckOrder {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")
    private WebElement priceBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[1]/td[4]/span")
    private WebElement informationBtn;

    public MS_CheckOrder(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String checkPrice() {
        String text = priceBtn.getText();
        return text;
    }

    public String checkInformation() {
        String text = informationBtn.getText();
        return text;
    }
}