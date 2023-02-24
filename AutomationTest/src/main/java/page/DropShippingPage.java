package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class DropShippingPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public DropShippingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(id = "dropshipping")
    public WebElement dropShipping;

    @FindBy(xpath = "//div[contains(@id,'w-node-c6cefc44')]")
    public WebElement contentImg;

    @FindBy(xpath = "//div[contains(@id,'w-node-b570ab81')]")
    public WebElement contentDropShipping;

    public WebElement linkText(int number) {
        return driver.findElement(By.xpath("//div[contains(@id,'w-node-b570ab81')]/a[" + number + "]"));
    }

}
