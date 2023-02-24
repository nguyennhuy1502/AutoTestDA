package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class FooterPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public FooterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(xpath = "//div[@class = 'footer']")
    public WebElement footer;

    @FindBy(xpath = "//div[@class = 'footer']//div[@class ='xpanda']")
    public WebElement footerColumn;


}
