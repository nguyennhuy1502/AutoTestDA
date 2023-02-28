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

    @FindBy(xpath = "//div[@id = 'dropshipping']")
    public WebElement dropShipping;

    @FindBy(xpath = "//div[contains(@id,'w-node-c6cefc44')]/img")
    public WebElement contentImg;

    @FindBy(xpath = "//div[contains(@id,'w-node-b570ab81')]")
    public WebElement contentDropShipping;

    @FindBy(xpath = "//div[contains(@id,'w-node-b570ab81')]/h2")
    public WebElement contentDropShippingHeader;

    @FindBy(xpath = "//div[contains(@id,'w-node-b570ab81')]/p")
    public WebElement contentDropShippingPa;

    @FindBy(xpath = "//div[contains(@id,'w-node-b570ab81')]/p[2]")
    public WebElement getContentDropShippingBusiness;

    public WebElement contentSmallDetail(String name) {
        return driver.findElement(By.xpath("//div[contains(@class,'small-detail')]/p[contains(text(),'" + name + "')]"));
    }

    public WebElement linkText(String name) {
        return driver.findElement(By.xpath("//div[@class = 'arrow-text']/strong[contains(text(), '" + name + "')]"));
    }



}
