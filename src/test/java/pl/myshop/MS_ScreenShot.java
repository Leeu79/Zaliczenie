package pl.myshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MS_ScreenShot {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")
    private WebElement priceBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[1]/td[4]/span")
    private WebElement informationBtn;

    public MS_ScreenShot (WebDriver driver) { PageFactory.initElements(driver, this); }

}
