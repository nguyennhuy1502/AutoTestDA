package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class HeaderPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public HeaderPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);

    }

    public WebElement nameHeader(String name) {
        return driver.findElement(By.xpath("//a[contains(text(), '" + name + "')]"));
    }

    @FindBy(xpath = "//div[contains(@id, 'w-dropdown-toggle-0')]/div[1]")
    public WebElement ecosystem;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-0')]/a[1]")
    public WebElement plusBase;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-0')]/a[2]")
    public WebElement printBase;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-0')]/a[3]")
    public WebElement shopBase;

    @FindBy(xpath = "//div[contains(@id,'w-dropdown-toggle-1')]/div[1]")
    public WebElement whyShopBase;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-1')]/a[1]")
    public WebElement printOnDemand;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-1')]/a[2]")
    public WebElement dropShipping;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-1')]/a[3]")
    public WebElement compareShopBase;
    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-1')]/a[4]")
    public WebElement about;

    public WebElement templates() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Templates')]"));
    }


    @FindBy(xpath = "//div[contains(@id,'w-dropdown-toggle-2')]/div[1]")
    public WebElement resources;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-2')]/a[2]")
    public WebElement blog;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-2')]/a[3]")
    public WebElement apps;

    @FindBy(xpath = "//nav[contains(@id,'w-dropdown-list-2')]/a[4]")
    public WebElement shopBaseNetwork;

    @FindBy(xpath = "//a[contains(text(), 'Pricing')]")
    public WebElement pricing;

    @FindBy(xpath = "//a[contains(text(), 'Login')]")
    public WebElement login;

    @FindBy(xpath = "//div[contains(@class,'div-block-3')]/a")
    public WebElement btnFreeTrial;


    public void dropdownEcosystem() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(ecosystem).build().perform();
        Thread.sleep(1000);
        boolean status = plusBase.isDisplayed();

        if (status) {
            action.moveToElement(plusBase).build().perform();
            action.moveToElement(printBase).build().perform();
            action.moveToElement(shopBase).build().perform();
            Thread.sleep(2000);
        }

    }

    public void dropdownShopbase() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(whyShopBase).build().perform();
        Thread.sleep(3000);
        boolean status = printOnDemand.isDisplayed();
        if (status) {
            action.moveToElement(printOnDemand).build().perform();
            action.moveToElement(dropShipping).build().perform();
            action.moveToElement(compareShopBase).build().perform();
            action.moveToElement(about).build().perform();
        }

    }

    public void dropdownResources() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(resources).build().perform();
        Thread.sleep(3000);
        boolean status = blog.isDisplayed();
        if (status) {
            action.moveToElement(blog).build().perform();
            action.moveToElement(apps).build().perform();
            action.moveToElement(shopBaseNetwork).build().perform();
        }

    }

}
