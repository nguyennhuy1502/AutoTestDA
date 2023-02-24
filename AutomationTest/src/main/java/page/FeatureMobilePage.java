package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class FeatureMobilePage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public FeatureMobilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(xpath = "//div[@class='feature _2 mobile']")
    public WebElement FeatureMobile;

    @FindBy(xpath = "//div[@class = 'content-title-home-china _2']")
    public WebElement contentTitleHome;

    @FindBy(xpath = "//div[contains(@id,'w-node-_631bbeac')]")
    public WebElement contentHeading;

    @FindBy(xpath = "//div[@class = 'content-image-2']/img[@src = 'https://assets-global.website-files.com/5e941e9c459693aeff757d94/61b6fb50cc5bf183422a1726_shopbase-home-mobile-1.png']")
    public WebElement contentImage2;

    @FindBy(xpath = "//div[@class = 'content-image-2']/img[@src = 'https://assets-global.website-files.com/5e941e9c459693aeff757d94/61b6fb6eeb7e8a73228a2e49_shopbase-home-mobile-2.png']")
    public WebElement contentImage;

    @FindBy(xpath = "//div[contains(@id,'w-node-_99d16550')]")
    public WebElement contentHeading1;

    @FindBy(xpath = "//div[@class = 'content-image-2']/img[@src = 'https://assets-global.website-files.com/5e941e9c459693aeff757d94/61b6fb7dc6d1cc1b25cb6fc5_shopbase-home-mobile-3.png']")
    public WebElement contentImage3;

    @FindBy(css = "#w-node-c958ffd7")
    public WebElement contentHeading2;

    @FindBy(css = "#feature _3 mobile")
    public WebElement featureMobile3;

    @FindBy(xpath = "//div[@class = 'content-image-2']/img[@src = 'https://assets-global.website-files.com/5e941e9c459693aeff757d94/61b6fb87403cc3fea8c73b32_shopbase-home-mobile-4.png']")
    public WebElement contentImage4;

    @FindBy(css = "#w-node-_2686a80a")
    public WebElement contentHeading3;

    @FindBy(css = "#arrow-text")
    public WebElement ViewFeatures;
}
