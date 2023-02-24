package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class EmailPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public EmailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    public WebElement titleCentre(){
        return driver.findElement(By.xpath("//div[contains(@class,'title-centre--1')]"));
    }

    public WebElement emailText(){
        return driver.findElement(By.id("#email"));
    }

    public WebElement subscribe(){
        return driver.findElement(By.xpath("//div[contains(@class,'form-2')]/form/input[2]"));
    }

    public WebElement successMessage(){
        return driver.findElement(By.xpath("//div[contains(@class,'success-message')]"));
    }
    public WebElement errorMessage(){
        return driver.findElement(By.xpath("//div[contains(@class,'error-message')]"));
    }



}
