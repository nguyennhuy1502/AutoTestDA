package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class EmpoweringPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public EmpoweringPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    public WebElement empoweringPage() {
        return driver.findElement(By.id("empowering"));
    }

    @FindBy(xpath = "//div[contains(@class,'content-empower')]/p")
    public WebElement contentHeader;

    public WebElement boldText(String name) {
        return driver.findElement(By.xpath("//div[contains(@class,'content-empower')]//following::strong[contains(text(),'" + name + "')]"));
    }

    @FindBy(xpath = "//div[contains(@class,'div-block-368')]")
    public WebElement imgEmpowering;

    @FindBy(xpath = "//div[contains(@class,'testiimonial')]")
    public WebElement testIiMoNial;

    public WebElement container(int number) {
        return driver.findElement(By.xpath("//div[contains(@class,'testiimonial')]/div[" + number + "]"));
    }

    @FindBy(xpath = "//div[@class = 'cta-section']")
    public WebElement section;

    public WebElement containerSection(int number) {
        return driver.findElement(By.xpath("//div[@class = 'cta-section']/div[" + number + "]"));
    }

    @FindBy(xpath = "//div[@class = 'cta-section']//following::a[contains(text(),'Get Started')]")
    public WebElement getStart;

    @FindBy(xpath = "//div[@class = 'footer']//following::div[contains(@class, 'footer-grid')]")
    public WebElement layoutFooter;

    public WebElement layoutTitle(int number, String name) {
        return driver.findElement(By.xpath("//div[contains(@class, 'footer-grid')]/div[" + number + "]/div[contains(text(),'" + name + "')]"));
    }

    @FindBy(xpath = "//div[@class = 'footer']//following::div[@class ='legal-block']")
    public WebElement footerLegal;

}
