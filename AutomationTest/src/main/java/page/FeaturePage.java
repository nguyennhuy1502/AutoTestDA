package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

import java.util.logging.XMLFormatter;

public class FeaturePage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public FeaturePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(xpath = "//div[@class='feature _2 mobile']")
    public WebElement featureMobile;

    @FindBy(xpath = "//div[@id ='the-partner-you-need-to-build-a-profitable-online-business']")
    public WebElement featureWeb;

    @FindBy(xpath = "//div[@class = 'content-title-home-china homepage']")
    public WebElement contentTitleHome;

    @FindBy(xpath = "//div[@class = 'content-title-home-china homepage']/h2")
    public WebElement contentHome;

    @FindBy(xpath = "//div[@class = 'content-title-home-china homepage']/a")
    public WebElement linkText;

    @FindBy(xpath = "//div[contains(@id, 'w-node-afbc51cb')]")
    public WebElement blockTextHighConversion;

    public WebElement headingText(String name) {
        return driver.findElement(By.xpath("//div[contains(@class, 'block-text')]/h3[contains(text(),'" + name + "')]"));
    }

    public WebElement content(String name) {
        return driver.findElement(By.xpath("//div[@class = 'textscroll-wrap']/p[contains(text(),'" + name + "')]"));
    }

    public WebElement checkLink(String name) {
        return driver.findElement(By.xpath("//div[@class = 'textscroll-wrap']/p[contains(text(),'We pre-made')]/a[contains(text(),'" + name + "')]"));
    }

    @FindBy(xpath = "//div[@id='img-scroll-1']")
    public WebElement imageScrollHighConversion;

    @FindBy(xpath = "//div[@id='img-scroll-2']")
    public WebElement imageScrollBuiltIn;
    @FindBy(xpath = "//div[@id='img-scroll-3']")
    public WebElement imageTrendingProduct;
    @FindBy(xpath = "//div[@id='img-scroll-4']")
    public WebElement imageVariousPayment;
}
