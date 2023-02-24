package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class BetterDropShippingPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public BetterDropShippingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(xpath = "//div[contains(@id,'better-dropshipping')]")
    public WebElement betterDropShipping;

    public WebElement layoutBDP(int number) {
        return driver.findElement(By.xpath("//div[contains(@id,'better-dropshipping')]//div[contains(@class, 'homepage')]/div[" + number + "]"));
    }

    public WebElement buttonStart(int number) {
        return driver.findElement(By.xpath("//div[contains(@id,'better-dropshipping')]//a[" + number + "]"));
    }
}
