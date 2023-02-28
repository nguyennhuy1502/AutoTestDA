package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class PrintOnDemand {
    WebDriver driver;
    private ElementUtils elementUtils;

    public PrintOnDemand(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(css = "#print-on-demand")
    public WebElement printOnDemand;

    @FindBy(xpath = "//div[contains(@class,'detail-feature _2')]")
    public WebElement detailFeaturePOD;

    @FindBy(xpath = "//div[contains(@id,'w-node-_08839277')]")
    public WebElement imagePOD;
}
